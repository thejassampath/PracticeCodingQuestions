package linkedlistProblems;

import java.util.HashSet;

public class removeDuplicates {

	public LinkedList removeDuplicate(LinkedList ll) {
		Node current = ll.head;
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(current.data);
		while (current.next != null) {
			if (set.contains(current.next.data)) {

				current.next = current.next.next;

			} else {

				set.add(current.next.data);
				current = current.next;

			}
p
		}
		return ll;
	}
}
