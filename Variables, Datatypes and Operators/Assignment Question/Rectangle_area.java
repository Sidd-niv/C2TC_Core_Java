import java.util.Scanner;
class Rectangle_area {

	public static void main(String[] args) {
		int length ; 
		int breadth ;
		System.out.println("Enter the length ");
		Scanner input = new Scanner(System.in);
		length = input.nextInt();
		System.out.println("Enter the Breadth");
		breadth = input.nextInt();
		int area ;
		area = length * breadth;
		System.out.println("Area of Rectangle = "+area);
		input.close();
	}

}

class Square_area {

		public static void main(String[] args) {
			int sides, square_area;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the length of square");
			sides = input.nextInt();
			input.close();
			square_area = sides*sides;
			System.out.println("The Area of Square = "+square_area);
			
		}
		
		
	
}
