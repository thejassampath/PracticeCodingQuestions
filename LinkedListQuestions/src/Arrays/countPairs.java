package Arrays;

import java.util.HashSet;
import java.util.Set;

public class countPairs {

	public int countallPairs(int[] a, int sum) {

		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int number : a) {

			int target = sum - number;

			if (!set.contains(target)) {

				set.add(number);

			} else {

				count++;

			}

		}

		return count;

	}

	public static void main(String args[]) {

		countPairs cp = new countPairs();
		int[] a = { 1, 2, 3, 4, 5 };
		int sum = 7;
		System.out.println(cp.countallPairs(a, sum));

	}

}
