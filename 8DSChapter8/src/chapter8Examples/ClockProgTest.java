package chapter8Examples;

import java.util.Scanner;

public class ClockProgTest {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) 
	{
		Clock myClock = new Clock(12, 20, 30); 		// Line 1 - Constructor with par
		Clock yourClock = new Clock(); 				// Line 2 - Default constructor
		
		int hours; 									// Line 3 - Variable declarations
		int minutes; 								// Line 4
		int seconds; 								// Line 5
		
		System.out.print("Line 6: myClock: " ); 	// Line 6
		myClock.printTime(); 						// Line 7 
		System.out.println(); 						// Line 8

		System.out.print("Line 9: yourClock: "); 	// Line 9
		yourClock.printTime(); 						// Line 10
		System.out.println(); 						// Line 11
		
		yourClock.setTime(5, 45, 16); 				// Line 12 originally default now set
		System.out.print("Line 13: After setting the time - yourClock: "); // Line 13
		yourClock.printTime(); 						// Line 14
		
		System.out.println(); 						// Line 15
		if (myClock.equals(yourClock)) 				// Line 16
			System.out.println("Line 17: Both times are equal."); // Line 17
		else 										// Line 18
			System.out.println("Line 19: The two times are not equal."); // Line 19
		System.out.print("Line 20: Enter hours, minutes, and seconds: "); // Line 20
		System.out.println(); 
		
		hours = console.nextInt(); 						// Line 21 initializing hours
		minutes = console.nextInt(); 					// Line 22    "			mins
		seconds = console.nextInt(); 					// Line 23    "			secs
		
		System.out.println(); 							// Line 24
		myClock.setTime(hours, minutes, seconds); 		// Line 25 - initilized values passed to setTime method
		System.out.print("Line 26: New time of myClock: "); // Line 26
		myClock.printTime(); 							// Line 27
		System.out.println(); 							// Line 28
		
		myClock.incrementSeconds(); 					// Line 29
		System.out.print("Line 30: After incrementing "
				+ "the time by one second, myClock: "); // Line 30
		myClock.printTime(); 							// Line 31
		System.out.println(); 							// Line 32
		
		myClock.incrementMinutes();
		System.out.println("After incrementing minutes by 1 min, time is : ");
		myClock.printTime();
		System.out.println(); 	
		
		yourClock.makeCopy(myClock); 					// Line 33
		System.out.print("Line 34: After copying myClock"
				+ "into yourClock, yourClock: "); 		// Line 34
		yourClock.printTime(); 							// Line 35
		System.out.println(); 							// Line 36
	}// end main

}
