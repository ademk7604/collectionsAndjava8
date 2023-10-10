package d16_Iterator;

import java.util.Iterator;

public class IteratorDriver {
	public static void main(String[] args) {
		Student student =new Student();
		student.setIsim("Ali Kaplan");
		int[] notlar = new int[5];
		notlar[0] = 90;
		notlar[1] = 80;
		notlar[2] = 75;
		notlar[3] = 95;
		notlar[4] = 100;
		student.setNotlar(notlar);
		
		Iterator<Integer> iterator = student.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			//burdaki hasNext ile next methodu castem class da override etmistik ordan cagriliyor
			System.out.println(next);
		}
	}

}
