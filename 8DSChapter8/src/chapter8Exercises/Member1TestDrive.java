//This program does not seem very useful as every variable is entered
//No computation say of amount spent.


package chapter8Exercises;

import java.util.Scanner;

public class Member1TestDrive {

	public static void main(String[] args) {
		
		Member1 member1 = new Member1();
		
		member1.setName("Mark", "Mugisha");
		member1.setMemberID(12);
		member1.setNumberOfBooks(10);
		member1.setAmountSpent(120); //This is too simplistic.

		System.out.println("Member full Name: " + member1.getFirstName() +" "+ member1.getLastName());
		System.out.println();
		System.out.println("Number of books:" + member1.getNumberOfBooks());
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter book price: ");
		int bookPrice = in.nextInt();
		
      //Here made amount spent dependent on book price and number of books.
		System.out.println("Amount spent: " + "$" + bookPrice * member1.getNumberOfBooks());
	}	

}
