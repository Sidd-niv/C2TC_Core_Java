package com.Generics_pracs_tns;

public class Animals {
	
	void Animal() 
	{
		System.out.println("This is a animal class");
	}
	
}

class Cat extends Animals
{
	String name;
	
    public Cat(String name){
		this.name = name;
	}
	

	void sounds()
	{
		System.out.println("Meow");
	}
	
	void food() {
		System.out.println("Fish");
	}
	
	public String toString()
	{
		return this.name;
	}
	
}

class Dog extends Animals
{
	String name;
	
	Dog(String name){
		this.name = name;
	}
	void sounds()
	{
		System.out.println("Booho");
	}
	
	void food() {
		System.out.println("Chinken");
	}
	
	public String toString()
	{
		return this.name;
	}
}
