// Kevin Chen
// 9/16/14
// CSE 02 Root
// estimates the cube root of a number
//
import java.util.Scanner;
// new scanner class
public class Root{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter a number in the form (xx.xx): "); //prompt user to enter a double
        double n1 = myScanner.nextDouble();
        double guess = n1/3;
        guess = (guess*guess*guess+n1)/(3*guess*guess); //use formula provided
        guess = (guess*guess*guess+n1)/(3*guess*guess);
        guess = (guess*guess*guess+n1)/(3*guess*guess);
        guess = (guess*guess*guess+n1)/(3*guess*guess);
        guess = (guess*guess*guess+n1)/(3*guess*guess); //improve accuracy 4 more times
        System.out.println("The cube root of " +n1+ " is " +guess+ ".");
        
    }
}