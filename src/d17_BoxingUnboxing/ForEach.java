package d17_BoxingUnboxing;

import java.util.ArrayList;

public class ForEach {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("---------");
		int i =0;
		
		while(i<numbers.length) {
			System.out.println(numbers[i++]);
		}
		
		System.out.println("----------");
		int x = 0;
		do {
			System.out.println(numbers[x++]);
		} while (x<numbers.length);
		
		System.out.println("********");
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(9);
		
		for(Integer a:arrayList ) {
			System.out.println(a);
			// iterable methodlarini kullaniyor aslinda
		}
		
	}

}
