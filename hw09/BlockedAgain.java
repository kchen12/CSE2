// Kevin Chen
// 11/04/14
// CSE 02 BlockedAgain
// Practice dividing problems into subproblems using methods
//
import java.util.Scanner;

public class BlockedAgain{
    
    public static void main(String []s){
        
        int m;
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
        
    }
    
    public static int getInt(){
        
        System.out.print("Enter an int between 1 and 9, inclusive: ");
            
        while(true){
            
            int uInput = checkInt();
            
            if(checkRange(uInput)){
                return uInput;
            }
            
            else{
                
                System.out.print("You did not enter an int between 1 and 9; try again: ");
                
            }
            
        }
        
    }
    
    public static int checkInt(){
        
        while(true){
            
            Scanner a = new Scanner(System.in);
            
            if(a.hasNextInt()){
                
                int userInt = a.nextInt();
                return userInt;
                
            }
            
            else{
                
                System.out.print("You did not enter an int; try again: ");
                
            }
            
        }
        
    }
    
    public static boolean checkRange(int a){
        
        if(a<=9 && a>=1){
            return true;
        }
        
        else{
            return false;
        }
    }
    
    public static void allBlocks(int uInput){
        
        block(uInput);
        
    }
    
    public static void block(int uInput){
        
        for(int i=1; i<=uInput; i++){  // increment rows
                
                line(uInput, i);
                
            }
        
    }
    
    public static void line(int uInput, int i){
        
        for(int j=uInput; j>0; j--){  // increment the spaces for row
                    if(i+j<uInput+1){
                        System.out.print(" ");
                    }
        }
                
        for(int j=1; j<i*2; j++){  // add i for rows
                    System.out.print(i);
        }
                
        System.out.println();
                
        for(int k=1; k<i; k++){  // add in columns
            for(int j=uInput; j>0; j--){  // add spaces for eaches consecutive rows
                if(i+j<uInput+1){
                    System.out.print(" ");
                }
            }
            for(int l=1; l<i*2; l++){
                System.out.print(i);
            }
            System.out.println();
        }
                
        for(int j=uInput; j>0; j--){  // add spaces for division lines
            if(i+j<uInput+1){
                System.out.print(" ");
            }
        }
                
        for(int j=1; j<i*2; j++){  // add division lines
                    
                System.out.print("-");   

        }
                
        System.out.println();
        
    }
    
}
