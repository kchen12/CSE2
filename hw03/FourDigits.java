// Kevin Chen
// 9/16/14
// CSE 02 FourDigits
// prints out the four digits right of the decimal of the double the user inputs
//
import java.util.Scanner;
// new scanner class
public class FourDigits{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");
        double n1 = myScanner.nextDouble();
        int n2 = (int)n1;
        n2 = n2*10000;
        double n3 = n1*10000;
        int n4 = (int)n3;
        int n5 = n4 - n2;
        String result = String.format("%04d", n5);
        System.out.println("The four digits are " +result+ ".");
    }
}