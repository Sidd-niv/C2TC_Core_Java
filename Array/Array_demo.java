// Array is data structure which store similar index element of same datatype

class Array_demo{
  
  public static void main(String[] args){
  // Declaring array with new keyword
    int arr_1[] = new int[3]; // When we create array we need to provide the base size
    // As we just declared the size ,then at memory location each element at that index will be initialized with default value i.e.. 0
  // Declaring array directly 
    int arr_2[] = {2 , 3, 5, 7}; 
   
  // For each loop we print elements
  for(int elements: arr_1){
    System.out.print(elements);
  }
   for(int elements: arr_2){
     System.out.print(elements);
   }
  
  }
}
