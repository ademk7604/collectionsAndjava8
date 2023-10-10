package d14_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Driver {
	/*
	 * AbstractMap sinifini kalitim alir ve map arayuzunu imp eder
	 * haritayi depolamak icin hash tablosunu kullanir
	 * eklenen elemanrin sirali olmasini garanti etmez
	 */
	public static void main(String[] args) {
		HashMap<String, Double> hashMap = new HashMap<>();
		hashMap.put("Bilgisayar", 2200.0);
		hashMap.put("Cep Telefonu", 1400.0);
		hashMap.put("Araba", 20000.0);
		
		System.out.println(hashMap.size());
		
		Set<String> keySet = hashMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String keyString = iterator.next();
			System.out.println(keyString);
			System.out.println(hashMap.get(keyString));
			System.out.println("----------");
		}
		System.out.println(hashMap.isEmpty());
		
		hashMap.replace("Cep Telefonu", 6000.0);
		
		System.out.println("*****");
		
		Set<Entry<String, Double>> entrySet = hashMap.entrySet();
		Iterator<Entry<String, Double>> iterator2 = entrySet.iterator();
		while(iterator2.hasNext()) {
			Entry<String, Double> nextEntry = iterator2.next();
			System.out.println(nextEntry.getKey()+" "+nextEntry.getValue());
		}
		
		
	
		
	}

}
