package d29_ParallelStream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Driver {
	public static void main(String[] args) {
		/*
		 * Kodun cok cekirdekli islemcielrde paralel olarak
		 * calistirilmasi performani onemli olcude arttirmaktadir
		 * sequential() methodu kullanilarak normal akislara cevirilebilirler
		 * Akis islemi yapilirken, elementlerin sirasinin korunmasi istenirse forEachOrdred()
		 */
		
		Arrays.asList("Istanbul","Ankara","Bursa","Izmir")
			.parallelStream()
			.filter(new Predicate<String>() {

				@Override
				public boolean test(String t) {
					System.out.println("Test: "+Thread.currentThread().getName());
					return true;
				}
			})
			.map(new Function<String, String>() {

				@Override
				public String apply(String t) {
					System.out.println("Apply: "+Thread.currentThread().getName());
					return t.toUpperCase();
				}
			})
			.forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println("Accept: "+Thread.currentThread().getName());
					
				}
			});
	}

}
