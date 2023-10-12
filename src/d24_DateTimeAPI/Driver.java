package d24_DateTimeAPI;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println("Bugunun tarihi dondurur: "+localDate);
		
		LocalDate of = LocalDate.of(1990, 01, 01);
		System.out.println("ilgili tarihi dondurur: "+of);
		
		LocalDate localDate2 = LocalDate.parse("2022-01-17");
		System.out.println("ilgili tarihi dondurur: "+localDate2);
		
		LocalDate localDate3 = localDate.plus(1, ChronoUnit.DAYS);
		System.out.println("typ Days olarak 1 gun ekleyip dondurur: "+localDate3);
		
		LocalDate localDate4 = localDate.plusDays(2);
		System.out.println(localDate4);
		
		System.out.println(localDate.minus(1, ChronoUnit.MONTHS));
		
		LocalDate localDate5 = LocalDate.parse("1990-01-01");
		System.out.println(localDate5.getDayOfWeek()); // pazartesi gunu dogmusum :)
		
		int dayOfMonth = localDate5.getDayOfMonth();
		System.out.println(dayOfMonth);
		
		LocalDate birinciTarih = LocalDate.parse("2020-01-20");
		LocalDate ikinciTarih = LocalDate.parse("2020-01-25");
		System.out.println(birinciTarih.isAfter(ikinciTarih));
		System.out.println(birinciTarih.isBefore(ikinciTarih));
		
		System.out.println("------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dogum Tarihi: ");
		String line =scanner.nextLine();
		LocalDate dogumTarih = LocalDate.parse(line);
		System.out.println("Dogum Tarihiniz: "+dogumTarih);
		System.out.println("Yasiniz: "+ (LocalDate.now().getYear() - dogumTarih.getYear()));
		
		
	}

}
