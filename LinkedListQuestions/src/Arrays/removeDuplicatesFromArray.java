package Arrays;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class removeDuplicatesFromArray {

	public int[] removeDuplicates(int a[]) {
		Set<Integer> unique = new TreeSet<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!unique.contains(a[i])) {
				unique.add(a[i]);
				arrayList.add(a[i]);

			}
		}

		int[] result = new int[arrayList.size()];
		for (int j = 0; j < result.length; j++) {

			result[j] = arrayList.get(j);

		}

		return result;
	}

}
