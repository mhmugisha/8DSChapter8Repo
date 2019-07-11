package chapter8Exercises;

public class No8LineTypeTestDrive {

	public static void main(String[] args) {
		

		No8LineType Test = new No8LineType();
		
		Test.lineSlope(4,-2,3,4,5,6);
		Test.linesEqual(6,6,6,3,3,3);
		Test.linesParallel(6,6,6,3,3,3);
		Test.linesPerpendicular(2,4,3,4,-2,6);
		Test.pointOfIntersection(10,2,20,1,2,10);
		
	}

}
