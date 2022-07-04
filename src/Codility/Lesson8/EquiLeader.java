package Codility.Lesson8;

import java.util.*;

public class EquiLeader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] int1 = { 3, 4, 3, 4, 4, 4, 2,4,4};
		int result1 = solution(int1);
		System.out.println(result1);
		
		int[] int2 = { 0,0};
		int result2 = solution(int2);
		System.out.println(result2);
		
		int[] int3 = {4, 4, 2, 5, 3, 4, 4, 4};
		int result3 = solution(int3);
		System.out.println(result3);
		
		int[] int4 = {1, 2, 1, 1, 2, 1};
		int result4 = solution(int3);
		System.out.println(result4);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
	        if(A.length==1) {
	            return 0;    
	        }
	        
	        int value = A[0];
	        int size=0;
	        for(int i=0;i<A.length;i++) {
	            if(size==0) {
	                size++;    
	                value = A[i];
	            }else {
	                if(A[i]==value) {
	                    size++;    
	                }else {
	                    size--;
	                }                
	            }   
	        }
	        //System.out.println("Value: "+ value);
	        int candidate = -1;
	        int count = 0;     
	        if(size>0) {
	           candidate = value;     
	        }
	        
	        for(int i=0;i<A.length;i++) {
	            if(A[i]==candidate) {
	                count++;
	            }    
	        }

	        if(count<=A.length/2) {  
	            return 0;
	        }
	        
	        int leader = candidate;
	        int equiCount = 0;
	        int leaderCount = 0;
	        for(int i=0;i<A.length;i++) {
	            if (A[i] == leader) {
	                leaderCount++;    
	            }
	            
	            if(leaderCount>(i+1)/2  && (count-leaderCount)>(A.length-i-1)/2) {
	                equiCount++;    
	            }
	        }
	        
	        return equiCount;
	    }
	}