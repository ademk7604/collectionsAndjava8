package d07_SetLab2;

public class Student implements Comparable<Student>{

	private int numara;
	private String isim;
	private String soyisim;
	private String sinif;

	public Student() {
	}

	public Student(int numara, String isim, String soyisim, String sinif) {
		this.numara = numara;
		this.isim = isim;
		this.soyisim = soyisim;
		this.sinif = sinif;

	}

	public int getNumara() {
		return numara;
	}

	public void setNumara(int numara) {
		this.numara = numara;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return student.numara == this.numara;
	}

	@Override
	public int hashCode() {
		return this.numara;
	}

	@Override
	public String toString() {
		return "Isim : " + isim + ", soyisim : " + soyisim + ", Sinif: " + sinif + ", numara : " + numara;
	}

	@Override
	public int compareTo(Student o) {
		
		return this.numara - o.numara;
	}

}
