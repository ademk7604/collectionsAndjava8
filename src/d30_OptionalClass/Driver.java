package d30_OptionalClass;

import java.util.Optional;

public class Driver {
	/*
	 * Optional, keine Constructor, isPresent, 
	 * NallPointerException onune gecmek icindir
	 * Optional null olamaz null vermek istiyorsak ofNullable methodu kullan
	 */
	
	public static String test() {
		System.out.println("Test calisti");
		return "test";
	}
	
	public static void main(String[] args) {
		
		Optional<String> bosNesne = Optional.empty();
		System.out.println(bosNesne.isPresent());
		
		String deger = "Sayilar";
		Optional<String> optional = Optional.of(deger);
		System.out.println(optional.isPresent());
		
		String s = null;
		// Optional<String> optional2 = Optional.of(s);  hava verir asagidaki calisir
		Optional<String> optional2 = Optional.ofNullable(s);
		System.out.println(optional2.isPresent());
		
		String bosIsim = null;
		String isim = Optional.ofNullable(bosIsim).orElse("Ali");
		System.out.println(isim);
		
		String bosIsim1 = "Veli";
		String isim1 = Optional.ofNullable(bosIsim1).orElse("Ali"); // orElse calismaz
		System.out.println(isim1);
		
		String sehir1= null;
		String sehir2 = Optional.ofNullable(sehir1).orElseGet(()->"Istanbul");
		System.out.println(sehir2);
		
		String sehir3= "Ankara";
		String sehir4 = Optional.ofNullable(sehir3).orElseGet(()->"Istanbul");
		System.out.println(sehir4);
		
		// SIMDI orElse ile orElseGet arasindaki farka bakalim
		
		String bos = "a";
		String string = Optional.ofNullable(bos).orElse(test());
		String string2 = Optional.ofNullable(bos).orElseGet(()-> test());
		System.out.println(string);
		System.out.println(string2); 
		/*
		orElse null olsada ollmasa da test methodu calistiri
		ama orElseGet methodu null ise test methodunu calistiri
		o yuzden orElseGet methodu daha verimlidir  sagliklidir
		 * 
		 */
		
		
	}

}
