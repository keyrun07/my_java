package DataStructure;

	// Java program to implement Queue using  
	// two stacks with costly enQueue()  
	import java.util.*; 
	  
	public class QueueSimple  
	{  

	    static ArrayList <Integer> s1 = new ArrayList<Integer>();  

	  
	    static void enQueue(int x)  
	    { 
	    		s1.add(x);

	    }  
	  
	    // Dequeue an item from the queue  
	    static int deQueue()  
	    {  
	    if(s1.size()>0) 
	    	return s1.remove(0);
	    else   	
	    return 0;

	    }  

	// Driver code  
	public static void main(String[] args)  
	{  

	    enQueue(1);  
	    enQueue(2);  
	    enQueue(3); 
	    System.out.println(deQueue());  
	    enQueue(4);  
	    enQueue(5);  
	  
	    System.out.println(deQueue());  
	    System.out.println(deQueue()); 
	    System.out.println(deQueue()); 
	    System.out.println(deQueue()); 
	    System.out.println(deQueue()); 
	    System.out.println(deQueue()); 
	    System.out.println(deQueue()); 
	}  
}  
	  
	// This code is contributed by Prerna Saini 