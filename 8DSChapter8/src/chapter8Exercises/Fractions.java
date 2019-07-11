//No. 8

package chapter8Exercises;

public class Fractions {
	private int a;
	private int b;
	private int c;
	private int d;

	//Default constructor. 
	public Fractions() {
		
	}
	
	//Constructor with parameters.
	public Fractions(int w, int x, int y, int z) 
	{
		a = w;
		b = x;
		c = y;
		d = z;
	}
/*____________________________________________________________________*/	
	//Setter methods for the variables.
	
	void setA(int w) 
	{
		a = w;
	}
	
	void setB(int x) 
	{
		b = x;
	}
	
	void setC(int y) 
	{
		c = y;
	}

	void setD(int z) 
	{
		d = z;
	}
/*_____________________________________________________________________*/	
	//Getter methods for the variables.
	
	public int getA() 
	{
		return a;
	}
	
	public int getB() 
	{
		return b;
	}
	
	public int getC()
	{
		return c;
	}

	public int getD()
	{
		return d;
	}

/*__________________________________________________________________*/
	//Method to add to fractions.
	
	public int sum(int w, int x, int y, int z) 
	{
		int sum = (z*w + x*y)/(x*z);	
		return sum;
	}
/*___________________________________________________________________*/
	//Method to subtract fractions.
	
	public int difference(int w, int x, int y, int z) 
	{
		int difference = (z*w - z*y)/(x*z);	
		return difference;
	}
/*___________________________________________________________________*/	
	//Method to multiply fractions.
	
	public int product(int w, int x, int y, int z)
	{
		int product = (w*y)/(x*z);
		return product;
	}
/*___________________________________________________________________*/	
	//Method to divide fractions.
	
	public int quotient(int w, int x, int y, int z)
	{
	    int quotient = (w*z)/(x*y);
	    return quotient;
	}
/*__________________________________________________________________*/
	
	//Method to compare fractions.
	
	public void compare(int w, int x, int y, int z)
	{
		if ((double)(w/x) == (double)(y/z))
		System.out.println("5.The two fractions are equal.");
			
		else if ((double)w/x > (double)y/z)
		System.out.println("5. " + w + "/" + x + " is greater than " + y +"/" + z);
		
		else
		System.out.println("5." + w + "/" + x + " is less than " + y +"/" + z);
	}
/*_____________________________________________________________________*/	
}