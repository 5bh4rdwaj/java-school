import java.util.*;
class Print_2d
  {
        public static void main ()
         {
             Scanner Sc=new Scanner (System.in);
             //m to take row numbers, n for column nummbers;
             int n,m;
             
             //Accepting values of rows and column
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
            
              //Printing neatly the arrangement of the array
               for (int i=0; i<m; i++)
              {
                for (int j=0; j<n; j++)
                {
                 System.out.print("("+A[i][j]+")"+ " ");
                }
                System.out.println();
                
              }
     
             
             
             
         }
  }