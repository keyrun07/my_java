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

public class ReverseLinkedList {
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

			Solution3 ob = new Solution3();
			head = ob.reverseList(head);
			printList(head);
			t--;
		}
	}
}
// } Driver Code Ends

//function Template for Java

/*
 * linked list node class:
 * 
 * class Node { int value; Node next; Node(int value) { this.value = value; } }
 * 
 */

class Solution3 {
	// Function to reverse a linked list.
	Node reverseList(Node head) {
		if (head == null)
			return null;

		// taking three pointers to store the current, previous and next nodes.
		Node prev = null;
		Node current = head;
		Node next = current.next;

		while (current != null) {
			// taking the next node as next.
			next = current.next;

			// storing the previous node in link part of current node.
			current.next = prev;

			// updating prev from previous node to current node.
			prev = current;

			// updating current node to next node.
			current = next;
		}

		return prev;
	}
}
