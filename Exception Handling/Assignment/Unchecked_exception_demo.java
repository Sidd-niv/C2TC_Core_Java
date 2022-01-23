package Exception_demo;

import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Unchecked Exception which can be created by extending RuntimeException class which is the sub-class of Exception class

class InvalidEntryException extends RuntimeException{

	InvalidEntryException(String msg){
		super(msg);
	}
}

public class Unchecked_exception_demo {
	
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		int num = 0;
		while(true) {
			try {
				System.out.println("Enter your age");
			    num = user_input.nextInt();
			}catch (InputMismatchException e  ){
				
			}
			try {
				if(num > 18) {
					System.out.println("You can entry the water ride");
					break;
				}else {
					throw new InvalidEntryException("You are underage");
				}
		}catch (InvalidEntryException e) {
			e.getMessage();	
		}

	}System.out.println("Out of the loop\n");
	// Exception inside a method
	Unchecked_demo2 obj = new Unchecked_demo2();
	try {
	obj.valid_age(num);
	}catch (InvalidEntryException e) {
		e.getMessage();	
	}
	System.out.println("Execption with method");
user_input.close();
}
}

class Unchecked_demo2{
	void valid_age(int n) {
		if(n>18) {
			System.out.println("You can entry the water ride");
	}else {
		throw new InvalidEntry("You are underage");
	}
}
	
}