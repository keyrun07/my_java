package Codility.Lesson10;

import java.util.Arrays;
import java.util.Collections;

public class CountFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result2 = solution(51);
		System.out.println(result2);
	}

	public static int solution(int N) {
        // write your code in Java SE 8       
		int sq = (int) Math.sqrt(N);

		int factor = 0;
		int perimeter = 0;
		int minPerimeter = Integer.MAX_VALUE;

		if (Math.pow(sq, 2) != N) {
			sq++;
		} else {
			minPerimeter = 2 * (sq + sq);
		}

		for (int i = 1; i < sq; i++) {
			if (N % i == 0) {
				factor = N / i;
				perimeter = 2 * (factor + i);
				minPerimeter = Math.min(perimeter, minPerimeter);
			}
		}
		return minPerimeter;        
	}
}