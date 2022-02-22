package Tree;

//Java program for different tree traversals 

/* Class containing left and right child of current 
node and key value*/
class Node2 
{ 
 int key; 
 Node2 left, right; 

 public Node2(int item) 
 { 
     key = item; 
     left = right = null; 
 } 
} 

class BinaryTree 
{ 
 static // Root of Binary Tree 
 Node2 root; 

 BinaryTree() 
 { 
     root = null; 
 } 

 /* Given a binary tree, print its nodes according to the 
   "bottom-up" postorder traversal. */
 void printPostorder(Node2 node) 
 { 
     if (node == null) 
         return; 

     // first recur on left subtree 
     printPostorder(node.left); 

     // then recur on right subtree 
     printPostorder(node.right); 

     // now deal with the node 
     System.out.print(node.key + " "); 
 } 

 /* Given a binary tree, print its nodes in inorder*/
 void printInorder(Node2 node) 
 { 
     if (node == null) 
         return; 

     /* first recur on left child */
     printInorder(node.left); 

     /* then print the data of node */
     System.out.print(node.key + " "); 

     /* now recur on right child */
     printInorder(node.right); 
 } 

 /* Given a binary tree, print its nodes in preorder*/
 void printPreorder(Node2 node) 
 { 
     if (node == null) 
         return; 

     /* first print data of node */
     System.out.print(node.key + " "); 

     /* then recur on left sutree */
     printPreorder(node.left); 

     /* now recur on right subtree */
     printPreorder(node.right); 
 } 
 
 /* Given a binary tree, print its nodes in preorder*/
 void searchPreorder(Node2 node, int searchInt) 
 { 
	 if (node == null) 
		 return; 
	 
	 /* first print data of node */
	 if(node.key == searchInt)
	 System.out.println("found value:" + node.key + " "); 

	 /* then recur on left sutree */
	 searchPreorder(node.left, searchInt); 
	 
	 /* now recur on right subtree */
	 searchPreorder(node.right, searchInt); 
	 System.out.println("not found");
 } 
 /* function to print level order traversal of tree*/
 void printLevelOrder(Node2 root) 
 { 
     int h = height(root); 
     int i; 
     for (i=1; i<=h; i++) 
         printGivenLevel(root, i); 
 } 
 
 /* Print nodes at the given level */
 void printGivenLevel (Node2 root ,int level) 
 { 
     if (root == null) 
         return; 
     if (level == 1) 
         System.out.print(root.key + ". "); 
     else if (level > 1) 
     { 
         printGivenLevel(root.left, level-1); 
         printGivenLevel(root.right, level-1); 
     } 
     //System.out.print(root.key + "- ");
 } 
 
 /* Compute the "height" of a tree -- the number of 
 nodes along the longest path from the root node 
 down to the farthest leaf node.*/
 int height(Node2 root) 
 { 
     if (root == null) 
        return 0; 
     else
     { 
         /* compute  height of each subtree */
         int lheight = height(root.left); 
         int rheight = height(root.right); 
           
         /* use the larger one */
         if (lheight > rheight) 
             return(lheight+1); 
         else return(rheight+1);  
     } 
 } 

 // Wrappers over above recursive functions 
// void printPostorder()  {     printPostorder(root);  } 
// void printInorder()    {     printInorder(root);   } 
// void printPreorder()   {     printPreorder(root);  } 

 // Driver method 
 public static void main(String[] args) 
 { 
     BinaryTree tree = new BinaryTree(); 
     tree.root = new Node2(1); 
     tree.root.left = new Node2(2); 
     tree.root.right = new Node2(3); 
     tree.root.left.left = new Node2(4); 
     tree.root.left.right = new Node2(5); 
     String s = "aac";
     if(s.charAt(0) == s.charAt(1))
    	 System.out.println("yes");
     System.out.println(s.charAt(0));
     System.exit(0);

     System.out.println("Preorder traversal of binary tree is "); 
     tree.printPreorder(root); 
     tree.searchPreorder(root, 3); 

     System.out.println("\nInorder traversal of binary tree is "); 
     tree.printInorder(root); 

     System.out.println("\nPostorder traversal of binary tree is "); 
     tree.printPostorder(root); 
     
     System.out.println("\nLevel order traversal of binary tree is ");  
     tree.printLevelOrder(root); 
 } 
} 