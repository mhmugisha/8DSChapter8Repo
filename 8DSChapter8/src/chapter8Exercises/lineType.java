
//No. 9

package chapter8Exercises;

public class lineType {
	static double k = 2;
	private double a;
	private double b;
    private double c;
    private double a1;
    private double b1;
    private double c1;
    
  //default constructor
    public lineType() 
    {
    	//No need to initialize to zero - set to zero by default. 
    }
    //Constructor with parameters
    public lineType(double u, double v, double w, double m, double n, double z) 
    {
    	a = u;
    	b = v;
    	c = w;
    	a1 = m;
    	b1 = n;
    	c1 = z;
    }
/*_________________________________________________________________*/    
 //Setter methods for the instance variables - because they are private.
    void setA(double u) 
    {
    	a = u;
    }
    
    void setB(double v)
    {
    	b = v;
    }
    
    void setC(double w)
    {
    	c = w;
    }
    void setA1(double m)
    {
        a1 = m;	
    }
    void setB1(double n) 
    {
    	b1 = n;
    }
    void setC1(double z)
    {
    	c1 = z;
    }
/*___________________________________________________________________*/    
    
 //Getter methods for the instance variables - because they are private. 
    public double getA() 
    {
    	return a;
    }
    
    public double getB()
    {
    	return b;
    }
    
    public double getC()
    {
    	return c;
    }
    
    public double getA1()
    {
    	return a1;
    }
    
    public double getB1()
    {
    	return b1;
    }
    
    public double getC1()
    {
    	return c1;
    }
    
/*________________________________________________________________*/	
    //a). Method to determine slope of line if line is non-vertical. 

    public void lineSlope(double u, double v, double w, double m, double n, double z) 
    {
    	if (v==0)
    		System.out.println("The line is vertical");
    	else
    		System.out.println("The slope = " + (-u/v)); 
    	
    }
/*________________________________________________________________*/	
    //b). Method to determine if two lines are equal.

    public void linesEqual(double u, double v, double w, double m, double n, double z) 
    {
    	if (((u == m)&& (v==n)&& (w == z))||((u == k*m)&&(v==k*n)&&(w==k*z)))
    		
    		System.out.println("The two lines are equal.");
    	else 
    		System.out.println("The two lines are not equal.");
    }
  /*______________________________________________________________*/  
    //c). Method to determine if two lines are parallel.
    
    public void linesParallel(double u, double v, double w, double m, double n, double z) 
    {
    	if((u/v)==(m/n))
    		System.out.println("The two lines are parallel.");
    	else
    		System.out.println("The two lines are not parallel.");
    }
/*________________________________________________________________*/    
    //d). Method to determine if two lines are perpendicular.
    
    public void linesPerpendicular(double u, double v, double w, double m, double n, double z) 
    {
    if ((-u/v) * (-m/n) == -1||u == 0||v == 0)	
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
