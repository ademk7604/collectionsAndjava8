package d21_FunctionalInterface2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Driver {
	public static void main(String[] args) {
		/*
		 * Supplier<Urun> supplier = new Supplier<Urun>() {
		 * 
		 * @Override public Urun get() { Urun urun = new Urun(1, "Laptop", 1000); return
		 * urun; } };
		 * 
		 * System.out.println(supplier.get());
		 */

		/*
		 * Supplier<Urun> supplier = () -> new Urun(1, "Laptop", 1000); // Lambda exp.
		 * varsayilan olarak geriye return dondurdugu icin return // kullanmiyoruz
		 * System.out.println(supplier.get());
		 */

		// Lambda exp. eger kullancagimiz satir sayisi 1 den fazla ise {} kullaniyoruz
		// {} icendeki kullanimda return zorunlu hale gelmektedir
		Supplier<List<Urun>> supplier = () -> {
			List<Urun> list = new ArrayList<>();
			list.add(new Urun(1, "Laptop", 1000));
			list.add(new Urun(2, "Cep Telefonu", 600));
			list.add(new Urun(3, "Klavye", 100));
			return list;
		};

		System.out.println(supplier.get());
		System.out.println("--------");

		// bu sekilde consumer ile yaptiginda buyun urunleri tek tek ekrana basar
		supplier.get().forEach((u) -> System.out.println(u));

	}

}
