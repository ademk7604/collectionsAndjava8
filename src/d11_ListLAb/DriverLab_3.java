package d11_ListLAb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class DriverLab_3 {
	public static void main(String[] args) {
		/*
		 * Bilet bilet = new Bilet(1, new Date(), 25.0f); Koltuk koltuk = new Koltuk(1,
		 * bilet); System.out.println(koltuk);
		 */

		Random random = new Random();
		ArrayList<Bilet> biletList = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			Bilet bilet = new Bilet(random.nextInt(1000), new Date(), random.nextFloat() * 100);
			biletList.add(bilet);
		}
		/*
		 * Iterator<Bilet> iterator = biletList.iterator(); while(iterator.hasNext()) {
		 * Bilet bilet = iterator.next(); System.out.println(bilet); }
		 */

		ArrayList<Koltuk> koltukListesi = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int secim = 0;
		int koltukNumarasi = 0;
		System.out.print("Lutfen Secim Yapniz (1 Bilet Al), (0 Cikis Yap): ");
		while ((secim = scanner.nextInt()) != 0) {
			Bilet bilet = biletList.get(random.nextInt(biletList.size()));
			biletList.remove(bilet);
			Koltuk koltuk = new Koltuk(++koltukNumarasi, bilet);
			koltukListesi.add(koltuk);
			System.out.println(koltuk);

			System.out.print("Lutfen Secim Yapniz (1 Bilet Al), (0 Cikis Yap): ");
		}
		scanner.close();

		System.out.println("Satilan Bilet sayisi: " + koltukListesi.size());
		Iterator<Koltuk> iterator = koltukListesi.iterator();
		while (iterator.hasNext()) {
			Koltuk koltuk = iterator.next();
			System.out.println(koltuk);
		}
	}

}
