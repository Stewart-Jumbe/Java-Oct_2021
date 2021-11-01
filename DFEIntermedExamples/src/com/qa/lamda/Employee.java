package com.qa.lamda;
	//Creating Employee class that will be called my main

		public class Employee{
			
			private String name;
			private int age;
			
			//Constructors
			public Employee(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			
				//Getters and Setter	
				
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}
			// To String

			@Override
			public String toString() {
				return "Employee [name=" + name + ", age=" + age + "]";
			}
			
		}
		


