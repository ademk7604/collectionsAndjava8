package LambdaLab;

import java.io.Serializable;
import java.time.LocalDate;

public class Kisi implements Serializable {

	public enum Cinsiyet {
		ERKEK, KADIN
	}

	private String isim;
	private LocalDate dogumTarihi;
	private String emailAdresi;
	private Cinsiyet cinsiyet;

	public Kisi() {

	}

	public Kisi(String isim, LocalDate dogumTarihi, String emailAdresi, Cinsiyet cinsiyet) {
		this.isim = isim;
		this.dogumTarihi = dogumTarihi;
		this.emailAdresi = emailAdresi;
		this.cinsiyet = cinsiyet;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}
	public int getYas() {
		return LocalDate.now().getYear() - dogumTarihi.getYear();
	}

	public String getEmaiAdresi() {
		return emailAdresi;
	}

	public void setEmailAdresi(String emailAdresi) {
		this.emailAdresi = emailAdresi;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinisiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Override
	public int hashCode() {
		return emailAdresi.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Kisi kisi = (Kisi) obj;
		return kisi.emailAdresi.equals(this.emailAdresi);
	}

	@Override
	public String toString() {
		return "Isim: " + isim + ", DogumTarihi: " + dogumTarihi + ", EmailAdresi: " + emailAdresi + ", Cinsiyet: "
				+ cinsiyet+", Yas: "+getYas();
	}

}
