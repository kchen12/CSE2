// Kevin Chen
// 10/14/14
// CSE 02 Root
// calculate the square root of a number
//
import java.util.Scanner;  // import the scanner

public class Root{
    public static void main(String[] args){
        
        Scanner myScanner;  // declare scanner
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a positive double: ");  // prompt user to enter a positive double
        
        if(!myScanner.hasNextDouble()){  // check to see if the user entered a double
            System.out.println("Your input was not a double");
            return;
        }
        
        double uInput = myScanner.nextDouble();
        
        if(uInput > 0){  // check to see if the double is positive
        
            // declare the variables for the calculation
            double low = 0;
            double high = 1 + uInput;
            double middle = (low+high)/2;
            double midSquare = middle*middle;
            double interval = high - low;
            double tolerance = 0.0000001*high;
            
            while(interval > tolerance){  // set condition for the calculations to continue
                
                if(midSquare > uInput){
                high = middle;
                }
                
                else{
                    low = middle;
                }
                
                // reset interval, middle, and midSquare to let the loop continue
                interval = high - low;
                middle = (low+high)/2;
                midSquare = middle*middle;
            }
            
            // print out the square root
            System.out.println("The square root of " +uInput+ " is: " +middle);
            
        }
        else{  // the the user the number is not positive
        
            System.out.println("Your number is not positive");
            
        }
    }
}