package Recursion;

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
		
		r.printReverseRecursive1(r.ar, r.ar.size());	
		System.out.println("--------------");
		r.printReverseRecursive2(r.ar, 0);	
	}
	
	public void printReverseRecursive1(ArrayList<Integer> ar2, int s) {
		if(s >0) {                   
			System.out.println("Before:"+ar2.get(s-1));  
			printReverseRecursive1(ar2, --s);
			System.out.println("After:"+ar2.get(s));  
		}
	}
	public void printReverseRecursive2(ArrayList<Integer> ar2, int s) {
		if(s < ar2.size()) {                   
			System.out.println("Before:"+ar2.get(s));  
			printReverseRecursive2(ar2, ++s);
			System.out.println("After:"+ar2.get(s-1));  
		}
	}
}
