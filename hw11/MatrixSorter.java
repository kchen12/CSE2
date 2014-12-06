// Kevin Chen
// 12/5/14
// CSE 02 MatrixSorter
// practice with 3D arrays
//

public class MatrixSorter{
    
    // given main method
    public static void main(String arg[]){
        int mat3d[][][];
        mat3d=buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is "+
      			findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
   }
   
   public static int[][][] buildMat3d(){  // this method builds a 3D array
       
       int[][][] slabArray = new int[3][][];  // allocate spaces for the slabs
       
       for(int i=0; i<slabArray.length; i++){
           
           slabArray[i] = new int[3+2*i][];  // allocate spaces for the rows
           
           for(int j=0; j<slabArray[i].length; j++){
               
               slabArray[i][j] = new int[i+j+1];  // allocate spaces for the columns
               
               for(int k=0; k<slabArray[i][j].length; k++){
                   
                   slabArray[i][j][k] = (int)((Math.random()*99)+1);  // assign random numbers from 1-99
                   
               }
               
           }
           
       }
       
       return slabArray;
       
   }
   
   public static void show(int[][][] array3D){  // this method prints out the 3D array
       
       for(int i=0; i<array3D.length; i++){  // for each slab
           
           System.out.println("---------------------------Slab " + (i+1));  // use lines to divide each slab
           
           for(int j=0; j<array3D[i].length; j++){  // for each row
               
               for(int k=0; k<array3D[i][j].length; k++){  // for each column
                   
                   System.out.print(array3D[i][j][k]+" ");
                   
               }
               
               System.out.println();
               
           }
           
       }
       
   }
   
   public static int findMin(int[][][] array3D){  // this method finds the min value of the 3D array
       
       int min = 101;  // use a buffer to compare the values
       
       for(int i=0; i<array3D.length; i++){
           
           for(int j=0; j<array3D[i].length; j++){
               
               for(int k=0; k<array3D[i][j].length; k++){
                   
                   if(array3D[i][j][k]<min){  // compare the buffer with all the values within the array
                       
                       min = array3D[i][j][k];  // set the buffer to the lowest value each time it compares
                       
                   }
                   
               }
               
           }
           
       }
       
       return min;
       
   }
   
   public static void sort(int[] array1D){  // this is a helper method that uses selection sort for a one dimensional array
       
       for(int i=0; i<array1D.length; i++){
           
           int minBuffer = i;
           
           for(int j=i; j<array1D.length; j++){  // j=i so the loop starts at unsorted values everytime
               
               if(array1D[minBuffer]>array1D[j]){
                   
                   minBuffer = j;  // record the min value everytime it runs through the array
                   
               }
               
               // move that min value to the front
               int placeHolder = array1D[i];
               array1D[i] = array1D[minBuffer];
               array1D[minBuffer] = placeHolder;
               
           }
           
       }
       
   }
   
   public static void sort(int[][] array2D){  // this is the actual method for selection sort and insertion sort
       
       for(int i=0; i<array2D.length; i++){
           
           sort(array2D[i]);  // use the previous selection sort to run through all rows
           
       }
       
       for(int i=0; i<array2D.length; i++){  // use insertion sort for the first column of each row
                                             // which swaps whole rows
           for(int j=i; j>0; j--){  // decrement j because we are comparing each value to the one before it
                                    // j=i so it still is incrementing upward, but comparing backward
               if(array2D[j-1][0]>array2D[j][0]){
                   
                   // swap the rows if the row is smaller than the previous one
                   int[] buffer = array2D[j-1];
                   array2D[j-1] = array2D[j];
                   array2D[j] = buffer;
                   
               }
               
               else{
                   break;
               }
               
           }
           
       }
       
   }
   
}
