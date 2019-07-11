package chapter8Examples;

import java.util.Scanner;

public class RollDieProgTest {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		RollDie die1 = new RollDie(); 
		RollDie die2 = new RollDie(); 
		
		System.out.println("die1: " + die1);//o/p = 1 bse num = 1 in the default constructor in RollDie; 
		System.out.println("die2: " + die2);//o/p = 1 bse num = 1;
		System.out.println("After rolling "
		+ "die1: " + die1.roll()); 
		
		System.out.println("After rolling "
		+ "die2: " + die2.roll()); 
		
		System.out.println("Sum of the "
		+ "numbers rolled by the dice is: "
		+ (die1.getNum() + die2.getNum()));
		
		System.out.println("After again rolling "
				+ "the sum of the numbers rolled is: "
				+ (die1.roll() + die2.roll()));
	}

}
