//Example 8-5, Page 460.
//Java Programming From Problem Analysis to Program Design, DS Malik, Page 460 
//This example clarifies the effect of the modifier static.

package chapter8Examples;

public class Illustrate {
	private int x;		  //This is an instance variable - "non-static"	
	private static int y; //Not an instance variable due to "static" - its a class variable
	public  static int count; //Not an instance variable due to "static."

/*.....................................................................*/	
	//Default Constructor. Post condition: x = 0;
	
	public Illustrate() {
		x = 0;
	}
/*.....................................................................*/	
	//Constructor with parameters. Post condition: x = a;
	
	public Illustrate (int a) {
		x = a;
	}
/*....................................................................*/	
	//Method to set the value of x. Post condition: x = a; 
	
	void setX(int a) {
		x = a;
	}
	
/*....................................................................*/	
//Method to return the values of the instance and static variables as a string
	//The string returned is used by the methods print, println, or printf to 
	//print the values of the instance and static variables.
	//Postcondition: The values of x, y, and count are returned as a string.

public String toString() {
	return ("x = " + x + ", y = " + y + ", Count = " + count);
	}
	
/*......................................................................*/
	//Method to increment the value of the private static member y.
	//Postcondition: y is incremented by 1.

public static void incrementY() {
	y++;
	}
/*.......................................................................*/


}
