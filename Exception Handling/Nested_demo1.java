package Exception_demo;

public class Nested_demo1 {

	public static void main(String[] args) {
		try {
			int a = 9;
			try {
				int b = a/3;
				int i[] = new int[5];
				i[4] = 7;
				try {
					String s = null;
					System.out.println(s.length());
				}
				catch(ArithmeticException ex){
					System.out.println("Exception handle by Specific");
					System.out.println("Arithmetic msg: " + ex);
				}
			}catch(NullPointerException ex){
				System.out.println("Exception handle by Specific block ");
				System.out.println("Arithmetic msg: " + ex);
			}
			System.out.println("Exception handle");
		}catch(Exception e) {
			System.out.println("Exception handle by Generic");
			System.out.println("Exception messsage: "+ e);
		}
		System.out.println("we can contiune our program");
		
		

	}

}
