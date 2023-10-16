package d28_StreamApiLab;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student(1, "Aylin Can", 16));
		arrayList.add(new Student(3, "Mert Kara", 7));
		arrayList.add(new Student(2, "Zeynep Guler", 14));
		arrayList.add(new Student(4, "Seyhan KOSAR", 7));

		/*
		// collect methodu stream ile donen degerleri bize
		// List Set veya Map olarak bize geri dondururdonuyor
		List<Student> collect = arrayList.stream().filter((o) -> o.getName().startsWith("A"))
				.collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println("----------");

		List<Student> collect2 = arrayList.stream().filter((o) -> o.getAge()>10)
				.collect(Collectors.toList());
		collect2.forEach(System.out::println);
		*/
		
		//Listeyi gruplayalim
		Map<Integer, List<Student>> gruplama = arrayList
				.stream()
				.collect(Collectors.groupingBy(o->o.getAge()));
		
		Set<Integer> keySet = gruplama.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key+" "+gruplama.get(key));
		}
		
		double yasOrtalama = arrayList.stream()
				.collect(Collectors.averagingInt(o->o.getAge()));
				System.out.println(yasOrtalama);
		IntSummaryStatistics statistics = arrayList.stream().collect(Collectors.summarizingInt(o->o.getAge()));
		
		System.out.println(statistics);
	}

}
