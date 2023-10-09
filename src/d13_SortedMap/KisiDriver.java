package d13_SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class KisiDriver {
	public static void main(String[] args) {
		SortedMap<Integer, Kisi> sortedMap = new TreeMap<>();
		sortedMap.put(1, new Kisi("123", "Ali", "Can", Cinsiyet.ERKEK));
		sortedMap.put(2, new Kisi("124", "Ahmet", "Cirkin", Cinsiyet.ERKEK));
		sortedMap.put(3, new Kisi("125", "Zeynep", "Olmez", Cinsiyet.KADIN));

		System.out.println(sortedMap.size());

		// TODO Set<Entry<Integer, Kisi>> entrySet = sortedMap.entrySet();

	}

}
