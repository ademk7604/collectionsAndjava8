package d22_FunctionalInterfaceLab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(1, "Ali Can", 75));
		students.add(new Student(2, "Burak Can", 95));
		students.add(new Student(3, "kemal Can", 80));
		students.add(new Student(0, "Goktug Sancak", 70));

		students.forEach((o) -> System.out.println(o));
		System.out.println("------------");

		// peki ogrencileri siralamak istersek ne yapacagiz Coll sort

		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getNumara() - o2.getNumara();
			}
		});

		students.forEach((s) -> System.out.println(s));
		System.out.println("********");

		// lambda ile yapalim
		// birde not siralamalarina gore siralayalim
		Collections.sort(students, (a, b) -> a.getNotOrtalamasi() - b.getNotOrtalamasi());
		students.forEach((s) -> System.out.println(s));
		System.out.println("++++++++++");

		// isme gore siralayalim String oldugu icin compareTo kullaniyoruz
		Collections.sort(students, (a, b) -> a.getAd().compareTo(b.getAd()));
		students.forEach((s) -> System.out.println(s));
		System.out.println("$$$$$$$$$$$$$");

		// buyukten kucuge gore alfabetik siralayacaksak ab yerlerini degistirmek lazim
		Collections.sort(students, (a, b) -> b.getAd().compareTo(a.getAd()));
		students.forEach((s) -> System.out.println(s));
	}

}
