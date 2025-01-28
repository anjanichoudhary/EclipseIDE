import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test123 {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> ls=Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		List<Integer> values = Arrays.asList(3,2,2,5,1,7,8,7);
		//Print unique number from this Array
		//Sort the array -3rd index 1,2,3,5,7,8
		values.stream().distinct().forEach(s->System.out.println(s));
		System.out.println("+++++++++++++++++++");
		List<Integer> lis= values.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(lis.get(2));
		
		
		
		

		/*
		 * // ArrayList<String> names = new ArrayList<String>();
		 * 
		 * // Print namrs which have last letter as "a" with Uppercase
		 * Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s ->
		 * s.endsWith("a")).map(s -> s.toUpperCase()) .forEach(s ->
		 * System.out.println(s)); System.out.println("====================");
		 * 
		 * // print names with have first letter as a with Uppercase and sorted
		 * List<String> names1 = Arrays.asList("Ankur", "Anand", "Nirma", "Cofee",
		 * "Azbhijeet"); List<String> names = Arrays.asList("Azbhijeet", "Don",
		 * "Alekhya", "Adam", "Ram"); names.stream().filter(s ->
		 * s.startsWith("A")).sorted().map(s -> s.toUpperCase()) .forEach(s ->
		 * System.out.println(s));
		 * System.out.println("-------------------------------"); Stream<String>
		 * newStream = Stream.concat(names.stream(), names1.stream()); //
		 * newStream.sorted().forEach(s->System.out.println(s)); boolean flag =
		 * newStream.anyMatch(s -> s.equalsIgnoreCase("Don")); System.out.println(flag);
		 * Assert.assertTrue(flag);
		 */
		

		/*
		 * names.add("Abhijeet"); names.add("Don"); names.add("Alekhya");
		 * names.add("Adam"); names.add("Ram"); int count = 0; for (int i = 0; i <
		 * names.size(); i++) { String actual = names.get(i); if
		 * (actual.startsWith("A")) { count++; } } System.out.println(count);
		 * names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println
		 * ((s)));
		 */
	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// There is no life for intermediate op if there is no terminal op
		// Terminal operation will execute only if inner op (filter) returns true
		// We can create stream
		// how to use filter in Stream API
		Long c = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

		long d = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);
		// print all the name of ArrayList
		// names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println((s)));
	}

	@Test
	public void streamMap() {
		// Print namrs which have last letter as "a" with Uppercase
		Stream.of("Azbhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("====================");

		// print names with have first letter as a with Uppercase and sorted
		List<String> names1 = Arrays.asList("Ankur", "Anand", "Nirma", "Cofee", "Azbhijeet");
		List<String> names = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Ram");
		names.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));
		System.out.println("-------------------------------");
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		// newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Don"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void streamCollection()
	{
		List<String> ls=Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		
		
	}
}
