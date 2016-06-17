package StringProblems;

public class replacingEmptySpaceWithpercentage20 {

	// input "Mr John Smith "
	// output "Mr%20John%20Smith"
	 
	public void replaceSpaces(char[] s, int length) {
		int countspace = 0;
		int newLength, i;
		for (i = 0; i < length; i++) {
			if (s[i] == ' ') {

				countspace++;

			}

		}
		newLength = length + countspace * 2;
		// character string null terminated cos in input they might be space
		// after the last word
		s[newLength] = '\0';
		// next replacing spacing by traversing from the back
		for (i = newLength - 1; i < newLength; i--) {

			if (s[i] == ' ') {
				s[newLength - 1] = '0';
				s[newLength - 2] = '2';
				s[newLength - 3] = '%';
				newLength = newLength - 3;

			} else {

				s[newLength - 1] = s[i];
				newLength = newLength - 1;

			}
		}

	}

}
