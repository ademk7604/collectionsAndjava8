package collectionsAndJava8.d03_HashSet;

public class Calisan {
	//TreeSet deki gibi CALISAN clasimizi implements Comparable yapmamiza HASHSET gerek yok 

	private String tcNo;
	private String name;
	
	public Calisan() {
		
	}
	
	public Calisan(String tcNo, String name) {
		this.tcNo=tcNo;
		this.name=name;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Integer.valueOf(tcNo);
	}
	
	@Override
	public boolean equals(Object other) {
		Calisan calisan = (Calisan) other;
		return this.tcNo.equals(calisan.tcNo);
	}
	
	
	@Override
	public String toString() {
		return "tcNo: "+tcNo+", name: "+name;
	}

}
