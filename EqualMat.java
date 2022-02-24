import java.util.*;
class EqualMat
 {
   public static void main ()
    {
     Scanner Sc=new Scanner(System.in);
     //find if tow matrix are equal
     int n;
    System.out.println("Enter Dimenssions for these matrix");
    n=Sc.nextInt();
        int A[][]=new int [n][n];
       int B[][] =new int [n][n];
     //Accepting the value
       for (int i=0;i<n;i++)
         {
            for (int j=0; j<n;j++)
              { 
                 System.out.println("Enter value of Matrix A for "+i+" "+j+" element");
            A[i][j]=Sc.nextInt();
        System.out.println("Enter value of Matrix B for "+i+" "+j+" element");    
            B[i][j]=Sc.nextInt();
           }
           
      }
  
   
        //checking value
        int flag=0;
         for (int i=0;i<n;i++)
         {
            for (int j=0; j<n;j++)
              { 
                 if (A[i][j]!=B[i][j])
                     { 
                        flag=1;
                        break;
                    }
                }
            }
                
                if (flag==1)
                 {
                     System.out.println("Not Equal");
                 }
                 else 
                 {
                     System.out.println("Equal");
                 }
            
            
        
        }
    }