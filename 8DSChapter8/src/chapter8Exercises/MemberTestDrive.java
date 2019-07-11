package chapter8Exercises;

public class MemberTestDrive {

	public static void main(String[] args) {
		
		Member member = new Member();
		
		member.getMemberID();
		System.out.println("Member full Name: " + member.getFirstName() +" "+ member.getLastName());
		System.out.println();
		member.getNumberOfBooks();
		System.out.println("Amount spent: " + "$" + member.getAmountSpent());
	}

}
