package d27_StreamApi;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Driver3 {
	public static void main(String[] args) {
		// intermatet method calisma sirasina bakalim 
		// DIKEY calisir.
		/*
		Stream.of(1,3,5,6,7)
			.filter(new Predicate<Integer>() {

				@Override
				public boolean test(Integer t) {
					System.out.println("Test");
					return t>2;
				}
			})
			.forEach(new Consumer<Integer>() {

				@Override
				public void accept(Integer t) {
					System.out.println("Accept");
					System.out.println(t);
					
				}
			});
		System.out.println("-----");
		Stream.of(1,3,5,6,7)
		.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				System.out.println("Test");
				return t>2;
			}
		})
		.anyMatch(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				System.out.println("Test anyMatch");
				return t == 5;
			}
		});
		*/
		/*
		Stream.of("b1","a2","d3","e1")
			.map(new Function<String, String>() {

				@Override
				public String apply(String t) {
					System.out.println("Map");
					return t.toUpperCase();
				}
			})
			.filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					System.out.println("Filter");
					return t.startsWith("A");
				}
			})
			.forEach(System.out::println);
			*/
		System.out.println("once Filter calistirilip sonra map calistirildiginda daha az cpu harcariz");
		//Buyuk Array yapilarinda boyle yapmak lazim filter dan gecmedigi zaman map de girmiyor
		Stream.of("b1","a2","d3","e1")
		.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				System.out.println("Filter");
				return t.startsWith("a");
			}
		})
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				System.out.println("Map");
				return t.toUpperCase();
			}
		})
		
		.forEach(System.out::println);
		
		System.out.println("-------");
		Stream.of("b1","a2","d3","e1")
		.filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				System.out.println("Filter");
				return t.startsWith("a");
			}
		})
		.sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				System.out.println("sorted");
				return o1.compareTo(o2);
			}
		})
		.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				System.out.println("Map");
				return t.toUpperCase();
			}
		})
		
		.forEach(System.out::println);
		// bu sekilde once filter sonra sorted daha sonra map siralamasi seklin calistirmak lazim
		
	}

}
