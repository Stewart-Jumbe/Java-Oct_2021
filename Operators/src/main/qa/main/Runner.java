package main.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		
		System.out.println(Operators.addMethod());
		System.out.println(Operators.divideMethod());
		System.out.println(Operators.addNums(99, 12));
		System.out.println(Calculator.addMethod(10, 15));
		System.out.println(Calculator.subMethod(10, 15));
		System.out.println(Calculator.multiMethod(10, 15));
		System.out.println(Calculator.divMethod(77.7f, 5.1f));
		System.out.println(Calculator.expoMethod(5, 2));
	}

}
