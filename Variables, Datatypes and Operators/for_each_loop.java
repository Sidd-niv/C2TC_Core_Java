class Each_demo{
  public static void main(String[] args){
  int arr[] = {2,3, 5, 6}; // Array as been declared with elements
  int num = 0;
  for(int sub_arr: arr){
    num++;
   System.out.println("array element at position "+num+"="+sub_arr);
  }
  }
}
