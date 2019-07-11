//Question 7.
//I used input to the console to be able to allow the user modify the 
//inputs but it seems to have overridden my setter methods. I am not yet 
//whether this does not undermine the whole idea of encapsulation.
//Could it be that my private instance variables are now exposed? 
//Why was the TestDrive able to access the private members if this
//violates encapsulation? They should have been invisible!
//Created another class Member1 and its TestDrive with the traditional
//setters and getters.


package chapter8Exercises;

import java.util.Scanner;

public class Member {
	private String firstName;
	private String lastName;
	private int memberID;
	private int numberOfBooks;
	private int amountSpent;

static Scanner in = new Scanner(System.in); 

	/* ___________________________________________________________________ */
	// Default constructor - Note, I need not initialize. They would have
	// been initialized to default values anyway.
	public Member() {
		firstName = " ";
		lastName = " ";
		memberID = 0;
		numberOfBooks = 0;
		amountSpent = 0;
	}
	/* ___________________________________________________________________ */
//Constructor with parameters.

	public Member(String first, String last, int id, int books, int spent) {
		firstName = first;
		lastName = last;
		memberID = id;
		numberOfBooks = books;
		amountSpent = spent;
	}

	/* _____________________________________________________________________ */
	// Setter methods
//	public void setName(String first, String last) {
//		firstName = first;
//		lastName = last;
//	}
//
//	public void setMemberID(int id) {
//		memberID = id;
//	}
//
//	public void setNumberOfBooks(int books) {
//		numberOfBooks = books;
//	}
//
//	public void setAmountSpent(int spent) {
//		amountSpent = spent;
//	}
/*_____________________________________________________________________*/
	//Getter methods.
	//Note that what I have done here seems to have overidden my setter 
	//methods bse when I commented them, it had no effect on my TestDrive
	//program. 
	
	public int getMemberID() {
		System.out.println("Enter Member Id:");
		memberID = in.nextInt();
		return memberID;
	}
	
	public String getFirstName() {
		System.out.println("Enter Member first name: ");
		firstName = in.next();
		return firstName;
	}
	public String getLastName() {
		System.out.println("Enter Member last name: ");
		lastName = in.next();
		return lastName;
	}
	
	public int getNumberOfBooks() {
		System.out.println("Enter no of books:");
		numberOfBooks = in.nextInt();
		return numberOfBooks;
	}
	
	public int getAmountSpent() {
		int bookPrice;
		System.out.println("Enter book price: ");
		bookPrice = in.nextInt();
		amountSpent = numberOfBooks * bookPrice;
		return amountSpent;
	}
/*_____________________________________________________________________*/	
	
	
	
}
