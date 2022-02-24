/*
* Authored by Samvat Bhardwaj under the GPL 3 software license 
* Part 1 of a simple programme to test out the concept of class wide inheritence by calculating the area and perimeter of a rectangle who's dimensions will be provided by the user
*/
import java.util.*;
class inh_area
   {
   		double l,b;
   		inh_area(double ll, double bb)
   		{
   			l=ll;
   			b=bb;
   		}
   		

   		double doarea()
   		{
   			return (l*b);
   		}

   		void show()
   		{
   			System.out.println("Length given was " + l +" centimeters");
   			System.out.println("Breadth given was " + b+" centimeters");
   			double A= doarea();
   			System.out.println("Area calculated was "+ A);
   		}
         public static void main()
         {
          
            
         }   
         
   		


   }