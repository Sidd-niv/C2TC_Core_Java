package com.Generics_pracs_tns;

import java.util.*;

class Demo_1 {
	
	<T> void m_1(T i)
	{
		System.out.println(i);
	}
	
	// Wildcard operator --> ?
	public static void listprint1(List<?> obj)
	{
		System.out.println(obj);
	}
	
	
}


class Demo_2  {
	
	public static <T extends Number> void listprint2(List<T> obj)
	{
		System.out.println(obj);
	}
	
}




public class Generic_method_Demo {

	public static void main(String[] args) {
		
		// Example of Unbounded generic
		Demo_1 obj1 = new Demo_1(); // Defining object of class Demo_1
		
		obj1.m_1(5);
		obj1.m_1("Siddhant");
		
		List<Integer> list_1 = Arrays.asList(2, 3, 4, 5);
		Demo_1.listprint1(list_1);  // prints:  [2, 3, 4, 5]
		
		
		// Example of Bounded generic 
		Demo_2 obj2 = new Demo_2();
		
		List<Integer> list_2 = Arrays.asList(3, 4, 5, 66);
		List<String> list_3 = Arrays.asList("Siddhant", "Nivilkar");
		
		Demo_2.listprint2(list_2); // Prints: [3, 4, 5, 66]
//		demo_2.listprint2(list_3);  // Error because the method is bounded type  
		

	}

}






