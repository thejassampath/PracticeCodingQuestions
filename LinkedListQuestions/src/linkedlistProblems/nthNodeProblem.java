package linkedlistProblems;

import javax.swing.plaf.SliderUI;

public class nthNodeProblem {

	

	public void nthNodeFromTheLast(int n,LinkedList ll) {
		
		
		
		Node slowPointer = ll.head;
		Node fastPointer = ll.head;

		int count = 0;
		while (count < n) {
			fastPointer = fastPointer.next;
			count++;

		}
		while (fastPointer != null) {

			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;

			]''
		}
		
		System.out.println("Node"+n+"from the last is"+slowPointer.data);

	}

}
