package Codility.Lesson5;

import java.util.*;

public class PassingCars {

	public PassingCars() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 3, 4, 4, 6, 1, 4, 4 };
		int result = solution(input);
		System.out.println(result);
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int zeros = 0;
		int carPasses = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				zeros++;
			} else if (A[i] == 1) { // for every 1 - there will be an extra car pass for ALL the 0's that came
									// before it
				carPasses += zeros;
				if (carPasses > 1000000000) {
					return -1;
				}
			}
		}
		// else throw new RuntimeException("shouldn't reach here");

		return carPasses;
	}
}
