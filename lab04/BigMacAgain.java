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
                System.out.println("You ordered " +nBigMacs+ " Big Macs for a cost of " +bigMac$+ " dollars.");
            }
            else{
                System.out.println("Your int was not greater than zero");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");
            return; // the program ends
        }
    }
}