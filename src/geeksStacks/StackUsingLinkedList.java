package geeksStacks;

import java.util.*;

class StackNode {
	int data;
	
	StackNode next;

	StackNode(int a) {
		Integer.valueOf(s)
		data = a;
		next = null;
	}
}

class StackUsingLinkedList {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			MyStack obj = new MyStack();
			int Q = sc.nextInt();
			while (Q > 0) {
				int QueryType = 0;
				QueryType = sc.nextInt();
				if (QueryType == 1) {
					int a = sc.nextInt();
					obj.push(a);
				} else if (QueryType == 2) {
					System.out.print(obj.pop() + " ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		}
	}
}

class MyStack {
	StackNode top;

	// Function to push an integer into the stack.
	void push(int a) {
		if (top == null) {
			top = new StackNode(a);
		} else {
			// creating a new temp node in the stack
			StackNode temp = new StackNode(a);
			// assigning link part of new node to top and making it top node.
			temp.next = top;
			top = temp;
		}
	}

	// Function to remove an item from top of the stack.
	int pop() {

		// if node at temp pointer is null, the stack is empty so we return -1.
		if (temp == null) {
			return -1;temp
		} else {
			// storing the data at top node and deleting that node.
			temp = temp.next;
			int r = top.data;
			top = temp;

			// returning the data.
			return r;
		}
	}
    static int ways(int a[], int n) {
        // code here
        
        HashSet<Integer> set = new HashSet<>();
       String s= "sss";
      
        
        
        

        
        int count =0;
        int l = a.length;
        List<ArrayList<Integer>> mul = new ArrayList<>();
        for (int x =0; x<l; x++){
           for (int y=0; y<l; y++){
               for (int z=0; z<l; z++){
                   if((x != y) && (y!=z) && (x !=z) ){
                        if ((a[x] + a[y] + a [z] ) == 0){
                            
                            ArrayList<Integer> itm = new ArrayList<Integer>();
                            
                            itm.add(x);
                            itm.add(y);
                            itm.add(z);
                            itm.contains(o)
                            
                            for(ArrayList obj:mul) {
                                ArrayList<Integer> temp = obj;
                                if(temp.contains(x) && temp.contains(y) && temp.contains(z) ) {
                                	
                                }else {
                                for(Integer job : temp){
                                    System.out.print(job+" ");
                                }
                                System.out.println();
                            }
        
        
                            Integer.valueOf(4);//integer
                            String.valueOf(data);//string
                            
                            
//                            String s1 = Integer.valueOf(x);
//                            String s2 = Integer.valueOf(y);
//                            String s3 = Integer.valueOf(z);
//                            
//                            String combine1 =  s1+"_"+s2+"_"+s3;
//                            String combine1 =  s1+"_"+s2+"_"+s3;
                            count++;
                        }  
                   }
                }
            } 
        }
        return count;
    
    }
}


        