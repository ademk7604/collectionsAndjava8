package collectionsAndJava8.d03_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Driver {
	/*
	 * AbstractSet den aklitim almistir Set interface imp eder.
	 * Depolamak icin hash tablosu kullanan koliksiyon yaratir Hashing algoritmasi
	 * 
	 */
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("istanbul");
		hashSet.add("Ankara");
		hashSet.add("Bursa");
		hashSet.add("istanbul");
		
		//System.out.println(hashSet.size());
		
		Iterator<String> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			String next = iterator.next();
			//System.out.println(next);
		}
		
		HashSet<Calisan> hashSet2 = new HashSet<>();
		hashSet2.add(new Calisan("1", "Ali"));
		hashSet2.add(new Calisan("2","Seyhan"));
		hashSet2.add(new Calisan("3", "Ayse"));
		hashSet2.add(new Calisan("1", "Ali"));
		/*
 		tcNo: 1, name: Ali
		tcNo: 2, name: Seyhan
		tcNo: 1, name: Ali
		tcNo: 3, name: Ayse
		normalde hashSet inicini dolairken unig olarak calisir ama buradaki durum sebebi su: 
		hashSet iki nesnenin ayni olup olmadigini objecten gelen hashCode methodu ile anlamaktadir
		 */
		//TreeSet deki gibi CALISAN clasimizi implements Comparable yapmamiza HASHSET gerek yok 
		Iterator<Calisan> iterator2 = hashSet2.iterator();
		while(iterator2.hasNext()) {
			Calisan calisan = iterator2.next(); 
			System.out.println(calisan);
			System.out.println(calisan.hashCode());
		}
		/*
		 * HashSet karsilastirmada once hashCode methoduna bakar sonra aquels methoduna gecer ordan karsilastirir
		 * simdi sonucta 3 tane gelmis oldu

		 */
		
	}

}
