package d17_BoxingUnboxing;

import java.util.ArrayList;
import java.util.Iterator;

public class AutoBoxingLab {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(10);
		
		int x = 20;
		arrayList.add(x); // otomatik olarak ceviriliyor
		
		int y = arrayList.get(1);
		
		arrayList.add(new Integer(5));
		
		Iterator<Integer> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			int i = iterator.next();
			System.out.println(i);
		}
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		byte b = 10;
		
		byte parseByte = Byte.parseByte("12");
		System.out.println(parseByte);
		
		Byte a = Byte.parseByte("2");
		
	
	}

}
