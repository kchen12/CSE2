// Kevin Chen
// 9/23/14
// CSE 02 TimePadding
// prints out the semester and year of a course depending on a six digit number

import java.util.Scanner;
// new scanner class
public class TimePadding{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter the time in seconds(int) : "); // promtp user to enter the time in seconds
        
        if (myScanner.hasNextInt()){ // check if user input an int
            int nSeconds = myScanner.nextInt();
            if(nSeconds>0){ // check if user input a positive int
                int nMinutes = nSeconds/60; // get the total number of min in int
                int nRemainderS = nSeconds - nMinutes*60;  // get the remaining seconds
                int nHours = nMinutes/60;  //get the total number of hours in int
                int nRemainderM = nMinutes - nHours*60;  // get the remaining minutes
                String result1 = String.format("%02d", nHours);  // format the hour so it shows two digits
                String result2 = String.format("%02d", nRemainderM);  // format the minutes so it shows two digits
                String result3 = String.format("%02d", nRemainderS);  // format the seconds so it shows two digits
                System.out.println("The time is " +result1+ ":" +result2+ ":" +result3);  // print result
            }
            else{
                System.out.println("You did not enter a positive int");  // a positive int is not entered
                return;
            }
            }
            else{
                System.out.println("You did not enter an int");  // an int is not entered
                return;
        }
    }
}