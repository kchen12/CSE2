// Kevin Chen
// 9/26/14
// CSE 02 RandomGames
// Plays either roulette, craps or pick a card depending on user input

import java.util.Scanner;
// new scanner class
public class RandomGames{
    public static void main(String[] args) {
        Scanner myScanner; //declare scanner
        myScanner = new Scanner( System.in );
        
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card- "); // prompt user to choose a game to play
        String uInput = myScanner.next();  // declare scanner
        
        
        if (uInput.length() == 1){  // check if the user input on character
            
            switch(uInput){  // condition the three different type of games
                case "R":
                case "r":  // case roulette
                    int roulette = (int)(Math.random()*38);  // random a number between 0 and 37
                    
                    switch (roulette) {
                        case 37:
                            roulette = 00;  // asscociate 37 to 00
                            System.out.println("Roulette: " + roulette);
                            break;
                        default:
                            System.out.println("Roulette: " + roulette);  // print out 00, and 0 to 36
                            break;
                    }
                    
                    break;
                case "C":
                case "c":
                    System.out.println("Craps not implemented yet");  // tell user craps is not implemented yet
                    
                    break;
                case "P":
                case "p":
                    System.out.println("Pick a card not implemented yet");  // tell user pick a card is not implemented yet
                    /*
                    int suit = (int)(Math.random()*4)+1;
                    int nCard = (int)(Math.random()*13)+1;
                    switch (nCard){
                        case 11:
                            String nCard1 = "Jack";
                            break;
                        case 12:
                            String nCard1 = "Queen";
                            break;
                        case 13:
                            String nCard1 = "King";
                            break;
                        case 1:
                            String nCard1 = "Ace";
                            break;
                        default:
                            int nCard1 = nCard;
                            break;
                    }
                    switch (suit){
                        case 1:
                            String suit1 = "Clubs";
                            break;
                        case 2:
                            String suit1 = "Diamonds";
                            break;
                        case 3:
                            String suit1 = "Hearts";
                            break;
                        case 4:
                            String suit1 = "Spades";
                            break;
                    }
                    System.out.println(nCard1 + " of " + suit1);
                    
                    */
                    
                    break;
                default:
                    System.out.println(uInput+ " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");  // tell user they did not enter a required string
                    break;
                
            }
            
            /* 
            if (uInput.equals("R") || uInput.equals("r")){
                
            }
            if (uInput.equals("C") || uInput.equals("c")){
                
            }
            if (uInput.equals("P") || uInput.equals("p")){
                
            }
            if (!uInput.equals("R") && !uInput.equals("r") && !uInput.equals("C") && !uInput.equals("c") && !uInput.equals("P") && !uInput.equals("p")){
                
                    System.out.println(uInput+ " is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
            } 
            */
        }
        else{
            System.out.println("A single character expected");  // tell user they entered more than one character
        }
    }
}