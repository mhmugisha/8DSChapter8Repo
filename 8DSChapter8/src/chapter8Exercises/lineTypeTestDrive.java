//No. 9

package chapter8Exercises;

public class lineTypeTestDrive {

	public static void main(String[] args) {
		lineType Test = new lineType();
		
		Test.lineSlope(4,-2,3,4,5,6); //Note that though the instance vars.
		Test.linesEqual(6,6,6,3,3,3); //are private, I can access them thru
		Test.linesParallel(6,6,6,3,3,3); //these methods bse the methods  
		Test.linesPerpendicular(2,4,3,4,-2,6); //and the inst. are in same class
		Test.pointOfIntersection(12,14,10,5,6,9);// But not Test.a
		
	//Demonstrating how to call use setter and getter.
	//Note that I used getter as parameters in method lineSlope 
		Test.setA(4);
		Test.setB(6);
		Test.setC(7);
		Test.setA1(3);
		Test.setB1(5);
		Test.setC1(2);
		Test.lineSlope(Test.getA(), Test.getB(), Test.getC(), 
				       Test.getA1(), Test.getB1(), Test.getC1());
		//Used in an output.
		System.out.println("A = " + Test.getA());
		
		//Using static variable k - called by class name.
		System.out.println("Constant = " + lineType.k);
	}
}
