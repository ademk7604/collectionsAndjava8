package d09_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		/*
		 * AbstractList sinifindan kalitim almistir ve List intef imp eder
		 * ihtiyac duyuldugunda buyuyebilir ve kuculebilirler. Dinamiktirler
		 * Java da standart dilielerin boyutlari sabittir. calisma zamaninda degistirilemezler
		 * Ancak ArrayList lerin calisma zamaninda boyutlari belirlenebilir
		 * icerisine eleman eklendikce boyutlari artar, eleman azaldikca boyutu azalir
		 * Dolayisiyla RunT de boyutu olmayan diziler icin Arrayler kullanilir.
		 * remove methodu ile hem index deki obje sinilir hemde verilen obje ismi ile obj silinir
		 */
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		String line = null;
		while(!(line = scanner.nextLine()).equals("exit")) {
			arrayList.add(line);
		}
		/*
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		} */
		
		// array de get ile index teki veriyi alabiliyoruz
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println((i)+" "+arrayList.get(i));
		}
		System.out.println(arrayList.size());
		arrayList.remove(2);
		System.out.println(arrayList.size());
		
		
		
	}

}
