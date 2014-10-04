//-----------------------------------------------------------------------
// Class:			ProblemOne.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		Recursive Method that takes an int argument k and returns,
//                  as a double, the sum of the first k terms of the series.
//
// Files:		    ProblemOne.java
//-----------------------------------------------------------------------
public class ProblemOne {

    /**
     * Constructor
     */
	public ProblemOne() {
	}

    /**
     * Recursively processes a number in series.  See assignment for more details
     * @param k
     * @return double value of the series
     */
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