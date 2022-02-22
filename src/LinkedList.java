import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

// Java program for reversing the linked list 
  
class LinkedList { 
  
    static Node head; 
  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    /* Function to reverse the linked list */
    Node reverse(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
    } 
    void reverse2(Node node) 
    { 
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        ArrayList<Integer> chain = new ArrayList<Integer>();
        while (current != null) { 
        		chain.add(current.data); 
            current = current.next; 
        } 
        System.out.println("Reverse2");

        System.out.println(chain);
        
        node = prev; 
  //      return node; 
    } 
    // prints content of double linked list 
    void printList(Node node) 
    { 
        while (node != null) { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 
        list.head = new Node(85); 
        list.head.next = new Node(15); 
        list.head.next.next = new Node(4); 
        list.head.next.next.next = new Node(20); 
        list.head.next.next.next.next = new Node(25); 
  
        System.out.println("Given Linked list"); 
        list.printList(head); 
        //head = list.reverse(head); 
        list.reverse2(head);
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
    } 
public ArrayList<Object> reverse(ArrayList<Object> list) {
    if(list.size() > 1) {                   
        Object value = list.remove(0);
        reverse(list);
        list.add(value);
    }
    return list;
}
} 
  
// This code has been contributed by Mayank Jaiswal 