package d16_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Driver {
	/*
	 * 
	 */
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i <100; i++) {
			arrayList.add(random.nextInt(100));
		}
		System.out.println(arrayList.size());
		//1.yol
		/*for(int i = 0; i<100; i++) {
			System.out.println(arrayList.get(i));
			// ancak Set Interface den dogan sinflarin get methodu bulunmamaktadir
		}*/
		//2.yol
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			System.out.println(next);
			//ek gelistirme
			if(next>50) {
				iterator.remove();
			}
		}
		System.out.println("----------");
		System.out.println(arrayList.size());
	}

}
