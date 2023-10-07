package d04_LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver {
	/*
	 * HashSet den kalitim almistir
	 * LinkedList olarak saklanir
	 * ekleme sirasina gore gelirler, unig
	 */
	public static void main(String[] args) {
	/*
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(4);
		
		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
		System.out.println("-----");
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Integer next =iterator.next();
			System.out.println(next);
		}
		*/
		LinkedHashSet<Car> cars = new LinkedHashSet<>();
		cars.add(new Car("BMW","BR","07Ingolstadt"));
		cars.add(new Car("AUDI","AR","08Ingolstadt"));
		cars.add(new Car("Mercd","MR","09Ingolstadt"));
		cars.add(new Car("Mercd","MR","09Ingolstadt"));
		System.out.println(cars.size());
		System.out.println(cars.isEmpty());
		System.out.println("----");
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car);
		}
		
		
		
	}

}
