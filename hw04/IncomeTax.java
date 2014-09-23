// Kevin Chen
// 9/23/14
// CSE 02 IncomeTax
// returns the amount of tax depending on income
//
import java.util.Scanner;
// new scanner class
public class IncomeTax{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.print("Enter an int giving the income in thousands: "); //promt user to enter income in thousands
        double tax;
        
        if (myScanner.hasNextInt()){ // check if user input an int
        
            int income = myScanner.nextInt();
            
            if(0<=income && income<20){  // check if income is between 0 and 20
                tax = income*0.05*1000;  // compute the tax
                double tax1 = tax*100;  // convert tax double to one decimal
                int tax2 = (int)tax1;
                double tax3 = tax2/100;
                System.out.println("The tax rate on $" +income+ ",000 is 5%, and the tax is $" +tax3+ ".");  // print out the tax rate and value
            }
            if(20<=income && income<40){  // check if income is between 20 and 40
                tax = income*0.07*1000;  //  compute tax
                double tax1 = tax*100;  // convert tax double to one decimal
                int tax2 = (int)tax1;
                double tax3 = tax2/100;
                System.out.println("The tax rate on $" +income+ ",000 is 7%, and the tax is $" +tax3+ ".");  // print out the tax rate and value
            }
            if(40<=income && income<78){  // check if income is between 40 and 78
                tax = income*0.12*1000;  // compute tax
                double tax1 = tax*100;  // convert to one decimal
                int tax2 = (int)tax1;
                double tax3 = tax2/100;
                System.out.println("The tax rate on $" +income+ ",000 is 12%, and the tax is $" +tax3+ ".");  // print out the tax rate and value
            }
            if(78<=income){  // check if income is greater than 78
                tax = income*0.14*1000;  // compute tax
                double tax1 = tax*100;  // convert to one decimal
                int tax2 = (int)tax1;
                double tax3 = tax2/100;
                System.out.println("The tax rate on $" +income+ ",000 is 14%, and the tax is $" +tax3+ ".");  // print out the tax rate and value
            }
            if(income<0){
                System.out.println("You did not enter a positive int"); // tell user they did not enter a positive int
                return;
            }
        }
        else{
            System.out.println("You did not enter an int");  // tell user they did not enter an int
            return;
        }
    }
}