// Question no. 16 of chapter 8. page 504.


package chapter8OtherExercises;

public class MyClass {

	private int x;
	

	private static int count;
	
	//Default constructor. //Post condition x = 0;
	public MyClass()
	{
		x = 0;
	}
	
	//Constructor with parameter to set the value of x
	//Postcondition: x = a
	public MyClass(int a)
	{
		x = a;
	}
	
	//My method - to review how to use in test class.
	public int setX() {
		return x;
	}
	
	//My Method - to review how to use in test class
	public int getX() 
	{
		return x;
	}
	
	
	
	//Method to set the value of x
	//Postcondition: x = a
	public void setX(int a)
	{
		x = a;
	}
	
	//Method to output x.
	public void printX() 
	{
	System.out.print(x);	
	}
	
	//Method to output count
	public static void printCount()
	{
		System.out.println(count);
	}
	
	//Method to increment count
	//Postcondition: count++
	public static void incrementCount()
	{
		count++;	
	}
}
