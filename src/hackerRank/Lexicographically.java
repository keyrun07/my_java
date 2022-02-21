package hackerRank;

import java.io.*;
import java.util.*;

public class Lexicographically {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        Arrays.to
       
        /* Enter your code here. Print output to STDOUT. */
        int l = A.length() + B.length();
        
        if(A.compareTo(B)>0) {
        	System.out.println("Yes");        	
        }else {
        	System.out.println("No");
        }
        System.out.println(changeCase(A));   
        System.out.println(changeCase(B));
    }
    
    public static String changeCase(String s) {
    	StringBuilder t = new StringBuilder();
    	for (int i=0; i<s.length(); i++) {
    		if(i==0)
        	t.append(s.substring(i, i+1).toUpperCase());
    		else
    			t.append(s.substring(i, i+1));
        }
    	Deque deque = new LinkedList<>();
    	deque.off
    	
		return t.toString();
    	
    }

}

class Checker implements  Comparator<Player>{
    //  Override
  public int compare(Player p1, Player p2) {
    if (p2.score == p1.score){
        return p1.name.compareTo(p2.name);//alphabetically
    } else {
        return p2.score - p1.score;//decreasing 
    }
  }    
}
