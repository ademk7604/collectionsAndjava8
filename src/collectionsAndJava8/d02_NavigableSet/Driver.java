package collectionsAndJava8.d02_NavigableSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
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
		System.out.println(navigableSet.ceiling(0));
		System.out.println(navigableSet.floor(9));
		System.out.println(navigableSet.lower(1));
		System.out.println(navigableSet.higher(4));
		SortedSet<Integer> sortedSet1 = navigableSet.headSet(5);
		Iterator<Integer> iterator2 = sortedSet1.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
	}

}
