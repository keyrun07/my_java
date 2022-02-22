
import java.util.*;

public class Reverse {
	ArrayList<Integer> ar = new ArrayList <Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r = new Reverse();
		r.ar.add(4);
		r.ar.add(5);
		r.ar.add(6);
		r.ar.add(2);
		
		r.ar = r.reverseRecursive(r.ar);		
		System.out.println(r.ar);
		//r.ar = r.reverse(r.ar);		
		//System.out.println(r.ar);

	}
	
	public ArrayList<Integer> reverseRecursive(ArrayList<Integer> ar2) {
	    if(ar2.size() > 1) {                   
	        Object value = ar2.remove(0);
	        System.out.println("before value "+value); 
	        System.out.println("before ar2 "+ar2);  
	        reverseRecursive(ar2);
	        System.out.println("after"+ar2);  
	        ar2.add((Integer) value);
	    }
	    return ar2;
	}
	public ArrayList<Integer> reverse(ArrayList<Integer> ar2) {
	    for(int i = 0, j = ar2.size() - 1; i < j; i++) {
	    //	System.out.println( i +"before"+ar2);    
	    	ar2.add(i, ar2.remove(j));
	    	//System.out.println( i +"after"+ar2); 
	        
	    }
	    
	    return ar2;
	}
}
