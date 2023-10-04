package collectionsAndJava8.d01_SortedSet;

public class Student implements Comparable<Student>{
	private int number;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int number, String name) {
		this.name=name;
		this.number=number;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Number: " + number;
	}

	@Override
	public int compareTo(Student o) {
		//return this.number - o.number; // tam tersine siralama istersek this yeri o o yerine this oalrak degistirmemiz gerekir
		return this.name.compareTo(o.name); // bu sekilde isme gore siralar
	}

}
