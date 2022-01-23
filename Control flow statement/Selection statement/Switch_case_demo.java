class Switch_case_demo{
  
  public static void main(String[] args){
    int num = 3;
    int x = num
    // Switch accepts only byte, int, short and char datatypes.
    Switch(x){
      // case accepts same datatypes as switch does and we can also pass math expression
      case 1:
        // code
      break;
      
      case 2+3:
         // code
      break;
      
      case x:
        //code
      break;
      
      case 'A':
        //code
      break;
      
      default:
      // It is optional 
    }
    
    //Note:  Without break statement switch case will go under fall through condition
  
    Switch(x){
    // Empty switch.
    }
  }

}
