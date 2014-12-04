// Kevin Chen
// 12/4/14
// CSE 02 MethodCalls
// Practice calling methods in methods
//

public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
        
    }
    
    public static int addDigit(int number, int digit){
        
        if(number<0 && digit<0){
            
            number = number*(-1);
            digit = digit*(-1);
            
        }
        
        if(number<0 && digit>0){
            
            digit=digit*(-1);
            
        }
        
        double c=number;
        int n=0;
        
        while(c>1 || c<-1){
            
            c=c/10;
            n++;
            
        }
        
        if(c>0){
            
            c=c+.000001;
            
        }
        
        else{
            
            c=c-.000001;
            
        }
        
        double d = c+digit;
        
        for(int i=0; i<n; i++){
            
            d=d*10;
            
        }
        
        int e = (int)d;
        return e;
        
    }
    
    public static int join(int a, int b){
    
        return addDigit(b, a);
        
    }
    
}
/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
