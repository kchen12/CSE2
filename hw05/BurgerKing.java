// Kevin Chen
// 9/30/14
// CSE 02 BurgerKing
// prompts user to enter choice given multiple options
//
import java.util.Scanner;
// new scanner class
public class BurgerKing{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        System.out.println("Enter a letter to indicate a choice of ");  // prompt user to enter a choice
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        String uInput = myScanner.next();  // declare scanner
        
        if (uInput.length() == 1){  // check if user entered one character
            switch(uInput){
                case "B":
                case "b":  // case burger
                    System.out.println("Enter 'A' or 'a' for all the fixins");  //  ask what fixin user wants
                    System.out.println("'C' or 'c' for cheese");
                    System.out.println("'N' or 'n' for none of the above ");
                    String uFixins = myScanner.next();
                    
                    if (uFixins.length() == 1){
                        switch(uFixins){
                            // print out the final order for burger
                            case "A":
                            case "a":
                                System.out.println("You ordered a burger with all the fixins");
                                break;
                            case "C":
                            case "c":
                                System.out.println("You ordered a burger with cheese");
                                break;
                            case "N":
                            case "n":
                                System.out.println("You ordered a plain burger");
                                break;
                            default:
                                System.out.println(uInput + "is not one of 'A', 'a', 'C', 'c', 'N', 'n'");  // tell user they did not entered a legitimate string
                        }
                    }
                    else{
                        System.out.println("A single character expected");  // tell user they entered more than one character
                    }
                    
                    break;
                case"S":
                case"s":  // case soda
                    System.out.println("Enter 'P' or 'p' for Pepsi");  // ask what beverage user wants
                    System.out.println("'S' or 's' for Sprite");
                    System.out.println("'C' or 'c' for Coke");
                    System.out.println("'M' or 'm' for Mountain Dew ");
                    String uBev = myScanner.next();
                    
                    if (uBev.length() == 1){
                        switch(uBev){
                            // print out final order for beverages
                            case "P":
                            case "p":
                                System.out.println("You ordered a Pepsi");
                                break;
                            case "C":
                            case "c":
                                System.out.println("You ordered a Coke");
                                break;
                            case "S":
                            case "s":
                                System.out.println("You ordered a Sprite");
                                break;
                            case "M":
                            case "m":
                                System.out.println("You ordered a Mountain Dew");
                                break;
                            default:
                                System.out.println(uInput + "is not one of 'A', 'a', 'C', 'c', 'N', 'n'");  // tell user they did not entered a legitimate string
                        }
                    }
                    else{
                        System.out.println("A single character expected");  // tell user they entered more than one character
                    }
                    break;
                case"F":
                case"f":  // case fries
                    System.out.println("Do you want a large or small order of fries? (L, l, S, or s)");  // ask what size fries the user wants
                    String uFries = myScanner.next();
                    
                    if (uFries.length() == 1){
                        switch(uFries){
                            // print out final order for fries
                            case "L":
                            case "l":
                                System.out.println("You ordered large fries");
                                break;
                            case "S":
                            case "s":
                                System.out.println("You ordered small fries");
                                break;
                            default:
                                System.out.println(uInput + "is not one of 'A', 'a', 'C', 'c', 'N', 'n'");  // tell user they did not entered a legitimate string
                        }
                    }
                    else{
                        System.out.println("A single character expected");  // tell user they entered more than one character
                    }
                    break;
                default:
                    System.out.println(uInput + "is not one of 'B', 'b', 'S', 's', 'F', 'f'");  // tell user they did not entered a legitimate string
            }
        
            
        }
        else{
            System.out.println("A single character expected");  // tell user they entered more than one character
        }
        
    }
}