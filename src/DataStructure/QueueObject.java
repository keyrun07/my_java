package DataStructure;

	// Java program to implement Queue using  
	// two stacks with costly enQueue()  
	import java.util.*; 
	  
	public class QueueObject 
	{  

		Queue queueA = new LinkedList();
		Queue queueB = new PriorityQueue();
		static Queue<Integer> queue = new LinkedList<>();
	  
	    static void enQueue(int x)  
	    { 
	    		queue.add(x);

	    }  
	  
	    // Dequeue an item from the queue  
	    static int deQueue()  
	    {  
	    //if(queue.size()>0) 
	    	return queue.poll();
	    //else   	
	    //return 0;

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
	}  
}  
	  
	// This code is contributed by Prerna Saini 