package d18_Lambda_1;

public class LambdaDriver2 {
	public static void main(String[] args) {
		Merhaba merhaba = ()-> "Merhaba";
		
		System.out.println(merhaba.selam());
		Merhaba2 merhaba2 =(s)-> "Merhaba "+ s;
		
		System.out.println(merhaba2.selam("Ali"));
		
		Topla toplaIslemi = (a,b)-> a+b;
		System.out.println(toplaIslemi.topla(2, 5));
	}

}
