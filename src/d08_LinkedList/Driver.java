package d08_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Driver {
	/*
	 * Collection arayzunden turemistir
	 * Collection > List> ArrayList, Vektor, LinkedList, Stack dan olusur
	 * unique, essiz olmayan nesneleri icerebilir
	 * elemanlarin bulundugu yerler degisebilir
	 * null elementlere musade etmez
	 * ArrayList daha cok cagirma, da az silme icin kullanilir
	 * LinkedList daha cok silme, daha az cagirma icin kullanilir
	 * Stack ve Vektor siniflari miras siniflari olarak degerlendirilmektedir. Gunumuzde pek kullanilmaktadirlar
	 * collection sinifi ortaya ciktiginda artik kullanilmaya baslanmistir
	 */
	/*
	 * LinkedList Sinifi
	 * AbstractSequentialList sinifindan kalitim almistir. ve List, Deque ve Queue arayuzlerini imlemente eder.
	 * Depolamak icin agac kullanan koleksiyon yaratir
	 * Depoladigi elementleri artan siraya sirali olarak kaydeder.
	 */
	public static void main(String[] args) {
		
		LinkedList<Integer> integers = new LinkedList<>();
		integers.add(10);
		integers.add(20);
		integers.add(30);
		integers.add(20);
		
		integers.add(2,55); // ikinci index e 55 elemanina ekliyorum. sonraki gelenler bir saga kaydiriliyor
		System.out.println("Eleman sayisi: "+integers.size());
		
		Iterator<Integer> iterator = integers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // ekleme sirasina gore geliyor
		}
		System.out.println("----");
		
		System.out.println(integers.get(0)); // listedeki istedigin index boyle cagirilir 10
		System.out.println(integers.get(integers.size() -1)); // son elemani getirdik 20
		
		
		
	}

}
