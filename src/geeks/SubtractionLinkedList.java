package geeks;


import java.util.*;

//class Node {
// int data;
// Node next;
//
// Node(int d) {
//     data = d;
//     next = null;
// }
//}

class SubtractionLinkedList{
 
 static void printList(Node n){
     while(n!=null){
         System.out.print(n.data+" ");
         n = n.next;
     }
     System.out.println();
 }
 
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int T = sc.nextInt();
     
     while (T-- > 0) {
         
         int n = sc.nextInt();
         int val = sc.nextInt();
         
         Node first = new Node(val);
         Node tail = first;
         for(int i=0; i<n-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         int m = sc.nextInt();
         val = sc.nextInt();
         
         Node second = new Node(val);
         tail = second;
         for(int i=0; i<m-1; i++)
         {
             val = sc.nextInt();
             tail.next = new Node(val);
             tail = tail.next;
         }
         
         Solution4 g = new Solution4();
         Node res = g.subLinkedList(first, second);
         printList(res);
     }
 }
}
//} Driver Code Ends


/* Structure of Linked list node

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

*/

class Solution4
{
	static int length(Node n)
 {
     int ret = 0;
     while(n != null)
     {
         ret+=1;
         n = n.next;
     }
     return ret;
 }
 
 static Node reverse(Node head) 
 // this function reverses the linked list
 {
     Node prev = null;
     Node current = head;
     Node next;
     
     while (current != null) 
     { 
         next = current.next;      // storing next node
         current.next = prev;      // linking current node to previous
         prev = current;           // updating prev
         current = next;           // updating current
     }
     
     return prev; 
 }
 
 static Node subLinkedList(Node l1, Node l2)
 {
     while(l1!=null && l1.data==0)
         l1 = l1.next;
         // removing trailing zeroes from l1
     
     System.out.println(l1);
     while(l2!=null && l2.data==0)
         l2 = l2.next;
         // removing trailing zeroes from l2
     
     int n1 = length(l1);
     int n2 = length(l2);
     
     if(n2>n1)
         { Node temp=l1; l1=l2; l2=temp; }
         // making sure l1 list has the bigger number
     
     if(n1==n2)
     {
         Node t1=l1, t2=l2;
         while(t1.data == t2.data )
         // finding which number is greater
         {
             t1 = t1.next;
             t2 = t2.next;
             
             if(t1==null) return new Node(0);
             // returning zero if both numbers are same
         }
         if(t2.data > t1.data)
             { Node temp=l1; l1=l2; l2=temp; }
             // making sure l1 list has the bigger number
     }
     
     l1 = reverse(l1);
     l2 = reverse(l2);
     
     Node res = null;
     Node t1 = l1, t2 = l2;
     while(t1!=null)
     {
         int small = 0;
         if(t2!=null) small = t2.data;
         // 'small' holds the next digit of number to be subtracted
         
         if( t1.data < small )
         {
             t1.next.data = t1.next.data - 1;
             t1.data = t1.data + 10;
             // taking carry
         }
         
         Node n = new Node( t1.data - small );
         // creating new node for storing difference
         n.next = res;
         res = n;
         
         t1 = t1.next;
         if(t2!=null) t2 = t2.next;
     }
     
     while(res.next!=null && res.data==0)
         res = res.next;
         // removing trailing zeroes from result list
     
     return res;
 }
}