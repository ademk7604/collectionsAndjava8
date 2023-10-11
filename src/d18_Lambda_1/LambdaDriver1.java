package d18_Lambda_1;

public class LambdaDriver1 {
	
	public static void main(String[] args) {
		/*SayiOlustur sayiOlustur = new SayiOlustur() {
			
			@Override
			public double olustur() {
				
				return 15.0;
			}
		};
		*/
		// yukarida oldugu gibi Anonymous Class olusturmak yerine asagidaki gibi  lambda exprassion kullaniyoruz
		
		SayiOlustur sayiOlustur = () -> 15.0; 
		// methodumuz hic parametre almiyor burda da vermiyoruz{double olustur()}
		
		System.out.println(sayiOlustur.olustur());
	}

}
