package d07_SetLab2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SortedSet<Student> sortedSet = new TreeSet<Student>();
		System.out.print("ogrenci eklemek iicin (E) uygulamadan cikmak icin (X) ");
		String line = null;
		while ((line = scanner.nextLine()).equals("E")) {
			System.out.print("Numara: ");
			int numara = Integer.parseInt(scanner.nextLine());
			System.out.print("isim: ");
			String isim = scanner.nextLine();
			System.out.println("Soyisim: ");
			String soyisim = scanner.nextLine();
			System.out.println("Sinif: ");
			String sinif = scanner.nextLine();
			sortedSet.add(new Student(numara, isim, soyisim, sinif));
			System.out.print("ogrenci eklemek iicin (E) uygulamadan cikmak icin (X) ");
		}
		System.out.println("Toplam Ogrenci sayisi: "+sortedSet.size());
		Iterator<Student> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
