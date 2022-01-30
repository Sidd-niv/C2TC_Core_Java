/*
 * In this code we will implement multiple inheritance with interface
 * Java doesn't support multiple inheritance because of ambiguous problem
*/

// Declaring interfaces
interface Interface_demo1{
	
	// Method declaration
	void method_01();
}

interface Interface_demo2{
	void method_02();	
}

interface Interface_demo3{
	void method_03();	
}


// To use interface we use implements keyword
public class Multiple_inheritance_demo implements Interface_demo1, Interface_demo2, Interface_demo3{
	
	public void method_01() {
		System.out.println("Interface_demo1 class method");
	}
	
	public void method_02() {
		System.out.println("Interface_demo2 class method");
	}
	
	public void method_03() {
		System.out.println("Interface_demo2 class method");
	}

	public static void main(String[] args) {
		
		// Initializing object
		Multiple_inheritance_demo obj  = new Multiple_inheritance_demo();
		
		System.out.println("Multiple Interitance can be achieved with help of interfaces in java. ");
		
		obj.method_01();
		obj.method_02();
		obj.method_03();
	}

}
