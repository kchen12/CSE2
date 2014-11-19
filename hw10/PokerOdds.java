// Kevin Chen
// 11/18/14
// CSE 02 PokerOdds
// Simulate a simple poker hand
//

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
  public static void main(String [] arg){
    // showHands();
    simulateOdds();
    
    
  }
  
  public static void showHands(){
    
      Scanner a = new Scanner(System.in);
      String answer = "";
      
      do{
      
        int[] deck = new int[52];
        
        for(int i=0; i<52; i++){  // assign a number to each card
            deck[i]=i;
        }
        
        int[] hand = new int[5];
        
        for(int i=0; i<5; i++){  // initialize the hand
            hand[i]=-1;
        }
        
        for(int i=0; i<5; i++){
            
          int card = (int)(Math.random()*(52-i));  // draw 5 cards
          hand[i]=card;
          deck[card]=deck[52-i];
          
        }    
        
        String labels[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};

        
        for(int i=0; i<4; i++){  // print out the suits
          
          System.out.print(labels[i]);
          
          for(int j=0; j<5; j++){  // sort each card into its respective suit
            if(hand[j]>=(13*i) && hand[j]<=13*(i+1)){
              int rank = hand[j]%13;
              if(rank>=2 && rank<=10){
                System.out.print(rank+" ");
              }
              else{
                switch(rank){
                  case 0:
                    System.out.print("K ");
                    break;
                  case 1:
                    System.out.print("A ");
                    break;
                  case 11:
                    System.out.print("J ");
                    break;
                  case 12:
                    System.out.print("Q ");
                    break;
                }
                
              }
              
            }
            
          }
          
          System.out.println();
          
        }
        
        System.out.println("Go again? Enter 'y' or 'Y', anything else to quit- y"); // ask user if he/she wants to try again
        answer=a.next();
      }while(answer.equals("Y") || answer.equals("y"));
      
  }
  
  public static void simulateOdds(){
    
    // initialize values and arrays
    int whichTalley;
    int noPairs = 0;
    int talley[] = new int[13];
    int[] deck = new int[52];
    int[] hand = new int[5];
    String labels[] = {"A: ", "2: ", "3: ", "4: ", "5: ", "6: ", "7: ", "8: ", "9: ", "10: ", "J: ", "Q: ", "K: "};
    
    for(int l=0; l<10000; l++){  // run the program 10000 times
          
      for(int i=0; i<52; i++){  // assign a number to each card
          deck[i]=i;
      }
      
      for(int i=0; i<5; i++){
          
        int card = (int)(Math.random()*(52-i));  // draw 5 cards
        hand[i]=deck[card];
        deck[card]=deck[51-i];
        
      }
      
      
      
      for(int i=0; i<5; i++){  // set the 5 cards in hand to a number between 0 and 12
        
        hand[i]=hand[i]%13;
        
      }
      
      if(FindDuplicates.exactlyOneDup(hand)){  // find a pair
        
        whichTalley = whichDup(hand);  // pinpoint the pair
        
        for(int i=0; i<13; i++){
        
          if(i==whichTalley){
            talley[i]++;  // increment the count of pairs
          }
          
        }
        
      }
      else{
        noPairs++;
      }
    
    }
    
    // print results
    for(int i=0; i<13; i++){
      System.out.print(labels[i]);
      System.out.println(talley[i]);
    }
    System.out.println("----------------------------");
    System.out.println("total not exactly one pair: "+noPairs);
    
  }
  
  public static int whichDup(int a[]){
      
    int n=0;
    int talleyNum=0;
    
    for(int i=0; i<a.length; i++){
        
        for(int j=0; j<a.length; j++){  // these two for loops compares the numbers in the list
            
            if(i != j){  // make sure the same number doesn't compare
                
                if(a[i]==a[j]){
                n++;
                talleyNum=a[i];
                }
            
            }
            
        }
        
    }
    
    return talleyNum;
    
  }
  
}
