
public class Const_demo {
	String name;
	int roll_no; 
	int r;
	public Const_demo(String name, int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
}
	public static void main(String[] args) {
		Const_demo obj1=new Const_demo("Siddhant", 03);
		System.out.println("Constructor as initialized the value"+  ": "+ obj1.name +" "+ obj1.roll_no);
        int [][] x =new int [2][3];
        System.out.println(x);
        System.out.println(x[0]);
        System.out.println(x[0][0]);
	}

}

