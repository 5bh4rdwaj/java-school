import java.util.*;
class minAndMax_2d
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
        
            //Claculating the minimun and maximum values of the array
            int max = A[0][0], min= A[0][0];
          for (int i=0;i<m;i++)
            {
                for (int j=0;j<n;j++)
                 {
                     if (A[i][j]>max)
                     max=A[i][j];
                     
                     if (A[i][j]<min)
                     min=A[i][j];
                 }
            }
            
            //Printing
            System.out.println("Minimum of this Array is " + min);
            System.out.println("The maximum is " + max);
            
      }
 }