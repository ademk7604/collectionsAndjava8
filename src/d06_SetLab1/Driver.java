package d06_SetLab1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		//set yapisindan bir sayisal loto olusturulacak
		Scanner scanner = new Scanner(System.in);
		System.out.print("Satir sayisi: ");
		int satirSayisi = scanner.nextInt();
		System.out.print("Sutun sayisi: ");
		int sutunSayisi = scanner.nextInt();
		SortedSet<Integer> integers = new TreeSet<Integer>();
		for (int i = 0; i < sutunSayisi; i++) {
		doldur(integers, sutunSayisi);
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		System.out.println();
		}
	}

	public static void doldur(SortedSet<Integer> integers, int sutunSayisi) {
		integers.clear();
		Random random = new Random();
		while(integers.size() < sutunSayisi) {
			int sayi = random.nextInt(49)+1;
			integers.add(sayi);
		}
		
	}

}
