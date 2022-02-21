package geeks;

//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node2 {
 int data;
 Node2 left, right;

 public Node2(int d) {
     data = d;
     left = right = null;
 }
}

class InsertNode2InBST {
 static Node2 buildTree(String str) {
     // Corner Case
     if (str.length() == 0 || str.equals('N')) return null;
     String[] s = str.split(" ");

     Node2 root = new Node2(Integer.parseInt(s[0]));
     Queue<Node2> q = new LinkedList<Node2>();
     q.add(root);

     // Starting from the second element
     int i = 1;
     while (!q.isEmpty() && i < s.length) {
         // Get and remove the front of the queue
         Node2 currNode2 = q.remove();

         // Get the current Node2's value from the string
         String currVal = s[i];

         // If the left child is not null
         if (!currVal.equals("N")) {

             // Create the left child for the current Node2
             currNode2.left = new Node2(Integer.parseInt(currVal));

             // Push it to the queue
             q.add(currNode2.left);
         }

         // For the right child
         i++;
         if (i >= s.length) break;
         currVal = s[i];

         // If the right child is not null
         if (!currVal.equals("N")) {

             // Create the right child for the current Node2
             currNode2.right = new Node2(Integer.parseInt(currVal));

             // Push it to the queue
             q.add(currNode2.right);
         }

         i++;
     }

     return root;
 }

 public static void main(String args[]) throws IOException {

     BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
     int t = Integer.parseInt(br.readLine().trim());
     while (t > 0) {
         String s = br.readLine();
         Node2 root = buildTree(s);
         int key = Integer.parseInt(br.readLine().trim());
         Solution5 T = new Solution5();
         root = T.insert(root, key);
         inorder(root);
         System.out.println();
         t--;
     }
 }

 static void inorder(Node2 root) {
     if (root == null) return;

     inorder(root.left);
     System.out.print(root.data + " ");
     inorder(root.right);
 }
}
//} Driver Code Ends


//User function Template for Java

class Solution5 {
 // Function to insert a Node2 in a BST.
 Node2 insert(Node2 root, int x) {
     // your code here
     if(root==null)
         return new Node2(x);
     if(root.data<x)
         root.right=insert(root.right,x);
     else if(root.data>x)
         root.left=insert(root.left,x);
     return root;
 }
}