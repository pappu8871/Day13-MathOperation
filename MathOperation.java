package com.practiceproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberLIstEvenUC5 {

       public static void main(String[] args) {
//  Use collection
	List<Integer>myNumberList = new ArrayList<Integer>();
	    for(int i = 0; i<5; i++) myNumberList.add(i);
	
	//Implicit Lambda Function to check even
	    Predicate<Integer> isEvenFunction = n -> n > 0 && n%2 == 0 ;
	    myNumberList.forEach(n -> {
	    	System.out.println("Value of: "+n+" check for Even " +isEvenFunction.test(n));
	    });
	    
	}

}
