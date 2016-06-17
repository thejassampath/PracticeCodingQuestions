package Arrays;

import java.util.HashSet;

public class longestContinuousSequenceArray {

	public int lengthOfLongestSequence(int a[], int length) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		int count = 0;

		for (int arrayValue : a) {

			hashSet.add(arrayValue);

		}
		for (int i = 0; i < a.length; i++) {

			if (!hashSet.contains(a[i] - 1)) {

				int value = a[i];

				while (hashSet.contains(value));
				{
					value++;
				}
				if (count < value - a[i])
					count = value - a[i];
			}

		}

		return count;
	}

	public static void main(String args[]) {

		longestContinuousSequenceArray longest = new longestContinuousSequenceArray();
		int[] a = {1, 9, 3, 10, 4, 20, 2};
		int length = a.length;
		System.out.println(longest.lengthOfLongestSequence(a, length));
		;

	}
}
