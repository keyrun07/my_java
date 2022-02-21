package geeks;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class LargestSubArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int N = sc.nextInt();
			int a[] = new int[N];
			for (int i = 0; i < N; i++)
				a[i] = sc.nextInt();

			Solution g = new Solution();
			int n = g.maxLen(a, a.length);

			System.out.println(n);

			T--;
		}
	}
}

class Solution {

	// arr[] : the input array containing 0s and 1s
	// N : size of the input array

	// return the maximum length of the subarray
	// with equal 0s and 1s
    int maxLen(int[] arr, int N)
    {
	        HashMap <Integer,Integer> m = new HashMap<Integer,Integer> ();
	        
	        int count =0;
	        for(int i=0;i<N-1;i++) {
	        	for(int j=i+2;j<=N;j++) {
	        		int [] sub = Arrays.copyOfRange(arr, i, j);
	        		if (countN(sub, 0)==countN(sub, 1)){
	        		    count++;
	        		}
 	        	}	           
	        }
	        return count;
    }
    int countN(int[] arr, int N)
    {
        int count =0;
	    for(int i=0;i<arr.length;i++) {
	        if (arr[i] == N)
	            count++;
        }

	    return count;
        
    }
}