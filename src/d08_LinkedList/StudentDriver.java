package d08_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentDriver {
	public static void main(String[] args) {
		
		LinkedList<Student> studentList = new LinkedList<>();
		studentList.add(new Student(1,"Adem","CAN"));
		studentList.add(new Student(2,"Jonas","EkremCan"));
		studentList.add(new Student(3,"Ayden","Cokcaliskan"));
		
		System.out.println(studentList.size());
		
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		studentList.remove(2);
		
		iterator = studentList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
