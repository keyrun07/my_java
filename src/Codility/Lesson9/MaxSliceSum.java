package Codility.Lesson9;

import java.util.Arrays;
import java.util.Collections;

public class MaxSliceSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] int1 = { -10 };
		int result1 = solution(int1);
		System.out.println(result1);

		int[] int2 = { 3, 4, -6, 4, 0, -1, 4 };
		int result2 = solution(int2);
		System.out.println(result2);

		int[] int3 = { -2, 1, -2 };
		int result3 = solution(int3);
		System.out.println(result3);

		int[] int4 = { 1, 2, 1, 1, 2, 1 };
		int result4 = solution(int3);
		System.out.println(result4);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int maxEnding = A[0], maxSlice = A[0];
		for (int i = 1; i < A.length; i++) {
			maxEnding = Math.max(A[i], maxEnding + A[i]);
			maxSlice = Math.max(maxSlice, maxEnding);

		}
		return maxSlice;
	}
}