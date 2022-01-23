package Exception_demo;

public class Try_catch_finally_demo {

	public static void main(String[] args) {
		try {
			int num=5;
			System.out.println(num/0);
		}catch (ArithmeticException e){
			System.out.println("Exception is handled by catch block: "+e+"\n"+"This type of termination is known as abnornal termination");
		}
		
		try {
			int arr[] = new int[5];
			arr[4] = 5;
		}catch ( Exception e) {
			System.out.println("Exception is handled by catch block: "+e);
		}finally {
			System.out.println("Finally block will always run even if exception is handle by catch block \n"+
		"Note we can also write the handler code in finally block \n"+
					"if  finally is executed then this type of termination is known as normal termination");
		}
		
		try {
			int a=0/0;
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("Outside the try catch and finally block");

	}

}
