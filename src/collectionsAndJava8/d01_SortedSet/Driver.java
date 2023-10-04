package collectionsAndJava8.d01_SortedSet;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	public static void main(String[] args) {
		
		/*
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(3);
		sortedSet.add(5);
		sortedSet.add(1);
		sortedSet.add(0);

		Iterator<Integer> iterator = sortedSet.iterator(); // iretator collections icinde sirayla donmemizi saglayan bir nesnedir
		while(iterator.hasNext()) {				// iterator nesnesinin sonuna gelmedigi surece hasNext metodu true gonderecektir
			Integer nextInteger = iterator.next();
			//System.out.println(nextInteger);
		} */
		/*
		SortedSet<String> sortedSet1 = new TreeSet<>();
		sortedSet1.add("Ali");
		sortedSet1.add("Alin");
		sortedSet1.add("Alim");
		sortedSet1.add("Alik");
		
		Iterator<String> iterator1 = sortedSet1.iterator(); 
		while(iterator1.hasNext()) {				
			String nextString = iterator1.next();
			System.out.println(nextString);
		}
		*/
		
		SortedSet<Student> sortedSet = new TreeSet<>();
		//SortedSet icinde tuttugu Student nesneleri Comparable intefacesine cast edip tutuyor
		// o yuzden Student clasini Comparable intefacesine implement etmeliyiz
		sortedSet.add(new Student(5, "Ayse"));  // new Student(5, "Ayse") bu sekilde ogrenci eklediginde const araciligiya ekliyor
		sortedSet.add(new Student(6, "Veli"));
		sortedSet.add(new Student(3, "Emre"));
		sortedSet.add(new Student(4, "Emre")); // essiz olarak tutar aynnisi ekrar yazdim ciktida 1 tane gosterdi
		System.out.println(sortedSet.size()); // sortedSet icindeki eleman sayisi
		// isme gore siraladigim icin compareTo methodundan 0 donuyor sortedSet.add(new Student(4, "Emre")); nesnesini eklemiyor
		
		Iterator<Student> iterator = sortedSet.iterator();
		while(iterator.hasNext()) {
			Student nextStudent = iterator.next();
			System.out.println(nextStudent);
			
		}
		
		
		
		
	}

}
