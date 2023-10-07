package d02_NavigableSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		/*
		 * SortedSet den kalitim almistir. Generic typ
		 * ceiling()  verilen nesneye en yakin ve ondan yukuk olan nesneyi bulur
		 * and headset()
		 */
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(2);
		navigableSet.add(5);
		navigableSet.add(1);
		navigableSet.add(3);
		navigableSet.add(3);
		System.out.println(navigableSet.size());
		
		Iterator<Integer> iterator = navigableSet.iterator();
		while(iterator.hasNext()) {
			Integer next =iterator.next();
			System.out.println(next);
		}
		// buraya kadar sortedSet ile bir farki yok
		System.out.println(navigableSet.ceiling(0)); //9 olmadigi icin null, // 4 de en yakin buyuk olan 5 gelir.
		System.out.println(navigableSet.floor(9)); // 9 dan daha kucuk 5 getirir
		System.out.println(navigableSet.lower(2)); // 2 den daha kucuk 1 var
		System.out.println(navigableSet.higher(4)); // 4en daha buyuk 5 i getirecektir
		SortedSet<Integer> sortedSet1 = navigableSet.headSet(5, true); // 5 kadar lan degerleri getirir
		Iterator<Integer> iterator2 = sortedSet1.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
			
		}
	}

}
