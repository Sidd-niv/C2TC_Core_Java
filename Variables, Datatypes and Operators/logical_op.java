
public class logical_op {
	public static void main(String[] args) {
		int num1 = 7,  num2 = 7;
		// AND logical operator
		if ((num1==num2) && (num1>6)){
			System.out.println("True");
		}
		// AND logical operator
		if ((num1<3) || (num2==5)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		// NOT operator
		boolean human = true;
		if (!human){
			System.out.println("I am human");
		}else {
			System.out.println("I am not a human");
		}
		// Ternary operator
		int x, y;  
		x = 20;  
		y = (x == 1) ? 61: 90;  
		System.out.println("Value of y is: " +  y);  
		y = (x == 20) ? 61: 90;  
		System.out.println("Value of y is: " + y);
		
	}

}
