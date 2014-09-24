// Kevin Chen
// 9/21/14
// CSE 02 BigMacAgain
// asks user if they want fries or not, then adds it to the total
//
import java.util.Scanner;
// new scanner class
public class BigMacAgain{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter the number of Big Macs(an integer > 0): "); //promt user to enter bigmac numbers
        
        if (myScanner.hasNextInt()){ // check if user input an int
            
            int nBigMacs = myScanner.nextInt();
            double bigMac$;
        
            if (nBigMacs>0){ // check if int is > 0
            
                bigMac$ = nBigMacs*2.22;
                double bigMac1 = bigMac$*100;
                int bigMac2 = (int)bigMac1;
                double bigMac3 = bigMac2/100.0;  // make the cost for Big Macs two decimals
                
                System.out.println("You ordered " +nBigMacs+ " Big Macs for a cost of " +bigMac3+ " dollars.");  // print amount and cost of Big Macs
                
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");  // ask if user wants fries
                String friesOrNo = myScanner.next();
                
                if (friesOrNo.equals("Y") || friesOrNo.equals("y")){  // condition Y and y and print the results
                    
                    System.out.println("You ordered fries at a cost of $2.15");
                    double totalCost = bigMac3 + 2.15;
                    double totalCost1 = totalCost*100;
                    int totalCost2 = (int)totalCost1;
                    double totalCost3 = totalCost2/100.0;  // make the total cost 2 decimals
                    System.out.println("The total cost of the meal is " +totalCost3);
                }
                if (friesOrNo.equals("N") || friesOrNo.equals("n")){  // condition N and n and print the results
                    
                    System.out.println("The total cost of the meal is " +bigMac3);
                }
                if (!friesOrNo.equals("Y") && !friesOrNo.equals("y") && !friesOrNo.equals("N") && !friesOrNo.equals("n")){  // set up condition to respond if user doesn't answer with required answers
                    
                    System.out.println("You did not enter one of the follows: 'Y', 'y', 'N', or 'n'");
                    return;
                }
            }
            else{
                
                System.out.println("Your int was not greater than zero");  //  respond if number of Big Macs is less than zero
                return;
            }
        }
        else{
            
            System.out.println("You did not enter an int");  // respond if number of Big Macs is not and int
            return; // the program ends
        }
    }
}