package d09_ArrayList;

import java.util.ArrayList;

public class FilmDriver {
	public static void main(String[] args) {
		ArrayList<Film> arrayList = new ArrayList<>();
		arrayList.add(new Film("X Film", "Ayse Kahraman", FilmType.BELGESEL, 2009));
		arrayList.add(new Film("Y Film", "Tugrul Caliskan", FilmType.BILIM_KURGU, 2019));
		arrayList.add(new Film("Z film", "Mehmet Kaplan", FilmType.KOMEDI, 1998));

		for (int i = 0; i < arrayList.size(); i++) {
			Film film = arrayList.get(i);
			System.out.println(film);
		}
		System.out.println("---------------");
		System.out.println(arrayList.get(1));
		//System.out.println(arrayList.get(11)); //java.lang.IndexOutOfBoundsException: Index 11 out of bounds for length 3
	}

}
