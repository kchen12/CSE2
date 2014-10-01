// Kevin Chen
// 9/30/14
// CSE 02 BoolaBoola
// tests user in a small boolean value quiz
//
import java.util.Scanner;
// new scanner class
public class BoolaBoola{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );

        // declare the variables
        boolean tf1;
        boolean tf2;
        boolean tf3;
        String op1;
        String op2;
        boolean ans = true;
        
        // use math.random to randomize true or false
        double val1 = Math.random();
        double val2 = Math.random();
        double val3 = Math.random();
        double val4 = Math.random();
        double val5 = Math.random();
        
        if (val1 >= 0.5){
            tf1 = true;
        }
        else{
            tf1 = false;
        }
        if (val2 >= 0.5){
            tf2 = true;
        }
        else{
            tf2 = false;
        }
        if (val3 >= 0.5){
            tf3 = true;
        }
        else{
            tf3 = false;
        }
        if (val4 >= 0.5){
            op1 = "&&";
        }
        else{
            op1 = "||";
        }
        if (val5 >= 0.5){
            op2 = "&&";
        }
        else{
            op2 = "||";
        }
        
        // find the 4 possible operator combinations using a switch statement
        switch(op1){
            case "&&":
                switch(op2){
                    // then find all the outcomes
                    case "&&":
                        if (tf1 && tf2 && tf3){
                            ans = true;
                        }
                        else{
                            ans = false;
                        }
                        break;
                    case "||":
                        if (tf1 && tf2 || tf3){
                            ans = true;
                        }
                        else{
                            ans = false;
                        }
                        break;
                }
                break;
            case "||":
                switch(op2){
                    // find all the outcomes continued, also we store up the correct answer
                    case "&&":
                        if (tf1 || tf2 && tf3){
                            ans = true;
                        }
                        else{
                            ans = false;
                        }
                        break;
                    case "||":
                        if (tf1 || tf2 || tf3){
                            ans = true;
                        }
                        else{
                            ans = false;
                        }
                        break;
                }
                break;
                }
        
        
        System.out.println("Does "+tf1+" "+op1+" "+tf2+" "+op2+" "+tf3+" have the value True(T/t) or False(F/f)?");
        // ask user the true or false question
        
        // System.out.println(""+ans+"");
        
        String uInput = myScanner.next();  // store users input
        boolean uAns = true;
        
        if (uInput.length() == 1){  // check if the user input on character
            switch(uInput){
                // attribute the users answer to boolean true or false
                case "T":
                case "t":
                    uAns = true;
                    // compare user's answer to correct answer
                    if (uAns == ans){
                        System.out.println("Correct");  // print user is correct
                    }
                    else{
                        System.out.println("Wrong"); // print user is wrong
                    }
                    break;
                case "F":
                case "f":
                    uAns = false;
                    // compare user's answer to correct answer
                    if (uAns == ans){
                        System.out.println("Correct");  // print user is correct
                    }
                    else{
                        System.out.println("Wrong; try again");  // print user is wrong
                    }
                    break;
                default:
                    System.out.println(uInput+ " is not one of 'T', 't', 'F', 'f'");  // tell user they did not enter a required string
                    break;
            }
        }
        else{
            System.out.println("A single character expected");  // tell user they entered more than one character
        }
    }
}