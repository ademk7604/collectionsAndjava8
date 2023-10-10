package d15_HashMapLab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class WorterbuchDriver {
	/*
	 * Bir dosyadan sozluk degerlerini okuyup map icine atacagiz kullanicidan
	 * aldigimiz degere gore sozzcugu bulup ekrana yazdiracagiz
	 */
	public static void main(String[] args) {
		File file = new File("C:\\Java\\E_commerce\\collectionsAndJava8\\src\\d15_HashMapLab\\Wortebuch.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			fileWriter = new FileWriter(file, true); // true ile file in sonuna kelimeye ekleyecektir
			String line = null;

			SortedMap<String, String> sortedMap = new TreeMap<>();

			while ((line = bufferedReader.readLine()) != null) {
				// System.out.println(line);
				String[] strings = line.split(":"); // string array olarak alabiliriz
				// System.out.println(strings[0]);
				// System.out.println(strings[1]);

				sortedMap.put(strings[0], strings[1]);

			}

			Scanner scanner = new Scanner(System.in);
			String input = null;
			System.out.print("Kelime: ");
			while (!(input = scanner.nextLine()).equals("exit")) {
				String value = sortedMap.get(input);
				if (value != null) {
					System.out.println(value);
				} else {
					System.out.println("Kelime Bulunamadi! Eklemek istermisiniz? (E) (H)");
					if(scanner.nextLine().equals("E")) {
						System.out.print("Yeni Kelime: ");
						String yeniKelime = scanner.nextLine();
						fileWriter.write("\n");
						fileWriter.write(input);
						fileWriter.write(":");
						fileWriter.write(yeniKelime);
						fileWriter.flush(); // anlik dosya ya yazar
						
						sortedMap.put(input, yeniKelime);
					}
				}
				System.out.print("Kelime: ");
			}

			/*
			 * System.out.println(sortedMap.size()); Set<Entry<String, String>> entries =
			 * sortedMap.entrySet(); Iterator<Entry<String, String>> iterator =
			 * entries.iterator(); while(iterator.hasNext()) { Entry<String, String> entry =
			 * iterator.next(); System.out.println(entry.getKey()+" "+entry.getValue()); }
			 */

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(fileWriter != null)
			if (bufferedReader != null)
				if (fileReader != null) {
					try {
						bufferedReader.close();
						fileReader.close();
						fileWriter.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
		}

	}

}
