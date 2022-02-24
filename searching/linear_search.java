import java.util.*;
class linear_search
 { 
    public static void main()
     { 
        Scanner Sc = new Scanner (System.in);
        //n is the parameter for the array, no is the number to be searched, f is the flag variable, p is the position of the no if found
        int n,no=0, f=0, p=0;
         System.out.println("Enter length of Array");
         n= Sc.nextInt();
         int A[]= new int[n];
        
         //Accepting values into the array
         for(int i=0;i<n;i++)
            {
                System.out.println("Enter value of "+i+" cell");
                A[i]= Sc.nextInt();
            }
         System.out.println("Enter value to be checked");
         no=Sc.nextInt();
        
         //Search for no by linear search
         for(int i=0; 1<n;i++)
             {
                 int o=A[i];
                 if (no==o)
                 
                    {
                      f=1;
                      p=i;
                    }
                    else
                    break;
                }
              
                //printing
            if(f==0)
             {
               System.out.println("Not Found");
                 }
                else
                {
                System.out.println("Found on "+p+" cell");
                }
                }
            }
          
                            