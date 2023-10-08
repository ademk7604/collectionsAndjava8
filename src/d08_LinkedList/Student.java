package d08_LinkedList;

public class Student {
	private int number;
	private String firstName;
	private String lastName;

	public Student() {

	}

	public Student(int number, String firstName, String lastName) {
		this.number = number;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int hashCode() {
		return number;
	}

	@Override
	public boolean equals(Object other) {
		Student student = (Student) other;
		return student.number == this.number;
	}

	@Override
	public String toString() {
		return "number: " + number + ", firstName: " + firstName + ", lastName: " + lastName;
	}

}
