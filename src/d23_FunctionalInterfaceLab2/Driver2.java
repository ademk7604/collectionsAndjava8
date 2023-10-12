package d23_FunctionalInterfaceLab2;

import java.util.Date;
import java.util.Scanner;

public class Driver2 {
	public static void main(String[] args) {
		System.out.println("Merhaba");
		Scanner scanner = new Scanner(System.in);
		// Bu sekilde lambda operatoru ile de olusturabiliyoruz Anonym class yerine
		Thread kullaniciGirisiThread = new Thread(() -> {
			while (true) {
				System.out.print("Giris: ");
				String line = scanner.nextLine();
				System.out.println(line.toUpperCase());
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
