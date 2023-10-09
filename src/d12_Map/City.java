package d12_Map;

public class City {
	private String isim;
	private long nufus;

	public City() {

	}

	public City(String isim, long nufus) {
		this.isim = isim;
		this.nufus = nufus;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public long getNufus() {
		return nufus;
	}

	public void setNufus(long nufus) {
		this.nufus = nufus;
	}

	@Override
	public String toString() {
		return "Isim: " + isim + ", Nufus: " + nufus;
	}

	@Override
	public int hashCode() {
		return this.isim.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		City city = (City) o;
		return this.isim.equals(city.isim);
	}

}
