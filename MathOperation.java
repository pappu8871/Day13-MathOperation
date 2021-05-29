package com.practiceproblem;

@FunctionalInterface
interface MathOperation {
int calculate (int a,int b);

static void Result(int a,int b, String function, MathOperation pappu ) {
System.out.println("Result of "+function+" is "+ pappu.calculate(a, b));
}}
public class MathOperationUC2 {

	public static void main(String[] args) {
		
		MathOperation add = (x, y) -> x + y;
		MathOperation substract = (x, y) -> x - y;
		MathOperation divide = (x, y) -> x / y;
		
//		System.out.println("Addition is " + add.calculate(25, 20));
//		System.out.println("Substraction is " + substract.calculate(25, 20));
//	    System.out.println("Division is " + divide.calculate(25, 20));
		
		MathOperation.Result(15, 6, "Addition", add);
		MathOperation.Result(15, 6, "Substraction", substract);
        MathOperation.Result(15, 6, "Division", divide);
	
	}
}



