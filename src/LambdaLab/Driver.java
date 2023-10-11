package LambdaLab;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void cinsiyeteGoreSirala(List<Kisi> kisiler, Kisi.Cinsiyet cinsiyet) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getCinsiyet().equals(cinsiyet)) {
				System.out.println(kisi);
			}
		}
	}
	public static void yasaGoreSirala(List<Kisi> kisiler, int yas) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getYas() >=yas) {
				System.out.println(kisi);
			}
		}
	}
	public static void yasAraliginaGore(List<Kisi> kisiler, int min, int max) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisi.getYas() >min && kisi.getYas() <= max) {
				System.out.println(kisi);
			}
		}
	}
	// yukaridakiyazdigimiz methodlar yerine hepsini hesaplayacak interface yazalim ve lambda exp. ile dinamik kod yazalim
	
	public static void kisiFiltresi(List<Kisi> kisiler, KisiFiltresi kisiFiltresi) {
		for (int i = 0; i < kisiler.size(); i++) {
			Kisi kisi = kisiler.get(i);
			if(kisiFiltresi.filtrele(kisi)) {
				System.out.println(kisi);
			}
		}
	}

public static void main(String[] args) {
		Kisi kisi1 = new Kisi("Aylin Kurt", LocalDate.parse("1990-03-23"), "aylinKurt@gmail.com", Kisi.Cinsiyet.KADIN);
		Kisi kisi2 = new Kisi("Ayhan Sonmez", LocalDate.parse("1998-01-02"), "ayhanSonamez@gamil.com", Kisi.Cinsiyet.ERKEK);
		Kisi kisi3 = new Kisi("Serkan Bayri", LocalDate.parse("2013-07-04"), "serkan?Bayrik", Kisi.Cinsiyet.ERKEK);

		ArrayList<Kisi> kisiler = new ArrayList<>();
		kisiler.add(kisi1);
		kisiler.add(kisi2);
		kisiler.add(kisi3);

		//cinsiyeteGoreSirala(kisiler, Kisi.Cinsiyet.ERKEK);
		//yasaGoreSirala(kisiler, 30 );
		//yasAraliginaGore(kisiler, 6, 25);
		
		
		/*
		kisiFiltresi(kisiler, new KisiFiltresi() {
			
			@Override
			public boolean filtrele(Kisi kisi) {
				return kisi.getYas() > 5 && kisi.getCinsiyet().equals(Kisi.Cinsiyet.ERKEK);
			}
		});
		// Burada yeni bir Anonymous Class yapmak yerine asagida lambda ile istedigimizi cagirabilkiriz
		*/
		
		
		kisiFiltresi(kisiler, (k)-> k.getYas() >= 15 && k.getCinsiyet().equals(Kisi.Cinsiyet.KADIN));

	}

}
