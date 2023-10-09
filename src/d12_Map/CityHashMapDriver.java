package d12_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CityHashMapDriver {
	public static void main(String[] args) {

		HashMap<Integer, City> hashMap = new HashMap<>();
		hashMap.put(34, new City("Istanbul", 20_000_000));
		hashMap.put(35, new City("Izmir", 6_000_000));
		hashMap.put(6, new City("Ankara", 8_000_000));

		System.out.println(hashMap.size());
		City city = hashMap.get(34);
		System.out.println(city);

		// Sadece KEY alacaksak keySEt()
		Set<Integer> keySet = hashMap.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key + " " + hashMap.get(key));
		}

		System.out.println("-----------");

		// values() methodu ile icindeki values alabiliriz ve Colection doner.
		Collection<City> values = hashMap.values();
		Iterator<City> iterator2 = values.iterator();
		while (iterator2.hasNext()) {
			City city2 = iterator2.next();
			System.out.println(city2);
		}

		// hem Key hemde Value doneceksek entrySet() methodunu kullaniriz
		Set<Entry<Integer, City>> entries = hashMap.entrySet();
		Iterator<Entry<Integer, City>> iterator3 = entries.iterator();
		while (iterator3.hasNext()) {
			Entry<Integer, City> nextEntry = iterator3.next();
			System.out.println(nextEntry.getKey());
			System.out.println(nextEntry.getValue());
			System.out.println("------------");
		}

	}

}
