package d23_FunctionalInterfaceLab2;

import java.util.Date;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Merhaba");
		Scanner scanner = new Scanner(System.in);
		Thread kullaniciGirisiThread = new Thread(new Runnable() {
			// run icinde yapilan islemler ayri bir Thread de calisacaktir uygulamamizi
			// diger islemleri yapmaya devam edecektir. Yani uyg miz beklemeyecektir.
			@Override
			public void run() {
				while (true) {
					System.out.print("Giris: ");
					String line = scanner.nextLine();
					System.out.println(line.toUpperCase());

				}
			}
		});
		kullaniciGirisiThread.start();

		/*
		 * uygulama kullanicinin girdi yapmasini bekliyor sonra asagidaki sout calisir.
		 * yani uyg 9. satirda blocklanmis durumda uyg. mizin blocklanmasini
		 * istemiyorsak Thread yapilasini kullaniriz. Thread ler ayni anda uyglamaniza
		 * birden fazla islem yaptirmanizi saglayan teknolojidir
		 */
		while (true) {
			System.out.println(new Date());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
