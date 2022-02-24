    /** 
     * This programme aims to calculate the area, volume and surface area and circumference
     * 
     */
    import java.util.*;
    class calc
     {
         int l,h,b,r;
         calc()
         {
             l=0;
             b=0;
             h=0;
             r=0;
         }
         void circle()
         { 
            
            //to calculate the area and circumference of a circle 
        
              Scanner Sc = new Scanner (System.in);
              System.out.println("Please enter the radius of your circle ");
             r= Sc.nextInt();
            double arearesult= 0.0;
              arearesult=(22/7)*r*r; 
            double circumference=0.0;
            circumference=2*(22/7)*r;
             System.out.println("Area for the circle with the dimensions entered is calculated to be " + arearesult);
             System.out.println("The circumference covered for the same circle is " + circumference);
        }
         void quadilat ()
          {
              
             //TO calculate the area, volume and diagonal length for a cuboid
               
              Scanner Sc= new Scanner (System.in);
              System.out.println("Please enter the length of your quad");
              l=Sc.nextInt();
              System.out.println("Please enter the breadth of your quad");
              b=Sc.nextInt();
              System.out.println("Please enter the height of your quad");
              h=Sc.nextInt();
              double quadvolume= l*b*h;
              double quadsurfar= 2*((l*b)+(b*h)+(l*h));
              double quadperimeter= 4*(l+b+h);
              
              //Printing
              System.out.println("The volume for the cuboid is " + quadvolume);
              System.out.println("The Surface Area is " + quadsurfar);
              System.out.println("The Perimeter is " + quadperimeter);
            }
          
        public static void main ()
        {
            calc ob=new calc ();
            Scanner Sc = new Scanner (System.in);
            System.out.println("Do you want the calculations to be done for a circle? Please enter true");
            boolean circle1=Sc.nextBoolean();
             if (circle1)
             {
               ob.circle();
            }
            else 
            {
              ob.quadilat();  
            }
        }
                
         }