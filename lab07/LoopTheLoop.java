// Kevin Chen
// 10/10/14
// CSE 02 LoopTheLoop
// write while loops
//
import java.util.Scanner;
// import scanner

public class LoopTheLoop{
   
    public static void main(String[] args){
        Scanner myScanner;  // declare scanner
        myScanner = new Scanner(System.in);
        System.out.print("Enter an int between 1 and 15: ");
        if (!myScanner.hasNextInt()){
            System.out.println("Your input was not an int");
            return;
        }
        int nStars = myScanner.nextInt();
        // declare variables
        if (nStars <= 15 && nStars >= 1) {  // check if user input in the range
          int sCount = 1;
            int counter = 1;
            // print first line of stars
            while(sCount <= nStars){
                System.out.print("*");
                sCount++;
            }
            System.out.println();
            sCount = 1;
            // print the pyramid of stars
            while(sCount <= nStars) {
                while(counter < sCount-1) {
                    System.out.print("*");
                    counter++;
                }
            System.out.println("*");
            counter = 0;
            sCount++;
            
            }  
        }
        else{
            System.out.println("Your int was not in the range 1 to 15");
        }
    }
}