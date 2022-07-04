package Codility.Lesson8;

import java.util.*;

public class Dominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in2 = { 3, 4, 3, 2, 3, -1, 3, 3 };

		int result = solution(in2);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int dominatorKey = -1;
		int dominatorValue = -1;

		for (int i = 0; i < A.length; i++) {
			if (hm.containsKey(A[i])) {
				hm.put(A[i], hm.get(A[i]) + 1);
			} else {
				hm.put(A[i], 1);
			}
		}
		if (hm.size() == 0)
			return -1;

		if (hm.size() == 1)
			return 0;

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > dominatorValue) {
				dominatorKey = entry.getKey();
				dominatorValue = entry.getValue();
			}
		}
		// if(dominatorValue > (A.length/2)) {
		// hm.get()
		// }
		// int dominatorValue = Collections.max(hm.entrySet(),
		// Map.Entry.comparingByValue()).getValue();
		// int dominatorKey = (int)Collections.max(hm.entrySet(),
		// Map.Entry.comparingByValue()).getKey();

		if (dominatorValue > (A.length / 2)) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] == dominatorKey) {
					return i;
				}
			}
		}
		return -1;
	}
}
