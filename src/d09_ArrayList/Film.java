package d09_ArrayList;

import java.io.Serializable;

public class Film implements Serializable {

	private String ad;
	private String yonetmen;
	private FilmType filmType;
	private int yayinlamaYili;

	public Film() {

	}

	public Film(String ad, String yonetmen, FilmType filmType, int yayinlamaYili) {
		this.ad = ad;
		this.yonetmen = yonetmen;
		this.filmType = filmType;
		this.yayinlamaYili = yayinlamaYili;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYonetmen() {
		return yonetmen;
	}

	public void setYonetmen(String yonetmen) {
		this.yonetmen = yonetmen;
	}

	public FilmType getFilmType() {
		return filmType;
	}

	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}

	@Override
	public String toString() {
		return "ad: " + ad + ", yonetmen: " + yonetmen + ", FilmType: " + filmType + ", yayinlamaYili: "
				+ yayinlamaYili;
	}

	@Override
	public int hashCode() {
		return yayinlamaYili;
	}

	@Override
	public boolean equals(Object obj) {
		Film film = (Film) obj;
		return film.ad.equals(this.ad) && film.yayinlamaYili == this.yayinlamaYili;
	}

}
