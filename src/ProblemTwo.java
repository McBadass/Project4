// Class:			ProblemTwo.java
//
// Author:			Taylor Vories
//
// Class:			CS 2050
//
// Description:		
//
// Files:			
//-----------------------------------------------------------------------
public class ProblemTwo {

	public ProblemTwo() {

	}

	public boolean process(String rawString) {
		//TODO: It would be nice if cleanString only ran once instead of each recursion
		String s = cleanString(rawString);
		if (s.length() <= 1) return true; // If length is 1, technically true
		if (s.length() == 2) {
			return s.substring(0).equals(s.substring(1));
		}
		return process(s.substring(1,s.length()-1));
	}

	/**
	 * cleanString takes a string and does the following:
	 *  - Strips whitespace
	 *  - Removes punctuation or special characters
	 *  - Sets all characters to lower-case
	 *
	 * cleanString is used to format a string in order to easily compare
	 * it in another method
	 * @param s
	 * @return String with no spaces, contains only lower case chars, and
	 * no punctuation.
	 */
	private String cleanString(String s) {
		// Remove all whitespace
		s = s.replaceAll("\\s","");

		// Remove punctuation and special characters
		s = s.replaceAll("\\p{P}\\p{S}", "");

		// Sets all characters to lower case
		s = s.toLowerCase();

		return s;
	}
}
