 /**
* Authored by Samvat Bhardwaj under the GPL 3 software license
* Program for binary searching in an array
    */
import java.util.*;
class binary_search
 {
     public static void main() 
  {    
          Scanner Sc= new Scanner (System.in);
          int n;
          System.out.println("Enter length of Array");
           n= Sc.nextInt();
           int A[]= new int[n];  
           for (int i=0;i<n;i++)
            { 
                System.out.println("Enter value of "+i+" cell");
                A[i]= Sc.nextInt();
            }
            int no=0, f=0,low=A[0], high= A[n-1],p=0, mid=0;
            System.out.println("Enter value to be searched");
             no= Sc.nextInt();
             while(low<=high)
               {
                  mid= (low+high)/2;
                   if(no==A[mid])
                    { 
                        f=1;
                        break;
                    }
                    else if(no>A[mid])
                     {
                       low= mid+1;
                    }
                    else  
                    {
                      high= mid-1;
                    }
                }
                 if (f==0)
                  {
                    System.out.println("NA");
                }
                 else
                 {
                     System.out.println("found");

                    
               }
            }

                     
        }
                