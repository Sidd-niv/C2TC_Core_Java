package com.Array_DS_Pracs;
// In this code to we create our own array of Marvel movie list

// Simple Definition of Marvel list class 
class Marvel_List{
	String film;
	String release_data;
	String director_name;
	
	Marvel_List(String film, String release_data, String director_name){
		this.film = film;
		this.release_data = release_data;
		this.director_name  = director_name;
		
	}
	
	
	// toString inbuilt method will return any object content in String format
	// Overriding the toString method to return object content of class Marvel_List whenever the object is invoke.
	public String toString() {
		return this.film+" directed by "+this.director_name+" and released on "+this.release_data;
	}
	
	
	// This method will return the array item if it is present in array or it will return null
	static public String get_movie(Marvel_List [] arr, String items) {
		String return_items = null;
		for(Marvel_List a: arr) {
			if(a.toString().contains(items)) {
				 return_items = a.toString();
			}
		}
		return "Data is not persent in list.";
		 
	}
}







public class Marvel_List_Demo {

	public static void main(String[] args) {
		Marvel_List[] arr_list = new Marvel_List[3];
		
		
		Marvel_List movie1 = new Marvel_List("Captain America: The First Avenger", "July 22, 2011", "Joe Johnston");
		Marvel_List movie2 = new Marvel_List("Marvel's The Avengers", "May 4, 2012", "	Joss Whedon");
		Marvel_List movie3 = new Marvel_List("Iron Man 3", "May 3, 2013", "Shane Black");
		
		arr_list[0] = movie1;
		arr_list[1] = movie2;
		arr_list[2] = movie3;
		
		Marvel_List.get_movie(arr_list, "Sidd");
		System.out.println(Marvel_List.get_movie(arr_list, "Sidd"));
		
		
	}

	
		
	}


