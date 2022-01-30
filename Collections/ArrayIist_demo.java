/*
 * The Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main “root” interfaces of Java collection classes.
 * In those interface various methods are declared 
 * These methods are implemented by various collections classes e.g.. ArrayList, vector, LinkedList, Stack etc.
 * In this code we will see ArrayList which implements List interface. 
*/



/** 
* In this code we will see how to use ArrayLists in java.
* ArrayList are the part of collections framework and implements List interface.
* ArrayLists can store both homogeneous and heterogeneous data with growable size.
* In this ArrayList we can store null and duplicate values also.
**/

package com.collection_pracs_TNS;

// Importing ArrayList from java.util package.
import java.util.ArrayList;

public class ArrayIist_demo {

	public static void main(String[] args) {
		
		//  Creating ArrayList of both homogeneous and heterogeneous type 
		//  i.e..It is a collection different types of object
		ArrayList<Object> arr_list1 = new ArrayList<>();
		
		//  Creating ArrayList with Type Parameter of Integer wrapper object 
		//  It will hold only Integer objects only.
		ArrayList<Integer> arr_Int_list = new ArrayList<>();
		
		//Add items to ArrayList i.e.. arr_list1 with .add() method
		arr_list1.add("Sid");
		arr_list1.add(57);
		arr_list1.add(57);
		arr_list1.add("A");
		arr_list1.add(null);
		arr_list1.add(34.56f);
		
		// Print the List.
	    System.out.println(arr_list1+"\n");
	    
	    // Collection of different Wrapper objects 
	    for(int i=0; i<arr_list1.size(); i++) {
	    	if(arr_list1.get(i) == null) {
	    		System.out.println("null object");
	    	}else {System.out.println(arr_list1.get(i).getClass());}
	    }
	    System.out.println("\n");
		
		
		//Add items to ArrayList i.e.. arr_list2 with .add() method
	    arr_Int_list.add(487);
	    arr_Int_list.add(23);
	    arr_Int_list.add(null);
	    arr_Int_list.add(23);
		
		// Print the List.
		System.out.println(arr_Int_list+"\n");
		
		// Objects belongs to Integer wrapper class
		for(int i=0; i<arr_Int_list.size(); i++) {
	    	if(arr_Int_list.get(i) == null) {
	    		System.out.println("null object");
	    	}else {System.out.println(arr_Int_list.get(i).getClass());}
	    }
	    
	    
	    /**Similarly we can create any type Wrapper object ArrayList**/

	}

}
