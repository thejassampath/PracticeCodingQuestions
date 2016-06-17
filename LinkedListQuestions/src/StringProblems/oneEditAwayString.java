package StringProblems;

public class oneEditAwayString {

	// input pale ---> bale
	// apple ---> aple
	// aple ---> apple

	public boolean checkWhichMethodToCall(String s1, String s2) {
		// first check the length of the strings and decide which method to call
		if (s1.length() == s2.length()) {
			return (replaceMethod(s1, s2));

		} else if (s1.length() + 1 == s2.length()) {
			return (insertMethod(s1, s2));

		} else if (s1.length() - 1 == s2.length()) {
			return (insertMethod(s2, s1));

		}

		return false;

	}

	private boolean insertMethod(String s1, String s2) {

		int index1 = 0;
		int index2 = 0;

		while (index1 < s1.length() && index2 < s2.length()) {

			if (s1.charAt(index1) != s2.charAt(index2)) {

				if (index1 != index2) {
					return false;
				}
				index2++;

			}
			else{
				
				index1++;
				index2++;
				
			}

		}

		return true;
	}

	private boolean replaceMethod(String s1, String s2) {

		boolean foundDifference = false;
		for (int i = 0; i < s1.length(); i++) {

			if (s1.charAt(i) != s2.charAt(i)) {

				return false;
			} else {

				foundDifference = true;

			}

		}
		return true;

	}

}
