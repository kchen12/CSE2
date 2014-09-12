// Kevin Chen
// 9/12/14
// CSE 02 BigMac
// this program calculates the cost for buying big macs
//
import java.util.Scanner;
// new scanner class
//
//
public class BigMac {
    			  // main method required for every Java program
   			  public static void main(String[] args) {
   			       Scanner myScanner; //declare scanner
   			       myScanner = new Scanner( System.in );
   			       System.out.print("Enter the number of Big Macs(an integer > 0): "); //promt user to enter bigmac numbers
   			       int nBigMacs = myScanner.nextInt();
   			       System.out.print("Enter the cost per Big Mac as"+" a double (in the form xx.xx): " ); //promt user to enter the cost of big mac
                   double bigMac$ = myScanner.nextDouble();
	               System.out.print( "Enter the percent tax as a whole number (xx): "); //promt user to enter tax of big mac
                   double taxRate = myScanner.nextDouble();
                   taxRate/=100; //user enters percent, but I want //proportion
                   double cost$;
                   int dollars,dimes, pennies; //for storing digits
                    //to the right of the decimal point 
                    //for the cost$ 
                    cost$ = nBigMacs*bigMac$*(1+taxRate);
                    //get the whole amount, dropping decimal fraction
                    dollars=(int)cost$;
                    //get dimes amount, e.g., 
                    // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
                    //  where the % (mod) operator returns the remainder
                    //  after the division:   583%100 -> 83, 27%5 -> 2 
                    dimes=(int)(cost$*10)%10; //getting number of dimes
                    pennies=(int)(cost$*100)%10; //getting number of pennies
                    System.out.println("The total cost of " +nBigMacs
                     +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +  
                     " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);

         		  }  //end of main method   
  } //end of class
