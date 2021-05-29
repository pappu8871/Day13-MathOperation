package com.practiceproblem;

@FunctionalInterface
interface IMathOperationUC1 {
int calculate (int a,int b);	
}

public class MathOperationUC1 {
public static void main(String[] args) {
	
	IMathOperationUC1 add = (x, y) -> x + y;
	IMathOperationUC1 substract = (x, y) -> x - y;
	IMathOperationUC1 divide = (x, y) -> x / y;
	
	System.out.println("Addition is " + add.calculate(25, 20));
	System.out.println("Substraction is " + substract.calculate(25, 20));
    System.out.println("Division is " + divide.calculate(25, 20));
}

}
