// Class:			ProblemOne.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		Recursive Method that takes an int argument k and returns,
//                  as a double, the sum of the first k terms of the series.
//
// Files:			
//-----------------------------------------------------------------------
public class ProblemOne {

	public ProblemOne() {
	}

	public double process(int k) {
		if (k <= 0) return 0; // If k = 0
		if (k == 1) return 1;
		if (k % 2 == 0) { // If k is even
			return 1.0/k + process(k - 1);
		} else { // Else k is odd
			return -1.0/k + process(k - 1);
		}
	}
}