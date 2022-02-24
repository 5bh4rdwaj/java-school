	import java.util.*;
	/*
	* Authored by Samvat Bhardwaj under the GPL 3 software license
	* Second class for to test out the concept of class wide inheritence by calculating the area and perimeter of a rectangle who's dimensions will be provided by the user
	*/
	class inh_perimeter extends inh_area
	{
		double peri;

		inh_perimeter(double x, double y)
		{
			super (x,y);
			peri = 0.0d;
		}


		void calperi()
		{
			peri = 2*(l+super.b);
		}
		void show ()
		{
			super.show();
			calperi();
			System.out.println("The perimeter is "+ peri);
		}

		public static void main ()
		 {
		 	Scanner Sc = new Scanner (System.in);
		 	double xx, yy;
		 	System.out.println("Enter Length of the rectangle ");
		 	xx=Sc.nextDouble();
		 	System.out.println("Enter Breadth of the rectangle ");
		 	yy=Sc.nextDouble();
		 	inh_perimeter obj= new inh_perimeter(xx,yy); 
		 }

	}