//Question 7.
//With conventional setters and getters. Check class Member, and compare. 


package chapter8Exercises;

import java.util.Scanner;

public class Member1 {
	private String firstName;
	private String lastName;
	private int memberID;
	private int numberOfBooks;
	private int amountSpent;

static Scanner in = new Scanner(System.in); 

	/* ___________________________________________________________________ */
	// Default constructor - Note, I need not initialize. They would have
	// been initialized to default values anyway.
	public Member1() {
		firstName = " ";
		lastName = " ";
		memberID = 0;
		numberOfBooks = 0;
		amountSpent = 0;
	}
	/* ___________________________________________________________________ */
//Constructor with parameters.

	public Member1(String first, String last, int id, int books, int spent) {
		firstName = first;
		lastName = last;
		memberID = id;
		numberOfBooks = books;
		amountSpent = spent;
	}

	/* _____________________________________________________________________ */
	// Setter methods
	public void setName(String first, String last) {
		firstName = first;
		lastName = last;
	}

	public void setMemberID(int id) {
		memberID = id;
	}

	public void setNumberOfBooks(int books) {
		numberOfBooks = books;
	}

	public void setAmountSpent(int spent) {
		amountSpent = spent;
	}
/*_____________________________________________________________________*/
	//Getter methods.
	
	public int getMemberID() {
		return memberID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	
	public int getAmountSpent() {
		return amountSpent;
	}
/*_____________________________________________________________________*/	
	
}
