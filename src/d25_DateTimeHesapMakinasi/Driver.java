package d25_DateTimeHesapMakinasi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Driver {
	public static void main(String[] args) {
		LocalDate tarih = LocalDate.now();
		String kisa = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(tarih);
		String orta = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(tarih);
		String uzun = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(tarih);
		String full = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(tarih);
		
		System.out.println(kisa);
		System.out.println(orta);
		System.out.println(uzun);
		System.out.println(full);
		
		System.out.println("------------");
		
		String ozel = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(tarih);
		System.out.println(ozel);
		
		LocalTime localTime = LocalTime.now();
		kisa = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(localTime);
		orta = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(localTime);
		System.out.println(kisa);
		System.out.println(orta);
		
		// saati istedigimiz formatta gosterebiliyoruz
		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("HH-mm-ss");
		System.out.println(ofPattern.format(localTime));
		
		
		
	}

}
