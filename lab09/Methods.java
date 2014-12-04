// Kevin Chen
// 12/4/14
// CSE 02 Methods
// Practice writing methods
//

import java.util.Scanner;

// this is the given main method
public class Methods{
  public static void main(String [] arg){
      
	Scanner scan=new Scanner(System.in);
	int a,b,c;
	System.out.println("Enter three ints");
	a=getInt(scan);
	b=getInt(scan);
	c=getInt(scan);
	System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	System.out.println("The larger of "+a+", "+b+", and "+c+
                   	" is "+larger(a,larger(b,c)));
	System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                   	", and "+c+" are in ascending order");
    
  }
  
  public static int getInt(Scanner scan){  // this method forces the user to continue inputing until they enter an int
      
      while(true){  // the while loop continues to ask user to input until requirements are met
        
        scan = new Scanner(System.in);
        System.out.print("Enter an int- ");
        if(scan.hasNextInt()){  // check if input is an int
        
            int num = scan.nextInt();
            return num;  // if yes, return the int
            
        }
        
        System.out.println("You did not enter an int; try again - ");  // if not, tell user it is not an int, and try again
        
      }
      
  }
  
  public static int larger(int num1, int num2){
      
      if(num1>num2){
          
          return num1;
          
      }
      
      else{
          
          return num2;
          
      }
      
  }
  
  public static boolean ascending(int a, int b, int c){
      
      if(b>a && c>b){
          
          return true;
          
      }
      
      return false;
      
  }
 
/*******SAMPLE RUNS:
Enter three ints
Enter an int- r
You did not enter an int; try again- 3
Enter an int- 8
Enter an int- 9
The larger of 3 and 8 is 8
The larger of 3, 8, and 9 is 9
It is true that 3, 8, and 9 are in ascending order

Enter three ints
Enter an int- 4
Enter an int- 3
Enter an int- 7
The larger of 4 and 3 is 4
The larger of 4, 3, and 7 is 7
It is false that 4, 3, and 7 are in ascending order
*/
}
