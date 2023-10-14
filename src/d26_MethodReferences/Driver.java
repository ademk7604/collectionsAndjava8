package d26_MethodReferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Driver {
	/*
	 * Farkli tip method referanslari bulunur 1) Statik Methoda Referans 2) Instance
	 * Methoda Referans 3) Yapici Referans Sinifismi:: metotismi seklinde kullanilir
	 */
	// 1) Statik Methoda Referans
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(6);

		// arrayList.forEach((i) -> System.out.println(i));

		// out ve println methodlari statictir
		// arrayList.forEach(System.out::println);

		/*
		 * 2) Instance Methoda Referans Belirli bir nesne uzerindeki instance metoda
		 * nesne referansiin gecirilmesi saglanabilir nesne Referansi::metotismi
		 */

		ArrayList<Bisiklet> bisiklets = new ArrayList<>();
		bisiklets.add(new Bisiklet("X Marka", 8));
		bisiklets.add(new Bisiklet("Y Marka", 3));
		bisiklets.add(new Bisiklet("Z Marka", 21));
		bisiklets.add(new Bisiklet("Q Marka", 18));

		Collections.sort(bisiklets, new BisikletKarsilastirici());

		bisiklets.forEach((b) -> System.out.println(b));
		System.out.println("-----------");
		bisiklets.forEach(System.out::println);

		System.out.println("Simdi Collections.sort du method referans ile kullanalim");

		BisikletKarsilastirici bisikletKarsilastirici = new BisikletKarsilastirici();
		Collections.sort(bisiklets, bisikletKarsilastirici::compare);
		bisiklets.forEach(System.out::println);

		/*
		 * 3) Yapici Referans SinifIsmi::new metot referanslarinda oldugu gibi yapiciya
		 * da referans geciriulebilir.
		 * 
		 */
		List<String> markalar = new ArrayList<>();
		markalar.add("X1 Marka");
		markalar.add("Z1 Marka");
		markalar.add("Y1 Marka");

		List<Bisiklet> bisikletler = markalar.stream().map(new Function<String, Bisiklet>() {

			@Override
			public Bisiklet apply(String t) {

				return new Bisiklet(t);
			}

		}).collect(Collectors.toList());

		bisikletler.forEach((bs) -> System.out.println(bs));

		// Bunun yerine YAPICI referans method kullanalim simdi
		System.out.println("**********");
		List<Bisiklet> bisiklets2 = markalar.stream().map(Bisiklet::new).collect(Collectors.toList());
		// Burda aslinda Bisiklet::new ile bisiklet clasindaki tek parametreli methodunu
		// kullanmis oluyoruz
		bisiklets2.forEach(System.out::println);

	}

}
