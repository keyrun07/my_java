package Tree;
import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class TreeHeight {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height1(Node root) {
        if (root == null) 
            return 0; 
        else 
        { 
            /* compute the depth of each subtree */
        System.out.println ("call");
            int lDepth = height1(root.left); 
            int rDepth = height1(root.right); 
            System.out.println ("lDepth: " + lDepth );
            System.out.println ("rDepth: " + rDepth );
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        }
    }
    public static int height(Node root) {
        return height1(root) -1;
    }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}