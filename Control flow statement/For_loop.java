
public class For_loop {
	public static void main(String[] args) {
		System.out.println("Syntax Error due to multiple typecast for same variable");
		System.out.println("for(int a=0, -->int b=2; a<b; a++,b--)");
		for(int a=0, int b=2; a<b; a++,b--)
			System.out.println("Hello");
		for(int a=0; a<5; a++); // Empty Statement
// Invalid syntax for(int a=0, char b="S"; a<=7) we can't declare different datatype.
		for(int a=0; ;a++)
    		System.out.println("Hello");  // Infinite loop because of skip condition statement
		System.out.println("reached");
	}

}
