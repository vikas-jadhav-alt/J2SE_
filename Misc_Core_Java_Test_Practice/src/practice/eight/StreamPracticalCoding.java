package practice.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

enum Gender {
	MALE, FEMALE, THIRD;
}

class Person {

	private String name;
	private Gender gender;
	private int age;

	public Person(String name, Gender gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person (" + name + ", " + gender + ", " + age + ")";
	}

	// Equals by Name
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name);
		}

		return false;
	}

	public static List<Person> createPeople() {

		return List.of(

				new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Paul", Gender.MALE, 18), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12),
				new Person("Bob", Gender.MALE, 74), new Person("Jill", Gender.FEMALE, 12)

		);

	}

}

public class StreamPracticalCoding {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");

		System.out.println("The distinct elements are :");

// Displaying the distinct elements in the list 
// using Stream.distinct() method 
		list.stream().distinct().forEach(System.out::println);

		List<Person> people = Person.createPeople();
		System.out.println(people);

		System.out.println("===Distinct====");
		people.stream().distinct().forEach(System.out::println);
	}

	private static void LogLevel1(String str) {
		System.out.println("==================>| " + str + " |<==================");
	}

	private static void LogLevel2(String str) {
		System.out.println("------------------>| " + str + " |<------------------");
	}
}
