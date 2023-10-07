package d05_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Driver {
	/*
	 * icine eklelenen nesneler unig dir
	 * AbstractSet sinifindan kalitim almistir
	 * NavigableSet arayuzunu imp
	 * Depoladigi elementleri artan sirayla sirali olarak kaydeder
	 * veriye erisim ve vericekme hizi oldukca verimlidir
	 * 
	 */
	public static void main(String[] args) {
		/*
		 TreeSet<String> treeSet = new TreeSet<>();
		 treeSet.add("Siyah");
		 treeSet.add("Beyaz");
		 treeSet.add("Mavi");
		 treeSet.add("Beyaz");
		 System.out.println(treeSet.size()); //3
		 
		 Iterator<String> iterator = treeSet.iterator();
		 while(iterator.hasNext()) {
			 String next = iterator.next();
			 System.out.println(next);
		 }
		 */
		TreeSet<City> citySet = new TreeSet<>();
		citySet.add(new City("2325","Ingolsatd"));
		citySet.add(new City("2526", "Lenting"));
		citySet.add(new City("2527", "Munchen"));
		citySet.add(new City("2527", "Munchen"));
		System.out.println(citySet.size());
		System.out.println(citySet.isEmpty());
		
		Iterator<City> iterator = citySet.iterator();
		while(iterator.hasNext()) {
			City city = iterator.next();
			System.out.println(city);
		}
		 
		 
		 
	}

}
