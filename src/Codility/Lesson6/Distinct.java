package Codility.Lesson6;

import java.util.*;

public class Distinct {

	public Distinct() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in2 = { 4, 5, 6 };
		int result = solution(in2);
		System.out.println(result);
	}

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set set = new HashSet();
        for (int i =0; i<A.length; i++){
            set.add(A[i]);
        }
        return set.size();
    }

}
