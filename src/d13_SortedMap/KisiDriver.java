package d13_SortedMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class KisiDriver {
	public static void main(String[] args) {
		SortedMap<Integer, Kisi> sortedMap = new TreeMap<>();
		// kullandigimiz collection type SortedMap oldugu icin key lere gore siralaniyor
		sortedMap.put(3, new Kisi("125", "Zeynep", "Olmez", Cinsiyet.KADIN));
		sortedMap.put(1, new Kisi("123", "Ali", "Can", Cinsiyet.ERKEK));
		sortedMap.put(2, new Kisi("124", "Ahmet", "Cirkin", Cinsiyet.ERKEK));
		

		System.out.println(sortedMap.size());

		Set<Entry<Integer, Kisi>> entrySet = sortedMap.entrySet();
		Iterator<Entry<Integer, Kisi>> iterator = entrySet.iterator();

		while(iterator.hasNext()) {
			Entry<Integer, Kisi> entry = iterator.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
