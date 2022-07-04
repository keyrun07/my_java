package Codility.Lesson7;

import java.util.*;

public class Fish {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in1 = { 4, 5, 3, 2, 1 };
		int[] in2 = { 0, 1, 0, 0, 0 };
		int result = solution(in1, in2);
		System.out.println(result);
	}

	public static int solution(int[] A, int[] B) {
		final int UPSTREAM = 0;

		Stack fishStack = new Stack();
		fishStack.push(new Fish1(A[0], B[0]));

		for (int i = 1; i < A.length; i++) {
			Fish1 f1 = (Fish1) fishStack.peek();
			if (B[i] == f1.direction) { // same direction, so put another fish on stack
				fishStack.push(new Fish1(A[i], B[i]));
			} else if (f1.direction == UPSTREAM) {
				// if top of stack fish is upstream, not right condition to see who's eating who
				fishStack.push(new Fish1(A[i], B[i]));
			} else {
				// figure out who's eating who
				while (!fishStack.isEmpty()) {
					// current fish is swimming in same direction as top of stack fish - they can't
					// eat other
					f1 = (Fish1) fishStack.peek();
					if (f1.direction == B[i]) {
						fishStack.push(new Fish1(A[i], B[i]));
						break;
					} else { // existing fish that was on stack eats latest fish
						f1 = (Fish1) fishStack.peek();
						if (f1.size > A[i]) {
							break; // eating finished
						} else {
							fishStack.pop();
							continue; // keep checking other elements on stack
						}
					}
				}
				if (fishStack.isEmpty()) {
					fishStack.push(new Fish1(A[i], B[i]));
					// current fish ate all the fish in the stack
				}
			}
		}
		return fishStack.size();
	}

}


class Fish1 {
	public int size;
	public int direction;

	Fish1(int pSize, int pDirection) {
		size = pSize;
		direction = pDirection;
	}
}

