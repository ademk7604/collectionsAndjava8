package d06_SetLab1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Driver2 {
	public static void main(String[] args) {
		// kullanici -1 girene kadar girilen sayialri listin icine dolduralim
		Scanner scanner = new Scanner(System.in);
		System.out.print("cikmak icin -1 giriniz : ");
		LinkedHashSet<Integer> integers = new LinkedHashSet<Integer>();
		int i = 0;
		while ((i = scanner.nextInt()) != -1) {
			integers.add(i);
		}
		System.out.println(integers.size());
		Iterator<Integer> iterator = integers.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

	}

}
