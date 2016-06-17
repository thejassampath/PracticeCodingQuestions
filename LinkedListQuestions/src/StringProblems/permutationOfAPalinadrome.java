package StringProblems;

import java.util.HashSet;

public class permutationOfAPalinadrome {

	public boolean check(String s) {

		s = s.replaceAll("\\s+", "").trim();

		HashSet<Character> set = new HashSet<Character>();

		char[] c = s.toCharArray();

		for (char cc : c) {
			if (!set.contains(cc)) {

				set.add(cc);

			} else {

				set.remove(cc);

			}
			if (set.size() <= 1) {

				return true;

			}

		}

		return false;
	}

}
