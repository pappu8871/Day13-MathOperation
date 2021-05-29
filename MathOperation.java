package com.practiceproblem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberDoubleUC4 {

	public static void main(String[] args) {

		//create collection
				List<Integer>myNumberList = new ArrayList<Integer>();
			    for(int i = 0; i<5; i++) myNumberList.add(i);
			

			    //Implicit Lambda Function to print double Value
			    
			    Function<Integer,Double> toDoubleFunction = n -> n.doubleValue(); 
			    myNumberList.forEach(n -> {
					 System.out.println("Math1:forEach Lambda impl Value::" + 
				toDoubleFunction.apply(n));
			    });
	}
 }
