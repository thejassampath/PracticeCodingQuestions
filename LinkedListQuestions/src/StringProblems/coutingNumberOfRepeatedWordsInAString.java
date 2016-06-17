package StringProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class coutingNumberOfRepeatedWordsInAString {
	// Sun is sun -- occurence of Sun is 2 times
	public String numberOFWords(String input) {

		// First Split the String and put it inside a String array

		String[] array = input.split(" ");
		HashMap<String, Integer> mapOfWords = new HashMap<>();
		for (String words : array) {
			if (mapOfWords.containsKey(words.toLowerCase())) {

				mapOfWords.put(words.toLowerCase(), mapOfWords.get(words.toLowerCase()) + 1);

			} else {

				mapOfWords.put(words.toLowerCase(), 1);

			}

		}

		Set<String> setOfWords = mapOfWords.keySet();
		for (String everyWord : setOfWords) {

			if (mapOfWords.get(everyWord) > 1) {
				System.out.println(everyWord + ":" + mapOfWords.get(everyWord));

			} else {

				return "NO words";
			}

		}

		return "No REPEAT WORDS";
	}

}
