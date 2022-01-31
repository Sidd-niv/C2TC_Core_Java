/**
 * In this code we will demonstrate the methods related to collection framework.
 **/

package com.collection_pracs_TNS;
import java.util.ArrayList;

public class ArrayList_methods_demo {

	public static void main(String[] args) {
		
		// Initializing ArrayList of mix objects with Generics
		ArrayList<Object> arr_list = new ArrayList<>();
		
		// Inserting items with .add() method
		arr_list.add(10);
		arr_list.add(2);
		arr_list.add("A");
		arr_list.add('B');
		arr_list.add(34.5f);
		arr_list.add(true);
		arr_list.add(45.56754d);
		
		// Inserting items at specific index with .add(Integer index.no, item) method
		arr_list.add(0, 0 );
		arr_list.add(3, 8 );
		System.out.println(arr_list);
		// Note .add() will add items at that index and it will shift other items forward.
		
		// .size() method will return the length of collection 
		System.out.println(arr_list.size());
		
		// .remove() will remove the object from the collection 
		arr_list.remove(2);
		System.out.println(arr_list);
		
		// .isEmpty() will check whether the collection is empty or not.
		ArrayList<Integer> arr_list2 = new ArrayList<>();
		System.out.println(arr_list2.isEmpty());
		
		// .contains() method will check the object is there in the collection or not.
		System.out.println(arr_list.contains("A"));
		System.out.println(arr_list.contains("Sidd"));
		
		// .equals() method will compare the passed object is there in collection or not
		System.out.println(arr_list.equals("S"));
		
		// clear() method will remove all objects from ArrayList collection.
		arr_list.clear();
		System.out.println(arr_list);

	}

}
