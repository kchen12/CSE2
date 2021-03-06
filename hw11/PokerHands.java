// Kevin Chen
// 12/5/14
// CSE 02 PokerHands
// Rank poker hands
//

import java.util.Scanner;

public class PokerHands{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        String yesNo;
        
        while(true){  // set a loop so that it always asks user to play or not
         
            System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");  // ask user to play or not
            yesNo = scan.next();  // get input
            
            if(yesNo.equals("Y") || yesNo.equals("y")){  // if yes, execute the program
                
            int[] hand = new int[5];
            hand = getHand();  // get hand from method
            
            showOneHand(hand);  // display hand
            
            System.out.println();
            
            int[] frequency = new int[13];
            frequency = combo(hand);  // get the frequency array from combo()
            
            int[] counter = new int[5];
            counter = freqCount(frequency);  // get the counter array
            
            String result = evaluate(frequency, counter, hand);
            
            System.out.println("This is a "+result);  // print result
                
            }
            else{
                return;  // end program if user doesn't enter 'Y' or 'y'
            }
            
        }
        
        
        
    }
    
    // Brian Chen's method
    public static void showOneHand(int hand[]){
        
    	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
    	String face[]={
           "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
      	"4 ","3 ","2 "};
    	String out="";
    	for(int s=0;s<4;s++){
          	out+=suit[s];
          	for(int rank=0;rank<13;rank++)
            	for(int card=0;card<5;card++)
                 	if(hand[card]/13==s && hand[card]%13==rank)
              	out+=face[rank];
          	out+='\n';
    	}
    	System.out.println(out);
    	
    }
    
    public static int[] getHand(){  // this method gets the hand from the user
        
        Scanner scan = new Scanner(System.in);
        
        int[] deck = new int[52];  // assign numbers to each card
        for(int i=0; i<deck.length; i++){
            deck[i]=i;
        }
        
        int[] hand = new int[5];
        
        for(int i=0; i<hand.length; i++){
            
            hand[i]=-1;  // create a hand and set each card value to -1
            
        }
        int suit;
        int rank;
        int i=-1;
        
        while(i<4){  // this loop draws 5 cards
            
            System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
            String suitInput = scan.next();  // get user input
            System.out.println();
            
            switch(suitInput){  // assign suit modulo number with switch statement
                
                case "c":
                    suit = 0;
                    
                    break;
                case "d":
                    suit = 13;
                    
                    break;
                case "h":
                    suit = 26;
                    
                    break;
                case "s":
                    suit = 39;
                    
                    break;
                default:
                    System.out.println("You did not enter a valid response");
                    continue;
                
            }
            
            System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            String rankInput = scan.next();  // get user input for rank
            System.out.println();
            
            switch(rankInput){  // use switch statement to convert and store user input to desired value
                
                case "a":
                    rank = 0;
                    i++;    // to ensure the draw doesn't count if user doesn't
                    break;  // input correctly, only increment i if user inputs
                case "k":   // correctly
                    rank = 1;
                    i++;
                    break;
                case "q":
                    rank = 2;
                    i++;
                    break;
                case "j":
                    rank = 3;
                    i++;
                    break;
                case "10":
                    rank = 4;
                    i++;
                    break;
                case "9":
                    rank = 5;
                    i++;
                    break;
                case "8":
                    rank = 6;
                    i++;
                    break;
                case "7":
                    rank = 7;
                    i++;
                    break;
                case "6":
                    rank = 8;
                    i++;
                    break;
                case "5":
                    rank = 9;
                    i++;
                    break;
                case "4":
                    rank = 10;
                    i++;
                    break;
                case "3":
                    rank = 11;
                    i++;
                    break;
                case "2":
                    rank = 12;
                    i++;
                    break;
                default:
                    System.out.println("You did not enter a valid response");
                    continue;
                
            }
            
            hand[i] = suit + rank;
            
            boolean duplicate = false;
            for(int j=0; j<5; j++){
                if(hand[i]==hand[j]){  // find if user inputs repeated card
                    
                    if(i != j){
                        
                        duplicate = true;
                        System.out.println("You already entered that card");
                        continue;
                    }
                }
            }
            
            if(duplicate){  // redraw if user repeats a card
                
                i--;
                
            }
            
        }
        
        return hand;
        
    }
    
    public static int[] combo(int[] hand){  // this loop gets the frequency of appearance of each card
        
        int[] newHand = new int[5];     // although hand[] is used as an input,
        int[] frequency = new int[13];  // set it to a new array so hand[] doesn't
                                        // get messed up
        for(int i=0; i<newHand.length; i++){
            
            newHand[i] = hand[i];
            
        }
        
        for(int i=0; i<newHand.length; i++){  // modulate the newHand so we only
                                              // care about the rank
            newHand[i]=(int)(newHand[i]%13);
            
        }
        
        for(int i=0; i<newHand.length; i++){
            
            frequency[newHand[i]]++;  // find the frequency of each rank with
                                      // frequency array
        }
        
        return frequency;
        
    }
    
    public static int[] freqCount(int[] frequency){  // this method gets an array that gives how many pairs, triplets, and quartets in the hand
        
        int[] counter = new int[5];
        
        for(int i=0; i<frequency.length; i++){
            
            switch(frequency[i]){  // use switch statement to obtain the pairs, triplets and quartets
                
                case 0:
                    counter[0]++;
                    break;
                case 1:
                    counter[1]++;
                    break;
                case 2:
                    counter[2]++;
                    break;
                case 3:
                    counter[3]++;
                    break;
                case 4:
                    counter[4]++;
                    break;
                
            }
            
        }
        
        return counter;
        
    }
    
    public static String evaluate(int[] frequency, int[] counter, int[] hand){  // this method gives the highest combo of the hand
        
        for(int j=0; j<hand.length; j++){  // get the suit of each card
                        
            hand[j]=(hand[j]/13);
                        
        }
        
        int k = hand[0];
        
        switch(counter[2]){  // use counter[] to determine pairs, triplets and quartets
            
            case 1:
                if(counter[3] == 0){
                    
                    String result = "One Pair";
                    return result;
                    
                }
                
                else{
                    
                    String result = "Full House";
                    return result;
                    
                }
                
            case 2:
                
                String result = "Two Pairs";
                return result;
            
        }
        
        if(counter[3]==1){
            
            String result = "3 of a Kind";
            return result;
            
        }
        
        else if(counter[4]==1){
            
            String result = "4 of a Kind";
            return result;
            
        }
        
        else{
            
            for(int i=0; i<frequency.length; i++){
                
                if(i<=8){
                
                    if(frequency[i]==1 && frequency[i+1]==1 && frequency[i+2]==1 && frequency[i+3]==1 && frequency[i+4]==1){
                        // this statement determines straights
                        int l = 0;
                        
                        for(int j=0; j<hand.length; j++){
                            
                            if(hand[j]==k){
                                
                                l++;
                                
                            }
                            
                            if(l==5){
                                
                                if(frequency[0]==1 && frequency[1]==1 && frequency[2]==1 && frequency[3]==1 && frequency[4]==1){
                                    
                                    String result = "Royal Flush";  // combine straight and flush conditions to get royal flush
                                    return result;
                                    
                                }
                                String result = "Straight Flush";
                                return result;
                                
                            }
                            
                        }
                        String result = "Straight";
                        return result;
                        
                    }
                    
                }
                
            }
            
            int l = 0;
            
            for(int j=0; j<hand.length; j++){
                
                if(hand[j]==k){  // use k to check suits
                    l++;
                }
                
            }
                
            if(l==5){  // 
                
                String result = "Flush";
                return result;
                
            }
            
            else{  // if no other pair exist, then it must be a high card
                
                String result = "High Card";
                return result;
                
            }
            
        }
        
    }
    
}
