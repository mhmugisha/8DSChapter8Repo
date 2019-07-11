// Question number 8.


//For better precision, change from int to double. 
//You may not use "private" instance variables in the class Fractions
//so u don't need setters and getters. Then use console to input.

package chapter8Exercises;

public class FractionsTestDrive {

	public static void main(String[] args) {
		
		Fractions Test = new Fractions();
		Test.setA(1);
		Test.setB(3);
		Test.setC(1);
		Test.setD(4);
		System.out.println("1.Sum of the fractions = " + Test.sum(Test.getA(),
						   Test.getB(), Test.getC(), Test.getD()));
		
		System.out.println("2.Diff of the fractions = " + Test.difference(Test.getA(),
				   Test.getB(), Test.getC(), Test.getD()));
		
		System.out.println("3.Prouct of the fractions = " + Test.product(Test.getA(),
				   Test.getB(), Test.getC(), Test.getD()));
		
		System.out.println("4.Quotient of the fractions = " + Test.quotient(Test.getA(),
				   Test.getB(), Test.getC(), Test.getD()));
		
		//Note, for this below, the "System.out.println" is in the method. 

		Test.compare(Test.getA(), Test.getB(), Test.getC(), Test.getD());
	
	}

}
