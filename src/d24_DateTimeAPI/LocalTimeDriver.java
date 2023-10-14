package d24_DateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeDriver {
	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();	
		System.out.println(time);
		
		LocalTime localTime = LocalTime.parse("21:30");
		System.out.println(localTime);
		
		LocalTime localTime2 =LocalTime.of(14, 30);
		System.out.println(localTime2);
		//LocalDate ile hemhmen ayni isi yapiyor bunlar
		
		LocalTime localTime3 = LocalTime.parse("21:30").plus(1, ChronoUnit.HOURS);
		System.out.println(localTime3);
		
		System.out.println(localTime3.getHour());
		System.out.println(localTime3.getMinute());
		
		LocalTime birinci = LocalTime.parse("14:00");
		LocalTime ikinci = LocalTime.parse("16:00");
		System.out.println(birinci.isAfter(ikinci));
		System.out.println(birinci.isBefore(ikinci));
	} 

}
