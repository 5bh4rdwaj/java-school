import java.util.*;
class Sum_2d
  {
      public static void main ()
       {
         Scanner Sc=new Scanner (System.in);
         //m for storing the row limit, n for storing the column limit
         int m,n;
         
         //Accepting the values for m and n resspectively
             System.out.println("Enter the rows value of this array");
             m=Sc.nextInt();
             System.out.println("Enter the column vlaue of this array");
             n=Sc.nextInt();
            
             int A[][]= new int [m][n];
          
             //Accepting values for each element of the array
         for (int i=0; i<m; i++)
          {
            for (int j=0; j<n; j++)
              {
                System.out.println("Enter the value for cell"+"("+i+","+j+")");
                 A[i][j]= Sc.nextInt();
             }
                
            }
           
          //creating and declaring variable "s" to store the sum of the array in
          int S=0;
          for (int i=0;i<m;i++)
           {
               for (int j=0;j<n;j++)
                 {
                   S= S+A[i][j];  
                 }
           }
          //printing of the answer
           System.out.println("The sum for a 2D array with"+"("+m+","+n+")"+ "configuration is " + S);
       }
    
  }