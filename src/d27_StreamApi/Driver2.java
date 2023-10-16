package d27_StreamApi;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver2 {
	public static void main(String[] args) {

		// IntStream.range(1, 10).forEach(System.out::println);

		/*
		 * Primitive Strem lerde Aggregate funcion dedigimiz sum ve average methodlari
		 * vardir. primitive data typ larinda olusturularn int long double Stremi
		 * alinabiliyor.
		 * sum() terny method dur. geriye yeni bir stream dondurmuyor sondandirilmis oluyor
		 * filter() sonuc dondurmez intermediate method dur
		 */
		
		Arrays.stream(new int[] { 2, 6, 3, 7, 4, 8 })
			.map((x) -> x * 2)
			.average()
			.ifPresent(System.out::println);
		
		int sum = IntStream.range(1, 101)
				.sum();
		System.out.println(sum);
		
		System.out.println("Bazi durumlarda Object stream lari primitive stream a donusturmeye ihtiyacimiz olabilir");
		Stream.of("1","2","3","4")
			.mapToInt(Integer::parseInt)
			.max()
			.ifPresent(System.out::println);
		
		System.out.println("Primitiv den Object stremlara donusum de yapalim");
		IntStream.range(1, 10)
			.mapToObj((i) -> i+"a")
			.forEach(System.out::println);
		
		System.out.println("Primitive streamleri birbiri arasinda donusturelim");
		Stream.of(1.1,2.2,3.3,4.4)
			.mapToInt(Double::intValue)
			.max()
			.ifPresent(System.out::println);
		
		Stream.of("Ali","Ahmet","Cem","Burak")
		 	.filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					System.out.println("Calisti");
					return true;
				}
			}).forEach(System.out::println);
		
		
		
		

	}

}
