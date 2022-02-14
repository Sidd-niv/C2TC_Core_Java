package com.Generics_pracs_tns;
import com.Generics_pracs_tns.Animals;
import java.util.*;


// Creating a Unbounded type of Generic class 
class AnimalPrinter1<T>
{
	T object_name;
	
	AnimalPrinter1(T objects)
	{
		this.object_name = objects;
	}
	
	
	public void Printer1() 
	{
		System.out.println(object_name);
	}
}

//Creating a bounded type of Generic class 
class AnimalPrinter2<T extends Cat>
{
	T object_name;
	
	AnimalPrinter2(T objects)
	{
		this.object_name = objects;
	}
	
	
	public void Printer2() 
	{
		System.out.println(object_name);
	}
}

public class Generics_class_demo {

	public static void main(String[] args) {
		
		// Defining objects of class cat and dog
		Cat catObj_1 = new Cat("Cat_3");
		Dog dogObj_1 = new Dog("Dog_1");
		
		// Example of Bounded class generic.
		AnimalPrinter2<Cat> Animal_obj_1 = new AnimalPrinter2<>(catObj_1);
		Animal_obj_1.Printer2(); // Prints: Cat_3
		
		// Since it is a bounded type generic we can't pass dog class object
        // AnimalPrinter2<Cat> Animal_obj_2 = new AnimalPrinter2<>(dogObj_2);
        // Animal_obj_2.Printer2();
		
		
		// Example of Unbounded class generic.
		// Defining objects of class AnimalPrinter1 and initializing
		AnimalPrinter1<Cat> Animal_obj_2 = new AnimalPrinter1<>(catObj_1);
		AnimalPrinter1<Dog> Animal_obj_3 = new AnimalPrinter1<>(dogObj_1);
		
		Animal_obj_2.Printer1();
		Animal_obj_3.Printer1();

	}

}
