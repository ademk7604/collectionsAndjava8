package d10_Vektor;

import java.util.Vector;

public class Driver {
	/*
	 * AbstractList kalitim almistir List inf. iml etmistir ArrayListe benzer
	 * dinamik bir dizidir
	 * ArrayList ler den fark TreadSave olmasidir
	 */
	public static void main(String[] args) {
		Vector<String> vector = new Vector<>(4); // girilecek degerler 4 den fazla oldigi zaman capacity otomatik 2 katina cikar
		vector.add("Kedi");
		vector.add("Kopek");
		vector.add("Kaplan");
		vector.add("At");
		vector.add("Tavsan");

		for (int i = 0; i < vector.size(); i++) {
			String vektor = vector.get(i);
			System.out.println((i) + " " + vektor);

		}
		System.out.println(vector.capacity());
		
		System.out.println(vector.contains("Kedi"));
		int indexOf = vector.indexOf("Kaplan");
		System.out.println(indexOf);
		vector.clear();
		System.out.println("-----------");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
	}

}
