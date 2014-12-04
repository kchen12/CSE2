// Kevin Chen
// 12/4/14
// CSE 02 Sorting
// Practice sorting multidimensional arrays
//

public class Sorting{
    
    public static void main(String[] arg){
        
        // allocate spaces for a
        int[][] a = new int[5][];
        for(int i=0; i<5; i++){
            a[i] = new int[i*3+5];
        }
        
        // assign values to the spaces
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<a[i].length; j++){
                
                a[i][j] = (int)(Math.random()*40);
                
            }
            
        }
        
        // print out the ragged array
        
        System.out.println("The array before sorting");
        
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<a[i].length; j++){
                
                System.out.print(a[i][j]+", ");
                
            }
            
            System.out.println();
            
        }
        
        // sort the array in ascending order
        for(int i=0; i<a.length; i++){  // for each row
            
            int compare;
            
            for(int j=0; j<a[i].length; j++){
                
                for(int k=0; k<a[i].length; k++){  // compare k and j values
                    
                    if(a[i][j]<a[i][k]){
                        
                        // put the smaller numbers to the front
                        compare = a[i][j];
                        a[i][j]=a[i][k];
                        a[i][k]=compare;
                        
                    }
                    
                }
                
            }
            
        }
        
        // print the sorted array
        
        System.out.println("The array after sorting");
        
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<a[i].length; j++){
                
                System.out.print(a[i][j]+", ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}