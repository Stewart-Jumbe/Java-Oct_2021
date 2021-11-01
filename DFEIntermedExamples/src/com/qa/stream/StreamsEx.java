package com.qa.stream;

import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsEx {
// Practising some functional programming in Java
	
//	// Map
//	List<String> greetNames = names.stream().map(e -> "Hello"+e).collect(Collectors.toList());
//	//greetNames.forEach(System.out::println); alternative of the line below
//	greetNames.forEach(n -> System.out.println(n));
//	System.out.println();//making space in the console
//	//numbers.stream().map(i -> i*i).forEach(n_-> System.out.println(n));	
	
	
//1.Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".	
public static void main(String[] args) {
//List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
//List<String> filteredNames = names.stream().filter(name->!(name.startsWith("J"))).collect(Collectors.toList());
//List<String> helloeveryone = filteredNames.stream().map(name -> "Hello " + name ).collect(Collectors.toList());

List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");
//List<String> greetedNames = names.stream().map(name -> "Hello" + name).collect(Collectors.toList());
names.forEach(name -> {
	if(!(name.startsWith("J"))) System.out.println("Hello " + name);
	else System.out.println(name);
	});

//names.stream().map(n -> !"james".equalsIgnoreCase(n) ? "Hello ".concat(n) : n).forEach(System.out::println);

//2.Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).

List<Integer> number = Arrays.asList(3,4,7,8,12);
int reduced = number.stream().reduce((a,b) -> a*b).get();
System.out.println(reduced);

IntStream zeroToThirty = IntStream.range(0, 30);// auto generates numbers
zeroToThirty.forEach(System.out::println);

}
public static void ex3() {
//int maxnum = number.stream().max(null)
//3.Starting with a list of numbers, use streams to do the following:
//Find the max value.
//Find the min value.
//Remove the odd numbers.
//Remove the even numbers.
//Find the sum of the list.
//Square every number in the list then remove the even numbers and then find the min value.

	int[] nums = {1,2,3,4,5};	
	int max = Arrays.stream(nums.max().getAsInt());
	int min = Arrays.stream(nums.min().getAsInt());
	
	
//	List<Intefer> numbers = Arrays.asList(1,2,3,4,5);
//	int max2 = numbers.stream().max(Comparator.comparingInt());
}


}


