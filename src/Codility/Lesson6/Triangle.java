package Codility.Lesson6;

import java.util.*;

public class Triangle {

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in2 = {8, 4, 5, 6,10,15,25 };
		int result = solution(in2);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		if (A.length < 3)
			return 0;

		Arrays.sort(A);
		// made long array because each int element can be as high as
		// Integer MAX_VALUE so when add them can overflow int
		long[] aOrdered = new long[A.length];
		int index = 0;
		for (Integer i : A) {
			aOrdered[index++] = i;
		}
		// start from the end (largest)
		// if previous 2 elements have sum > current element, found a triangle
		for (int i = aOrdered.length - 1; i >= 2; i--) {
			if (aOrdered[i - 1] + aOrdered[i - 2] > aOrdered[i]) {
				return 1;
			}
		}
		return 0;
	}

}
