// Class:			ProblemThree.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		
//
// Files: ProblemThree.java
//-----------------------------------------------------------------------
public class ProblemThree {
	public ProblemThree() {

	}

    /**
     * Recursive method to return the Greatest Common Denominator.
     * WARNING: Does not handle prime numbers well
     * @param n
     * @param m
     * @return Int value of GCD
     */
	public int GCD(int n, int m) {
		if (n == 0) return m;
		if (m == 0) return n;
		if (n > m) return GCD(m, n % m);
		return GCD(n, m % n);
	}
}
