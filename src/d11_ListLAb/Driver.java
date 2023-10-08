package d11_ListLAb;

import java.util.ArrayList;
import java.util.Date;

public class Driver {
	public static void main(String[] args) {
		/*
		Bilet bilet = new Bilet(1, new Date(), 25.0f);
		Koltuk koltuk = new Koltuk(1, bilet);
		System.out.println(koltuk);
		*/
		
		ArrayList<Koltuk> arrayList = new ArrayList<>();
		arrayList.add(new Koltuk(1, new Bilet(1, new Date(), 25.0f)));
		arrayList.add(new Koltuk(2, new Bilet(2, new Date(), 30.0f)));
		arrayList.add(new Koltuk(3, new Bilet(3, new Date(), 30.0f)));
		
		for (int i = 0; i < arrayList.size(); i++) {
			Koltuk koltuk = arrayList.get(i);
			System.out.println(koltuk);
		}
		
	}

}
