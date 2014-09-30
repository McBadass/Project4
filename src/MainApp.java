//-----------------------------------------------------------------------
// Class:			MainApp.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Desc:
//
// Files:
//-----------------------------------------------------------------------

public class MainApp {
	public static void main(String[] args) {
		ProblemOne p1 = new ProblemOne();

		System.out.println(p1.process(6));

		ProblemTwo p2 = new ProblemTwo();

		System.out.println(p2.process("No cab, eh, Ted? I sat up. I put aside the bacon"));
		System.out.println(p2.process("Well crap"));

		ProblemThree p3 = new ProblemThree();

		System.out.println(p3.GCD(100, 372));
	}
}
