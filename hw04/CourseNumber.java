// Kevin Chen
// 9/23/14
// CSE 02 CourseNumber
// prints out the semester and year of a course depending on a six digit number

import java.util.Scanner;
// new scanner class
public class CourseNumber{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter a six digit number : "); // promtp user to enter a number of a month
        
        if (myScanner.hasNextInt()){ // check if user input an int
            int ndigits = myScanner.nextInt();
            if (ndigits>=186510 && ndigits<=201440){ // check if user input a positive int
                
                int ndigitsYear = ndigits/100;  // obtain the year by cutting off the last two digits through dividing by 100
                double ndigitsSem = ndigits/100.0;
                int ndigitsSem1 = (int)ndigitsSem*100;
                int ndigitsSem2 = ndigits - ndigitsSem1;  // obtain last two digits by "zeroing" the last two digits and subtracting the original from the zeroed
                String sem;
                
                if (ndigitsSem2 == 10){
                    sem = "Spring";
                    System.out.println("The course was offered in the " +sem+ " of " +ndigitsYear);  // print out spring condition
                }
                if (ndigitsSem2 == 20){
                    sem = "Summer 1";
                    System.out.println("The course was offered in the " +sem+ " of " +ndigitsYear);  // print out summer 1 condition
                }
                if (ndigitsSem2 == 30){
                    sem = "Summer 2";
                    System.out.println("The course was offered in the " +sem+ " of " +ndigitsYear);  // print out summer 2 condition
                }
                if (ndigitsSem2 == 40){
                    sem = "Fall";
                    System.out.println("The course was offered in the " +sem+ " of " +ndigitsYear);  // print out fall condition
                }
                if (ndigitsSem2 != 10 && ndigitsSem2 != 20 && ndigitsSem2 != 30 && ndigitsSem2 != 40){
                    System.out.println(ndigitsSem2+ " is not a legitimate semester");
                    return;
                }
            }
            else{
                System.out.println("The number was outside the range [186510,201440]");
            }
        }
        else{
            System.out.println("You did not enter an int");
            return;
        }
    }
}