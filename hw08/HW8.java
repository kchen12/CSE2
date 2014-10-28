// Kevin Chen
// 10/28/14
// CSE 02 HW8
// Practice creating and calling overload methods
//

import java.util.Scanner;
public class HW8{
    
    public static void main(String []arg){
    
	char input;
	Scanner scan=new Scanner(System.in);
	
	// first program using 2 parameters
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	
	// second  program using 3 parameters
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	
	// third program, uses 3 parameters
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
	
  }
  
    // getInput method for the first part
    public static char getInput(Scanner scan, String b){
      
        scan=new Scanner(System.in);
        
        while(true){  // force the user to keep entering until they enter correctly
        
            String a = scan.next();
            
            if(a.length() == 1){  // check if user entered one character
            
                for(int i = 0; i < b.length(); i++){
                    
                    if(a.charAt(0) == b.charAt(i)){  // check if user entered correctly
                    
                        char inputChar = a.charAt(0);
                        return inputChar;
                    }
                }
                
                System.out.print("You did not enter 'C' or 'c'; try again: ");  // tell user they entered wrong
                
            }
            
            else{
                
                System.out.print("You entered more than 1 character, try again: ");  // tell user they entered more than one character
                
            }
        }
    }
    
    // getInput number 2
    public static char getInput(Scanner scan, String b, int c){
      
        scan=new Scanner(System.in);
        int j = 0;
        
        while(j<c){  // force user to only try up to 5 times
        
            String a = scan.next();
            
            if(a.length() == 1){  // check if user entered one character
            
                for(int i = 0; i < b.length(); i++){
                    
                    if(a.charAt(0) == b.charAt(i)){  // check if user entered correctly
                    
                        char inputChar = a.charAt(0);
                        return inputChar;
                        
                    }
                }
                
                System.out.print("You did not enter a character from the list '"+b+"'; try again: ");  // tell user they entered wrong
                
            }
            
            else{
                
                System.out.print("You entered more than 1 character, try again: ");  // tell user they entered more than one character
                
            }
            
            j++;
            
        }
        
        char fail5 = ' ';
        System.out.println();
        System.out.println("You failed over 5 times");  // tell user they failed 5 times
        return fail5;
        
    }
    
    // getInput method for the first part
    public static char getInput(Scanner scan, String c, String b){
      
        scan=new Scanner(System.in);
        
        System.out.print(c);
        
        while(true){  // force the user to keep entering until they enter correctly
        
            String a = scan.next();
            
            if(a.length() == 1){  // check if user entered one character
            
                for(int i = 0; i < b.length(); i++){
                    
                    if(a.charAt(0) == b.charAt(i)){  // check if user entered correctly
                        char inputChar = a.charAt(0);
                        return inputChar;
                        
                    }
                }
                
                System.out.print("You did not enter a character from the list '"+b+"'; try again: ");  // tell user they entered wrong
                
            }
            
            else{
                
                System.out.print("You entered more than 1 character, try again: ");  // tell user they entered more than one character
                
            }
        }
    }
    
}
