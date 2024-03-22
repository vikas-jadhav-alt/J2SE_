package practice.eight;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	private enum Gender {
		MALE, FEMALE, THIRD;
	}

	private static class Person {
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

	}

	public static List<Person> createPeople() {

		return List.of(

				new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12)

		);

	}

	private static void LogLevel1(String str) {
		System.out.println("==================>| " + str + " |<==================");
	}

	private static void LogLevel2(String str) {
		System.out.println("------------------>| " + str + " |<------------------");
	}

//	public static void main(String[] args) {
//
//		List<Person> persons = createPeople();
//
//		LogLevel1("NOTE: Think Of All API's Working Based On Stream Type: Sequential or Parallel..");
//
//		LogLevel1(
//				"All Match Demo : returns ==> true if either all elements of the stream match the provided predicate or the stream is empty, otherwise false");
//
//		// All are of not age 2
//		System.out.println(persons.stream().allMatch(p -> p.age == 2)); // false
//		// List are Male Persons
//		System.out
//				.println(persons.stream().filter(p -> p.gender == Gender.MALE).allMatch(p -> p.gender == Gender.MALE)); // true
//		// List is Empty
//		System.out
//				.println(persons.stream().filter(p -> p.gender == Gender.THIRD).allMatch(p -> p.gender == Gender.MALE));// true
//
//		LogLevel1(
//				"anyMatch() :: returns - true if any elements of the stream match the provided predicate, otherwise false");
//
//		LogLevel1("map:");
//		System.out.println(
//				persons.stream().filter(p -> p.gender == Gender.MALE).map(p -> p.name).collect(Collectors.toList())); // [Bob,
//																														// Paul,
//																														// Jack,
//																														// Jack]
//		System.out.println(
//				persons.stream().filter(p -> p.gender == Gender.MALE).map(p -> p.age).collect(Collectors.toList())); // [20,
//																														// 32,
//																														// 2,
//				Comparator l = null;																						// 72]
//
//	
//	
//	
//	
//	
//	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");

		System.out.println("The distinct elements are :");

// Displaying the distinct elements in the list 
// using Stream.distinct() method 
		list.stream().distinct().forEach(System.out::println);
	}

}
