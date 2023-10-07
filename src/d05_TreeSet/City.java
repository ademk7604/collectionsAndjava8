package d05_TreeSet;

public class City implements Comparable<City>{
	private String plakaCode;
	private String name;

	public City() {

	}

	public City(String plakaCode, String name) {
		this.plakaCode = plakaCode;
		this.name = name;
	}

	public String getPlakaCode() {
		return plakaCode;
	}

	public void setPlakaCode(String plakaCode) {
		this.plakaCode = plakaCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PlakaCode : "+plakaCode+ ", name: "+name;
	}

	@Override
	public int compareTo(City o) {
		return this.plakaCode.compareTo(o.plakaCode);
	}

}
