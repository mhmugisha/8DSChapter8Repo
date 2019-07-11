/*In this program, I have made all my instance variables public.
In the program "lineType" and its Test program in this same package, 
I will make them  private so that I can use getter and setter methods. */


package chapter8Exercises;

public class No8LineType {
	static double k = 2;
	public double a;
	public double b;
    public double c;
    public double a1;
    public double b1;
    public double c1;
    
    //default constructor
    public No8LineType() 
    {
    	
    }
    //Constructor with parameters
    public No8LineType(double u, double v, double w, double m, double n, double z) 
    {
    	a = u;
    	b = v;
    	c = w;
    	a1 = m;
    	b1 = n;
    	c1 = z;
    }
/*________________________________________________________________*/	
    //a). Method to determine slope of line if line is non-vertical. 

    public void lineSlope(double u, double v, double w, double x, double y, double z) 
    {
    	if (v==0)
    		System.out.println("The line is vertical");
    	else
    		System.out.println("The slope = " + (-u/v)); 
    	
    }
/*________________________________________________________________*/	
    //b). Method to determine if two lines are equal.

    public void linesEqual(double u, double v, double w, double x, double y, double z) 
    {
    	if (((u == x)&& (v==y)&& (w == z))||((u == k*x)&&(v==k*y)&&(w==k*z)))
    		
    		System.out.println("The two lines are equal.");
    	else 
    		System.out.println("The two lines are not equal.");
    }
  /*______________________________________________________________*/  
    //c). Method to determine if two lines are parallel.
    
    public void linesParallel(double u, double v, double w, double x, double y, double z) 
    {
    	if((u/v)==(x/y))
    		System.out.println("The two lines are parallel.");
    	else
    		System.out.println("The two lines are not parallel.");
    }
/*________________________________________________________________*/    
    //d). Method to determine if two lines are perpendicular.
    
    public void linesPerpendicular(double u, double v, double w, double x, double y, double z) 
    {
    if ((-u/v) * (-x/y) == -1||u == 0||v == 0)	
    	System.out.println("The two lines are perpendicular.");
    else
    	System.out.println("The two lines are not perpendicular.");
    }
/*________________________________________________________________*/
//e). Method to determine point of intersection if lines are not parallel    
  
    public void pointOfIntersection(double u, double v, double w, double m, double n, double z) 
    {
    	double x = 12.0;
    	double y = 20.0;
    	
   	if ((-u/v) != (-m/n))  
    	System.out.println("Point of intersection:" + "("+ (w-z-y*v +y*n)/(u-m) + "," + (w - z-x*u +x*m)/(v-n) +")" );

    	else 
    		System.out.println("The lines don't intersect!");
    }
    
}
