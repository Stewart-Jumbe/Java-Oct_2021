package com.qa.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	
	public static void main (String[] args){
		
	
		List<String> names = Arrays.asList("Bob","Jim", "Steve", "Clare");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		
		//Foreach
		names.stream().forEach(n -> System.out.println(n));
		
		
		// Filter
		names.stream().filter(e -> e.startsWith("B")).collect(Collectors.toList());//collectors turn the outputs as a list in this example
		names.stream().filter(e -> e.startsWith("B")).forEach(System.out::println);
		
		
		// Map
		List<String> greetNames = names.stream().map(e -> "Hello"+e).collect(Collectors.toList());
		//greetNames.forEach(System.out::println); alternative of the line below
		greetNames.forEach(n -> System.out.println(n));
		System.out.println();//making space in the console
		//numbers.stream().map(i -> i*i).forEach(n_-> System.out.println(n));
		
		//Reduce
		System.out.println("===========");
		Integer reduced = numbers.stream().reduce((a,b)->{
			System.out.print(String.format("num1: %, Num2: %s",a,b));
			return a * b;}).get();
		System.out.println();
		System.out.println(reduced);
		
		
	}
}
