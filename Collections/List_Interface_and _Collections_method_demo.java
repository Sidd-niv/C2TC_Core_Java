package com.Collections_demo_TNS;
/**
 * List interface is the child interface of collection interface.
 * List interface is implemented by ArrayList, vector ,Stack etc.
 * List interface can be used for reference while creating a object of a class.
 * In this code we will use Collections class static methods with the help of List interface.
**/


// Importing required class from java util package
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Interface_Collections_method_demo {

	public static void main(String[] args) {
		
		// Creating a ArrayList with List interface 
		List<Object> arr_list1 = new ArrayList<>();
		
		// Creating Integer ArrayList with Generics
		// Generics means parameterized types with that we can specify the which type of object should be added in the collections.
		List<Integer> arr_list2 = new ArrayList<>();
		List<Integer> arr_list3 = new ArrayList<>();
		
		// .addAll() method is a static method of collections class which adds multiple objects at one time in ArrayList()
		Collections.addAll(arr_list1, 'A', "B", 3, 23455, 34.55, true);
		Collections.addAll(arr_list2, 5, 8, 4, 2, 1, 100, 8);
		Collections.addAll(arr_list3, 10000, 100, 8000, 4, 8, 456, 7);
		
		System.out.println(arr_list1);
		System.out.println(arr_list2);
		
		// .set() method add objects at specified index value.
		// This method removes the index value object to add new object at that index value.
		System.out.println("Initial arr_list1: "+arr_list1);
		arr_list1.set(3, "Siddhant");
		System.out.println("final arr_list1: "+arr_list1);
		
		//.sort() is a static method of collections class which sorts the ArrayList
		System.out.println("Initial arr_list2: "+arr_list2);
	        Collections.sort(arr_list2);
		System.out.println("Sorted arr_list2: "+arr_list2);
		
		// .binarySearch() method is the static method of Collections class.
		// This method searches the key using binary search in the specified list. 
		// This method is only applicable for numeric objects.
		System.out.println(Collections.binarySearch(arr_list2, 4));
		
		// .copy() method of Collections class copy all the objects from one ArrayList to another ArrayList.
		System.out.println("Initial arr_list3: "+arr_list3);
		Collections.copy(arr_list3, arr_list2);
		System.out.println("After copying all object from arr_list1 to arr_list3: "+arr_list3);
		
	}

}
