package d21_FunctionalInterface2;

import java.io.Serializable;

public class Urun implements Serializable {

	private int id;
	private String adi;
	private double fiyat;

	public Urun() {

	}

	public Urun(int id, String adi, double fiyat) {
		this.id = id;
		this.adi = adi;
		this.fiyat = fiyat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public int hashCode() {

		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Urun urun = (Urun) obj;
		return urun.id == this.id;
	}

	@Override
	public String toString() {
		return "Id: " + id + ", Adi: " + adi + ", Fiyat: " + fiyat;
	}

}
