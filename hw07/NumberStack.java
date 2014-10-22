// Kevin Chen
// 10/21/14
// CSE 02 NumberStack
// practice using for, while and do-while loops
//

import java.util.Scanner;  // import scanner

public class NumberStack{
    public static void main(String[] arg){
        
        Scanner myScanner;  // declare scanner
        myScanner = new Scanner(System.in);
        
        System.out.print("Enter a number between 1 and 9: ");  // prompt user to enter a number
        
        while(!myScanner.hasNextInt()){  // force user to keep entering until it is an int
            myScanner.next();
            System.out.print("You did not enter an int; try again- ");
        }
        
        int uInput = myScanner.nextInt();
        
        if(uInput>9 || uInput<1){  // tell user they didn't input the int between 1 and 9
            System.out.println("You did not enter an int between 1 and 9");
            return;
        }
        else{
            
            // using for loops
            System.out.println("Using for loops: ");
            
            for(int i=1; i<=uInput; i++){  // increment rows
                
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
            
            
            // using while loops
                
            System.out.println("Using while loops: ");
            
            // declare counters
            int a = 1;
            int b = uInput;
            int c = 1;
            int d = 1;
            int e = uInput;
            int f = 1;
            int g = uInput;
            int h = 1;
            
            while(a<=uInput){  // increment rows
            
                while(b>0){  // increment spaces for rows
                    if(a+b<uInput+1){
                        System.out.print(" ");
                    }
                    b--;
                }
                
                b = uInput;
                
                while(c<a*2){  // add in each row
                    System.out.print(a);
                    c++;
                }
                
                c=1;
                
                System.out.println();
                
                while(f<a){
                    while(e>0){  // increment spaces for each row
                        if(a+e<uInput+1){
                            System.out.print(" ");
                        }
                        e--;
                    }
                
                e = uInput;
                
                    while(d<a*2){  // add in each column
                        System.out.print(a);
                        d++;
                    }
                    
                d=1;
                f++;
                System.out.println();
                
                }
                
                f=1;
                
                while(g>0){  // increment spaces for division lines
                        if(a+g<uInput+1){
                            System.out.print(" ");
                        }
                        g--;
                    }
                
                g = uInput;
                
                while(h<a*2){  // add in division lines
                    System.out.print("-");
                    h++;
                }
                h=1;
                System.out.println();
                
                a++;
                
            }
            
            
            
            // using do-while loops
                
            System.out.println("Using do-while loops: ");
            
            // declare counters
            int x = 1;
            int y = uInput;
            int z = 1;
            int w = 1;
            int v = uInput;
            int u = 1;
            int t = uInput;
            int s = 1;
            
            do{  // increment rows
            
                do{  // increment spaces for rows
                    if(x+y<uInput+1){
                        System.out.print(" ");
                    }
                    y--;
                }while(y>0);
                
                y = uInput;
                
                do{  // add in each row
                    System.out.print(x);
                    z++;
                }while(z<x*2);
                
                z=1;
                
                System.out.println();
                
                do{
                    do{  // increment spaces for each row
                        if(x+v<uInput+1){
                            System.out.print(" ");
                        }
                        v--;
                    }while(v>0);
                
                v = uInput;
                
                    do{  // add in each column
                        System.out.print(x);
                        w++;
                    }while(w<x*2);
                    
                w=1;
                u++;
                System.out.println();
                
                }while(u<x);
                
                u=1;
                
                do{  // increment spaces for division lines
                        if(x+t<uInput+1){
                            System.out.print(" ");
                        }
                        t--;
                    }while(t>0);
                
                t = uInput;
                
                do{  // add in division lines
                    System.out.print("-");
                    s++;
                }while(s<x*2);
                s=1;
                System.out.println();
                x++;
                
            }while(x<=uInput);
            
        }
        
    }
    
}