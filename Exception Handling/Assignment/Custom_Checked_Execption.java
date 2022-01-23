package Exception_demo;
import java.util.Scanner;

class Invalid_Input_AgeException extends Exception{
	
	Invalid_Input_AgeException(String msg){
		super(msg);
	}
}



public class Custom_Checked_Execption {

	public static void main(String[] args) {
		Custom_Checked_Execption obj = new Custom_Checked_Execption();
		try {
			obj.VotingAge(0);
		}catch (Invalid_Input_AgeException e) {
			e.getMessage();
		}

	}
	
	public void VotingAge(int age) throws Invalid_Input_AgeException {
		if(age>=18) {
		  System.out.println("You are eligible for voting"); 
		}else {
			throw new Invalid_Input_AgeException("You are not eligible");
		}
	}

}