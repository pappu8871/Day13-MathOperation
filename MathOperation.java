package com.practiceproblem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberPlayListUC3 {

	public static void main(String[] args) {
 
		//create collection
		List<Integer>myNumberList = new ArrayList<Integer>();
	    for(int i = 0; i<5; i++) myNumberList.add(i);
	
	//using Iterator
	    Iterator<Integer>it = myNumberList.iterator();
	   while(it.hasNext()) {
		   Integer i = it.next();
		   System.out.println("Math1: Iterator Value::" +i);
	   }
	    
	    //Explicit Consumer interface implementation
	   class MyConsumer implements Consumer<Integer> {

		@Override
		public void accept(Integer t) {
		System.out.println("Math2: Conssumerimpl value::" +t);	
		}
	}
	  MyConsumer action = new MyConsumer();
	  myNumberList.forEach(action);
	   
	  //Anonymous Consumer interface implementation
	 myNumberList.forEach(new Consumer<Integer>() {
        @Override
		public void accept(Integer t) {
		System.out.println("Math3: forEach anonymous class Value::" +t);	
			}
		});
	 
	 //Method 4: Explicit Lambda Function
	 Consumer<Integer> myListAction = n -> {
		System.out.println("Math4: forEach Lambda impl Value::" + n);
		};
	 myNumberList.forEach(myListAction);
	 
	 //Implicit Lambda Function
	 myNumberList.forEach(n -> {
		 System.out.println("Math5:forEach Lambda impl Value::" + n);
	 });
	 
	}

}
