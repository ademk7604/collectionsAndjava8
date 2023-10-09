package d12_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Driver {
	/*
	 * Iterator aruuzunu imp etmez
	 * Anahtar biliniyorsa deger cagirilabilir
	 * Map siralma yapmaz ve essiz anahtarlar ister
	 * TreeMap esleme tablosunda anahtarlari sirali sekilde tutar.
	 * haritalma.entrySet() ile Kolleksiyon gorunumu alinir
	 */
	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(34, "Ist");
		hashMap.put(35, "Ank");
		hashMap.put(6, "Izmir");
		//hashMap.put(34, "Ist2");
		
		System.out.println(hashMap.size());
		String string = hashMap.get(6);
		System.out.println(string);
		
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.print(key+" ");
			String value = hashMap.get(key);
			System.out.println(value);
		}
		
	}

}
