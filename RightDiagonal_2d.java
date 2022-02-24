import java.util.*;
class RightDiagonal_2d
 {
 	     //Program to calulate the sum of all right diagonal elements of a square array

    public static void main () 
     {
       Scanner Sc = new Scanner (System.in);
       //Since in diagonal programes, the array is a square matrix, we shall only take n for bothe rows and columns
        int n;
        
         //Accepting the values for n
             System.out.println("Enter the parameter value of this array");
             n=Sc.nextInt();
           
              int A[][]= new int [n][n];
               //Accepting values for each element of the array
         for (int i=0; i<n; i++)
          {
            for (int j=0; j<n; j++)
             {
                System.out.println("Enter the value for cell"+"("+i+","+j+")");
                 A[i][j]= Sc.nextInt();
             }
                
            }

              //creating and declaring variable "s" to store the sum of the array in
           int S=0;
  
      
        for(int i=0;i<n;i++)
         {
            for (int j=0;j<n;j++)
             {
                 if ((i+j)==(n-1))
                  {
                      S=S+A[i][j];
                  }
             
            }
        }
        
        //Printing
         System.out.println("The sum for all right diagonal elements of a 2D (square) array with "+"("+n+","+n+")"+ " configuration is " + S);

    }
             
}     
