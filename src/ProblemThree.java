// Class:			ProblemThree.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		
//
// Files:			
//-----------------------------------------------------------------------
public class ProblemThree {
	public ProblemThree() {

	}

	public int GCD(int n, int m) {
		if (n == 0) return m;
		if (m == 0) return n;
		if (n > m) return GCD(m, n % m);
		return GCD(n, m % n);
	}
}
