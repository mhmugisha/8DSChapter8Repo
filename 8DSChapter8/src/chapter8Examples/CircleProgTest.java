//This example is on page 453-4 of: DS Malik



package chapter8Examples;

import java.util.Scanner;

public class CircleProgTest {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circle firstCircle = new Circle(); 
		Circle secondCircle = new Circle(12); 
		
		double radius; 
		
		System.out.println("FirstCircle: " + firstCircle); // Output of this 
		//line and next will be radius, perimeter, area effected by the toString method  
		
		System.out.println("SecondCircle: " + secondCircle); 
		
		System.out.print("Enter the radius: "); 
		radius = console.nextDouble(); 
		System.out.println(); 

		firstCircle.setRadius(radius); 
		System.out.println("FirstCircle: " + firstCircle );
		
		if (firstCircle.getRadius() > secondCircle.getRadius()) 
		System.out.println("Radius of 1st circle is > radius of 2nd circle."); 
		
		else if (firstCircle.getRadius() < secondCircle.getRadius()) 
		System.out.println("Radius of 1st circle is < radius of 2nd circle."); 
		
		else 
		System.out.println("The radii of both circles are the same."); 
		}//end main
		

}


