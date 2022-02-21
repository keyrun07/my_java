package geeks;

//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node {
	int data;
	Node next;

	Node(int x) {
		data = x;
		next = null;
	}

}

public class DeleteMiddleLinkedList {
	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			Node head = new Node(sc.nextInt());
			Node tail = head;
			for (int i = 0; i < n - 1; i++) {
				tail.next = new Node(sc.nextInt());
				tail = tail.next;
			}
			Solution2 g = new Solution2();
			head = g.deleteMid(head);
			printList(head);
			t--;
		}
	}
}

//} Driver Code Ends

/*
 * class Node { int data; Node next; Node(int d) { data = d; next = null; } }
 */

class Solution2 {
	Node deleteMid(Node head) {
		// This is method only submission.
		// You only need to complete the method.

		if (head == null)
			return null;

		if (head.next == null)
			return null;

		Node prev = null;
		Node slow_ptr = head;
		Node fast_ptr = head;

		while (fast_ptr != null && fast_ptr.next != null) {
			fast_ptr = fast_ptr.next.next;
			// fast pointer moves 2 nodes ahead everytime loop is run

			prev = slow_ptr;
			// updating prev, prev holds previous value of slow pointer

			slow_ptr = slow_ptr.next;
			// slow pointer moves 1 node ahead everytime loop is run
		}

		// since slow pointer was moving at half speed, it points at
		// mid node when fast pointer reaches the end
		prev.next = slow_ptr.next; // bypassing mid node

		return head;

	}
}