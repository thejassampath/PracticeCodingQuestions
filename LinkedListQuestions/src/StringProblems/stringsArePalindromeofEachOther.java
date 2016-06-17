package StringProblems;

import java.util.Arrays;

public class stringsArePalindromeofEachOther {

	public boolean checkIfPalindrome(String s1, String s2) {

		// check the length first
		if (s1.length() != s2.length()) {

			return false;
		}
		return palindrome(s1).equals(palindrome(s2));
	}

	public String palindrome(String s) {

		char[] c1 = s.toCharArray();

		Arrays.sort(c1);

		return new String(c1);

	}

}
