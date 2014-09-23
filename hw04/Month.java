// Kevin Chen
// 9/23/14
// CSE 02 Month
// asks the user to enter a month and a year
//
import java.util.Scanner;
// new scanner class
public class Month{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter a month (int between 1 -12): "); // promtp user to enter a number of a month
        
        if (myScanner.hasNextInt()){ // check if user input an int
        
            int nMonth = myScanner.nextInt();
            if (nMonth==1 || nMonth==3 || nMonth==5 || nMonth==7 || nMonth==8 || nMonth==10 || nMonth==12){  // check if the month is one of the 31 day months
                // print out that the month has 31 days
                System.out.println("The month has 31 days");
            }
            // check if the month is one of the 30 day months and print
            if (nMonth == 4){
                System.out.println("The month has 30 days");
            }
            if (nMonth == 6){
                System.out.println("The month has 30 days");
            }
            if (nMonth == 9){
                System.out.println("The month has 30 days");
            }
            if (nMonth == 11){
                System.out.println("The month has 30 days");
            }
            if (nMonth == 2){  // check if the month is february
                System.out.print("enter an int giving the year: ");
                if(myScanner.hasNextInt()){  // check if the user input an int
                    int nYear = myScanner.nextInt();
                    double nYear2 = (double)nYear/4;
                    int nYear3 = (int)nYear2;  // set up so that we can compare the leap year with a normal year
                    if(nYear2 == nYear3){  // check if the month is a leap year
                        System.out.println("The month has 29 days");  // print 29 days
                    }
                    else{
                        System.out.println("The month has 28 days");  // print 28 days
                    }
                }
                else{
                    System.out.println("You did not enter an int");  // tell user they did not enter an int
                }
            }
            if (nMonth<1 || nMonth>12){  // tell user they did not enter a number 1 -12
                System.out.println("Your number did not correspond to a month");
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");  // tell user they did not enter an int
            return;
        }
    }
}