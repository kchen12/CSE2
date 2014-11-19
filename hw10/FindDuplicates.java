// Kevin Chen
// 11/18/14
// CSE 02 FindDuplicates
// Excercise using arrays
//
import java.util.Scanner;  // declare scanner
public class FindDuplicates{  // declare class
  public static void main(String [] arg){  // main method
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");  // prompt user to enter 10 ints
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){  // check if the list has duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){  // check if the list has exactly one duplicate
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");  // ask user if he/she wants to go again
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  public static boolean hasDups(int a[]){  // method to check if there are duplicates
      
      for(int i=0; i<a.length; i++){
          
          for(int j=0; j<a.length; j++){  // these two for loops compare each number with all the other numbers in the list
              
              if(i != j){  // make sure the same numbers don't compare
                  
                  if(a[i]==a[j]){
                  return true;
                  
              }
              
              }
              
          }
          
      }
      
      return false;
      
  }
  
  public static boolean exactlyOneDup(int a[]){
      
      int n=0;
      
      for(int i=0; i<a.length; i++){
          
          for(int j=0; j<a.length; j++){  // these two for loops compares the numbers in the list
              
              if(i != j){  // make sure the same number doesn't compare
                  
                  if(a[i]==a[j]){
                  n++;
                  
              }
              
              }
              
          }
          
      }
      
      int k = n/2;  // check if there is exactly one duplicate
      
      if(k==1){
          return true;
      }
      
      else{
          return false;
      }
      
  }
  
}
