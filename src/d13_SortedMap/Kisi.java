package d13_SortedMap;

import java.io.Serializable;

public class Kisi implements Serializable {
	
	
	private String tcNo;
	private String ad;
	private String soyad;
	private Cinsiyet cinsiyet;

	public Kisi() {

	}

	public Kisi(String tcNo, String ad, String soyad, Cinsiyet cinsiyet) {
		this.tcNo = tcNo;
		this.ad = ad;
		this.soyad = soyad;
		this.cinsiyet = cinsiyet;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	@Override
	public String toString() {
		return "TcNo: " + tcNo + ", Ad: " + ad + ", Soyad: " + soyad + ", Cinsiyet: " + cinsiyet;
	}

	@Override
	public int hashCode() {
		return tcNo.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		Kisi kisi = (Kisi) o;
		return kisi.tcNo.equals(this.tcNo);
	}

}
