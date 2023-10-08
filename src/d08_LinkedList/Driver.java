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
			System.out.print(iterator.next()+" "); // ekleme sirasina gore geliyor
		}
		
		
		System.out.println(integers.get(0)); // listedeki istedigin index boyle cagirilir 10
		System.out.println(integers.get(integers.size() -1)); // yukari ikinci index 55 eklemistik 
		//burda 4. index getirir 20 gelir yanlistir, 30 gelmesi gerekir.
		// listede olmayan bir eleman indexOf ile cagirdiginda -1 doner
		integers.addFirst(33);
		System.out.println(integers.getFirst());
		
		integers.addLast(44);
		System.out.println(integers.getLast());
		
		int indexOf = integers.indexOf(33);
		System.out.println("---");
		System.out.println(integers);
		System.out.println(indexOf);
		System.out.println(integers.indexOf(20));
		System.out.println(integers.lastIndexOf(20));
		
		integers.remove();// parametre gondermedin zaman listenin en basindaki obj i kaldirir
		integers.remove(4);
		integers.remove(33);
		
		
		
		
	}

}
