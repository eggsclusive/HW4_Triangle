package HW4.TriangleProblem;

//Yonatan Mattar - 315957571
//Riad Zoabi - 211830369

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Tests_Verifier {

	Triangle_classification test = new Triangle_classification();
	
    private void runTest(int a, int b, int c, String expectedResult, int testNumber) {
        String actualResult = Triangle_classification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult, "Test " + testNumber + " failed.");
        System.out.println("Test " + testNumber + ": Passed - Expected: " + expectedResult + ", Actual: " + actualResult);
    }

    @Test
    public void testCases() {
        runTest(1, 2, 5, "Nottriangle", 1);
        runTest(5, 2, 3, "Nottriangle", 2);
        runTest(1, 4, 2, "Nottriangle", 3);
        runTest(5, 5, 5, "equilateral", 4);
        runTest(5, 5, 2, "isosceles", 5);
        runTest(4, 3, 3, "isosceles", 6);
        runTest(3, 4, 3, "isosceles", 7);
        runTest(6, 9, 7, "Scalene", 8);
    }
}