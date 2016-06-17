package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class firstNonRepeatedCharacter {

	public char firstNonRepeatedCharacter(String word) {
		char[] wordArray = word.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : wordArray) {

			if (map.containsKey(c)) {

				map.put(c, (map.get(c) + 1));

			} else {

				map.put(c, 1);

			}

		}

		for (char rep : wordArray) {

			if (map.get(rep) == 1) {

				return rep;

			}
		}

	    return '0';
	}

	public static void main(String args[]) {
		firstNonRepeatedCharacter fn = new firstNonRepeatedCharacter();
		String words = "ABCDACD";
		fn.firstNonRepeatedCharacter(words);

	}

}
