package testPackage;

import linkedlistProblems.*;

public class LinkedListTest {

	// Inserting node in head of linked list

	public static void main(String args[]) {

		LinkedList ll = new LinkedList();
		ll.insertIntoHead(1);
		ll.insertIntoHead(2);
		ll.insertIntoHead(3);
		ll.insertIntoHead(4);
		ll.insertIntoHead(3);
		ll.insertIntoHead(3);

		System.err.println("The List");
		ll.displayList();
		System.err.println("Nth NODE FROM THE LAST");
		nthNodeProblem n = new nthNodeProblem();
		n.nthNodeFromTheLast(3, ll);
		System.err.println("Remove duplicates");
		removeDuplicates rd = new removeDuplicates();
		rd.removeDuplicate(ll);
		ll.displayList();

		LinkedList ll1 = new LinkedList();
		ll1.insertIntoHead(1);

		ll1.insertIntoHead(3);

		ll1.insertIntoHead(5);
		ll1.insertIntoHead(8);

		LinkedList ll2 = new LinkedList();

		ll2.insertIntoHead(2);

		ll2.insertIntoHead(4);
		ll2.insertIntoHead(6);
		ll2.insertIntoHead(7);

		Node n1 = new Node(ll1.getHead());
		Node n2 = new Node(ll2.getHead());
		merginglinkedlist merge = new merginglinkedlist();
		Node newNode = merge.mergeList(n1, n2);
		merge.displayList(newNode);

		LinkedList newll = new LinkedList();
		newll.head1 = new Node(1);
		newll.head1.next = new Node(2);
		newll.head1.next.next = new Node(3);
		newll.head1.next.next.next = new Node(4);
		newll.head1.next.next.next.next = new Node(5);
		newll.head1.next.next.next.next.next = new Node(6);

		newll.head2 = new Node(7);
		newll.head2.next = new Node(8);
		newll.head2.next.next = new Node(5);
		newll.head2.next.next.next = new Node(6);

		findingIntersection fi = new findingIntersection();
		int count1 = fi.count(newll.head1);
		int count2 = fi.count(newll.head2);
		
		fi.findPointOfMerging(count1,count2,newll.head1,newll.head2);
		
	  


	}

}
