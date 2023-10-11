package d20_FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {
	public static void main(String[] args) {
		/*
		 * Matematik matematik = new Matematik() {
		 * 
		 * @Override public void islem(double a, double b) { System.out.println(a+b);
		 * 
		 * } };
		 */

		// Bizim icn function intefacelerin anlami lambda expressionlar kullanmak icin
		// olusturulan arayuzlerdir
		// veya lambda ile bu sekilde kisa yoldan
		Matematik matematik = (x, y) -> System.out.println(x + y);
		

		matematik.islem(10, 20);
		Matematik matematik2 = (x, y) -> System.out.println(x - y);
		matematik2.islem(55, 10);

		// java nin JDK si ile gelen function intefmaceleri kullanalim simdi
		ArrayList<String> sehirler = new ArrayList<>();
		sehirler.add("Bursa");
		sehirler.add("Istanbul");
		sehirler.add("Ankara");
		sehirler.add("Izmir");
		sehirler.add("Kayseri");

		sehirler.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);

			}
		});
		System.out.println("--------");
		// Consumer tuketici
		sehirler.forEach((s) -> System.out.println(s));

		System.out.println("***********");

		// Predicate' in amaci kendisine verilen degeri bir kosul icerisinde
		// degerlendidikten sonra boolean bir deger dondurmektir.
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.startsWith("B");
			}
		};
		
		// veya lambda ile daha kisa bir sekilde yapariz
		Predicate<String> predicate2 = (s) -> s.startsWith("I");
		
		for (int i = 0; i < sehirler.size(); i++) {
			String sehir = sehirler.get(i);
			if (predicate2.test(sehir)) {
				System.out.println(sehir);
			}
		}

	}

}
