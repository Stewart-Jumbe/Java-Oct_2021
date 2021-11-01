package com.qa.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MoreLambda {
	
	public static void main(String[] args) {
		
		// Creating employees
		
		Employee john = new Employee("John Smith",25);
		Employee elli = new Employee("Elli North",27);
		Employee lee = new Employee("Lee Fox",30);
		Employee dot = new Employee("Dot Wild",29);
		
		//Creating a list to hold type employee
		List<Employee> employees = new ArrayList<>();
		
		//Adding employees to the list
		employees.add(john);
		employees.add(elli);
		employees.add(lee);
		employees.add(dot);
		
		
		//lets sort the employees by name and print the result to the console
		
		//Without using Lambda
//		
//		Collections.sort(employees, new Comparator<Employee>() {//comparator <obj type> has to be the same object type as employees..i.e Employee
//
//			@Override
//			public int compare(Employee employee1, Employee employee2) {
//			
//				return employee1.getName().compareTo(employee2.getName());
//			}
//			
//		});

		//Using Lambda
		Collections.sort(employees, (Employee employee1,Employee employee2)-> employee1.getName().compareTo(employee2.getName()));
		
		
		//For loop to check the values 
		for(Employee x : employees) {
			System.out.println(x.getName());
		}
		
		//Same as above but with normal for loop
//		for( int x=0; x < employees.size();x++) {
//			System.out.println(employees.get(x).getName());
//			
//		}
		
		
		
	}
	
	
	
	
	
	
}
		