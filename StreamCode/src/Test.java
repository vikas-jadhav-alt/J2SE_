
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

	@Override
	public int hashCode() {
		return this.name.hashCode();
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

		List<Person> list = new ArrayList<>();

		list.add(new Person("Sara", Gender.FEMALE, 20));
		list.add(new Person("Bob", Gender.FEMALE, 21));
		list.add(new Person("Sara", Gender.FEMALE, 36));
		list.add(new Person("Paul", Gender.FEMALE, 54));

		return list;

	}

}

@FunctionalInterface
interface Random {
	int generateByStrings(String one, String two);
}

public class Test {

//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Geeks", "for", "Geeks", "GeeksQuiz", "for", "GeeksforGeeks");
//
//		System.out.println("The distinct elements are :");
//
//		// Displaying the distinct elements in the list 
//		// using Stream.distinct() method 
//		list.stream().distinct().forEach(System.out::println);
//
//		List<Person> people = Person.createPeople();
//		System.out.println(people);
//
//		System.out.println("===Distinct====");
//		people.stream().distinct().forEach(System.out::println);
//	}
//
//	private static void LogLevel1(String str) {
//		System.out.println("==================>| " + str + " |<==================");
//	}
//
//	private static void LogLevel2(String str) {
//		System.out.println("------------------>| " + str + " |<------------------");
//	}

	public static void main(String[] args) {
		// Initialising a list of integers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Random some = (one, two) -> {
			return one.length() + two.length();

		};

		System.out.println("Random String: " + some.generateByStrings("VCoder", "Amazing"));

		// The stream reduce method takes up a lambda expression where
		// we have the accumulator

		// Inside the accumulator, we need to check that if the number is even,
		// then it must be added to the previous sum.
		Integer sumEven = numbers.stream().reduce(0, (sum, num) -> {
			// Check if the number is even
			if (num % 2 == 0)
				sum += num;
			return sum;
		});

		// Printing the sum of even numbers
		System.out.println(sumEven);

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(1, 2, 3, 4, 5, 6));

		System.out.println(list);
		// [[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]]

		List<Integer> onlyFlat = list.stream().flatMap(x -> x.stream()).collect(Collectors.toList());

		System.out.println(onlyFlat);
		// [1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6]

		List<Integer> withFlapAndMap = list.stream().flatMap(x -> x.stream().map(p -> p * p))
				.collect(Collectors.toList());

		System.out.println(withFlapAndMap);
		// [1, 4, 9, 16, 25, 36, 1, 4, 9, 16, 25, 36]

		Stream<Integer> concat = Stream.concat(Stream.of(1, 2, 3), Stream.of(2, 3, 54));
		System.out.println(concat.collect(Collectors.toList()));

		Stream.iterate(2, (Integer n) -> n * n).limit(5).forEach(System.out::println);

		Stream.iterate(2, (Integer n) -> n * n).limit(5).forEach(str -> System.out.println(str));

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

//		 //output
//		 Filtered value: three
//		 Mapped value: THREE
//		 Filtered value: four
//		 Mapped value: FOUR

		IntStream range = IntStream.range(2, 7);
		range.forEach(System.out::println);

		// Create List -> Then Stream
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = asList.stream();

		// Direct Stream of
		Stream<Integer> ofStream = Stream.of(1, 2, 3, 4);
		Stream nonGenericDouble = Stream.of(1, 2.5, 3, 4);

		// Empty Stream
		Stream<Object> empty = Stream.empty();

		// Array to Stream
		int[] arrInt = new int[] { 1, 2, 3, 4 };
		IntStream intStream = Arrays.stream(arrInt);

		// Stream to Array Object
		Object[] objArray = ofStream.toArray(); // Stream<Integer> ofStream
		int[] array = intStream.toArray(); // IntStream intStream

		/// Printing Array
		System.out.println(Arrays.toString(objArray));

		// String to Char Array

		char[] charArray = "vcoder".toCharArray();

//		List<Integer> collect = ofStream.collect(Collectors.toList());

		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");

//		 There are no guarantees on the type, mutability, serializability, or thread-safety of the List returned; if more control over the returned List is required, use toCollection(Supplier)
		List<String> colList = givenList.stream().collect(Collectors.toList());

		// UnModifiable List: since @Java 10
//		List<String> result = givenList.stream().collect(Collectors.toUnmodifiableList());

		// To Set
		Set<String> resultSet = givenList.stream().collect(Collectors.toSet());

//		Person.createPeople().stream().collect(Collectors.joining());

		System.out.println("-----------INPUT--------------");
		Stream<String> ofString = Stream.of("Rohit", "SixSix", "Vikas", "Sweta", "Saho", "Nehal");
		Set<String> newString = ofString.collect(new CustomCollector());

		System.out.println("-----------OUTPUT--------------");
		newString.forEach(System.out::println);

		System.out.println("-----------OUTPUT--------------");
		Stream<String> ofString2 = Stream.of("Rohit", "SixSix", "Vikas", "Sweta", "Saho", "Nehal");

		ofString2.collect(ArrayList<Integer>::new, (outList, str) -> {
			outList.add(str.length() + 2);
		}, (l1, l2) -> l1.addAll(l2)).forEach(System.out::println);
		;

		/**
		 * toList , toSet There are no guarantees on the type, mutability,
		 * serializability, or thread-safety of the Set/List returned; if more control
		 * over the returned Set/List is required, use toCollection(Supplier).
		 * 
		 */
		// toList , toSet
		List<String> collect = Stream.of("Rohit", "SixSix").collect(Collectors.toList());
		Set<String> collect2 = Stream.of("Rohit", "SixSix").collect(Collectors.toSet());

		LinkedList<String> collect3 = Stream.of("Rohit", "SixSix").collect(Collectors.toCollection(LinkedList::new));

		Map<String, Integer> result = Stream.of("Rohit", "SixSix")
				.collect(Collectors.toMap(Function.identity(), String::length));

		System.out.println(result); // {Rohit=5, SixSix=6}

		// Since Rohit was twice then... rohit's value is replaced by the sum of both
		// lengths + 2 ==> 5+5+2= 12
		Map<String, Integer> result2 = Stream.of("Rohit", "SixSix", "Rohit").collect(Collectors
				.toMap(Function.identity(), String::length, (val1, identicalVal2) -> val1 + identicalVal2 + 2));
		System.out.println(result2); // {SixSix=6, Rohit=12}

		Set<String> collect4 = Stream.of("Rohit", "SixSix", "Rohit")
				.collect(Collectors.collectingAndThen(Collectors.toSet(), (set -> {

					set.add("OneString");
					set.add("TwoString");
					return set;

				})));

		System.out.println(collect4); // [Rohit, SixSix, TwoString, OneString]

		// Defualt downstream is list
		Map<Boolean, List<String>> collect5 = Stream.of("Rohit", "SixSix", "Ramesh")
				.collect(Collectors.partitioningBy(str -> str.startsWith("R")));

		System.out.println(collect5);

		// With DownStream
		Map<Boolean, Set<String>> collect6 = Stream.of("Rohit", "SixSix", "Ramesh")
				.collect(Collectors.partitioningBy(str -> str.startsWith("R"), Collectors.toSet()));
		System.out.println(collect6);

		Map<Integer, List<String>> collect7 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.groupingBy(str -> str.length()));
		System.out.println(collect7);
		// {3=[One, Two, Six], 4=[Four, Five], 5=[Three, Seven]}

		Map<Integer, Set<String>> collect8 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.groupingBy(str -> str.length(), Collectors.toSet()));
		System.out.println(collect8);
		// {3=[Six, One, Two], 4=[Five, Four], 5=[Seven, Three]}

		LinkedHashMap<Integer, Set<String>> collect9 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.groupingBy(str -> str.length(), LinkedHashMap::new, Collectors.toSet()));

		// {3=[Six, One, Two], 5=[Seven, Three], 4=[Five, Four]}
		System.out.println(collect9);

		Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.groupingBy(str -> str.length()));
//System.out.println(collect8);

//		Get Map by String Length
//		Map<Integer, String> collect10 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
//				.collect(Collectors.toMap(str -> str.length(), str -> str));
//		System.out.println(collect10);
//		Exception in thread "main" java.lang.IllegalStateException: Duplicate key 3 (attempted merging values One and Two)

//		Solution Give mergeFunction: replace old value by new value

		Map<Integer, String> collect11 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.toMap(str -> str.length(), str -> str, (oldValue, newValue) -> newValue));
		System.out.println(collect11);
		// {3=Six, 4=Five, 5=Seven}

//		append old value with new value
		Map<Integer, String> collect12 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven").collect(
				Collectors.toMap(str -> str.length(), str -> str, (oldValue, newValue) -> oldValue + ":" + newValue));
		System.out.println(collect12);
		// {3=One:Two:Six, 4=Four:Five, 5=Three:Seven}

		// I want hashMap
		HashMap<Integer, String> collect10 = Stream.of("One", "Two", "Three", "Four", "Five", "Six", "Seven")
				.collect(Collectors.toMap(str -> str.length(), str -> str,
						(oldValue, newValue) -> oldValue + ":" + newValue, HashMap::new));
		System.out.println(collect10);
		// {3=One:Two:Six, 4=Four:Five, 5=Three:Seven}

		Stream<String> streamOfSevenNumbers = Stream.of("One", "Two", "OOne2", "Three", "Four", "Five", "OFour", "Six",
				"Seven");

		
//		List<String> sevenList = Arrays.asList("One", "Two", "OOne2", "Three", "Four", "Five", "OFour", "Six",
//				"Seven");
//		Q: Collect the Str into Uppercase in a Set
		Set<String> collect13 = streamOfSevenNumbers
				.collect(Collectors.mapping(str -> str.toUpperCase(), Collectors.toSet()));
		System.out.println(collect13);
		// [FIVE, SIX, ONE, FOUR, TWO, THREE, SEVEN]

//		Set<String> collect14 = streamOfSevenNumbers.collect(Collectors.filtering(str -> str.length() > 3, Collectors.mapping(str -> str.toUpperCase(), Collectors.toSet())));
//		System.out.println(collect14);

//		streamOfSevenNumbers.collect(Collectors.filtering(str -> str.length() > 3,null));

		
		List<String> sevenList = Arrays.asList("One", "Two", "OOne2", "Three", "Four", "Five", "OFour", "Six",
				"Seven");
		
		
		Map<Integer, Set<String>> collect14 = sevenList.stream().collect(Collectors.groupingBy(str -> str.length(),
				Collectors.mapping(x -> x.toUpperCase(), Collectors.toSet())));
		System.out.println(collect14);
		//{3=[SIX, ONE, TWO], 4=[FIVE, FOUR], 5=[OONE2, THREE, OFOUR, SEVEN]}

	}

}

class CustomCollector implements Collector<String, List<Integer>, Set<String>> {

	@Override
	public Supplier<List<Integer>> supplier() {
		return () -> new ArrayList<Integer>();
	}

	@Override
	public BiConsumer<List<Integer>, String> accumulator() {
		return (list, str) -> {
			System.out.println("Accumulator:\t" + str + "\t: " + str.length());
			list.add(str.length());
		};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return (list1, list2) -> {
			list1.addAll(list2);
			return list1;
		};
	}

	@Override
	public Function<List<Integer>, Set<String>> finisher() {
		return (intList) -> {
			return intList.stream().map(i -> i.toString()).collect(Collectors.toSet());
		};

		// We can also return as it is output: in case we have same : A=R
		// return e -> e;
		// then we can have value for the characteristics as : "IDENTITY_FINISH"
	}

	@Override
	public Set<Characteristics> characteristics() {
		Set<Characteristics> set = new HashSet<>();
		set.add(Characteristics.UNORDERED);
		return set;
	}

}

//class CustomCollectorGeneric implements Collector<T, A, R> {
//
//	@Override
//	public Supplier<A> supplier() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public BiConsumer<A, T> accumulator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public BinaryOperator<A> combiner() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Function<A, R> finisher() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Set<Characteristics> characteristics() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}