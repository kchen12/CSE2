// Kevin Chen
// 10/17/14
// CSE 02 MoreLoops
// Replace loops with different types of loops
//
import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;  // declare n

	/* System.out.print("Enter an int- ");
	while(!scan.hasNextInt()){
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- ");
	} */
	
	System.out.print("Enter an int- ");  // ask user to input an int
	if(!scan.hasNextInt()){  // check when it is not an int
	    do{
	     System.out.print("You did not enter an int; try again- ");  // tell user they didn't input an int
	     scan.next();
	    }while(!scan.hasNextInt());  // as long as the input is not an int it will keep asking the user to enter an int
	}

	 //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A 
	//DO-WHILE LOOP
       n=scan.nextInt();

	/* for(int j=0;j<n && j<40;j++){
	    for(int k=0;k<j+1;k++){
		System.out.print('*');
	    }
	    System.out.println();
	} */
	
	int j = 0;
	int l = 0;
	while(j < n && j<40){
	   while(l < j){
	       System.out.print("*");  // print number of rows of stars
	       l++;
	   }
	   System.out.println("*");  // print number of stars per row
	   l=0;
	   j++;
	}
	
	//COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH 
	//WHILE STATEMENTS
      
	int k=4;

	/* do{
	    System.out.println("k="+k);
	    k++;
	}
         while(k<4); */
         
    while(k-1<4){  // -1 so k prints at least once
        System.out.println("k="+k);
        k++;
    }
        //COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
	//WITH A WHILE LOOP

        /* int count=0;
        while(true){
	    switch(n){
	    default: System.out.println(n + " is > 5 or <1");
		break;
	    case 1: 
	    case 2: System.out.print("Case 2 "); 
		continue;
	    case 3: break;
	    case 4: System.out.println("Case 4");
	    case 5: System.out.println("Case 5");
		break;
	    }
	    count++;
	    if(count>10)
		break;
	} */
	
	for(int i=0; i<10; i++){  // make this loop run 10 times
	    if(n==1 || n==2){  // print what happens if n = 1 or 2
	        System.out.print("Case 2 ");
	        continue;
	    }
	    else if(n==3){  // if n = 3
	        break;
	    }
	    else if(n==4){  // if n = 4
	        System.out.println("Case 4");
	        System.out.println("Case 5");
	    }
	    else if(n==5){  // if n = 5
	        System.out.println("Case 5");
	    }
	    else{  // print what happens if n is greater than 5 or less than 1
	        System.out.println(n + " is > 5 or <1");
	    }
	}
	//COMMENT OUT THE ABOVE 16 LINES AND REWRITE THE CODE UING
	// ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
	//RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G., 
	//   -5, 1, 20, 5, ETC.
	//IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY 
	//SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
    }
} 