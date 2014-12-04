// Kevin Chen
// 12/4/14
// CSE 02 Arrays
// Practice manipulating arrays
//

import java.util.Scanner;

public class Arrays{
    
    public static void main(String[] args){
        
        // get user to enter 10 ints
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 ints- ");
        int[] array = new int[10];
        for(int i=0; i<10; i++){
            
            array[i]=scan.nextInt();  // enter 10 times
            
        }
        
        System.out.println();
        
        int max=array[0];
        
        // find the max by comparing
        for(int i=0; i<array.length; i++){
                
            if(array[i]>max){
                    
                max=array[i];
                    
            }
            
        }
        
        System.out.println("The largest entry is " +max);  // print max number
        
        int min=array[0];
        
        // find min number by comparing
        for(int i=0; i<array.length; i++){
                
            if(array[i]<min){
                    
                min=array[i];
                    
            }
            
        }
        
        System.out.println("The smallest entry is " +min);  // print min number
        
        int sum=0;
        
        // get the sum using a for loop
        for(int i=0; i<array.length; i++){
            
            sum=sum+array[i];
            
        }
        
        System.out.println("The sum of the entries is " +sum);
        
        // find the reverse array
        int[] revArray = new int[10];
        
        for(int i=0; i<array.length; i++){
            
            revArray[i]=array[array.length-1-i];
            
        }
        
        // print the arrays side by side
        for(int i=0; i<array.length; i++){
            
            System.out.println(" "+array[i]+"   "+revArray[i]);
            
        }
        
    }
    
}