package d14_HashMap;

import java.io.Serializable;
import java.util.Date;

public class Kitap implements Serializable {
	private String ad;
	private Date yayinTarihi;
	private String yazar;

	public Kitap() {

	}

	public Kitap(String ad, Date yayinTarihi, String yazar) {
		this.ad = ad;
		this.yayinTarihi = yayinTarihi;
		this.yazar = yazar;
	}

	public String geAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Date getYayinTarihi() {
		return yayinTarihi;
	}

	public void setDate(Date yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	@Override
	public int hashCode() {
		return ad.hashCode() + yayinTarihi.hashCode() + yazar.hashCode();
	}

	@Override
	public String toString() {
		return "Ad: " + ad + ", YayinTarihi: " + yayinTarihi + ", Yazar: " + yazar;
	}

	@Override
	public boolean equals(Object o) {
		Kitap kitap = (Kitap) o;
		return kitap.ad.equals(this.ad) && kitap.yayinTarihi.equals(this.yayinTarihi) && kitap.yazar.equals(this.yazar);
	}

}
