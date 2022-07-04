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
        int factor = (int)N/sq;
        while (sq * factor != N) {
        	sq++;
        	factor = (int)N/sq;
        }
        return 2 * sq + 2 * factor;        
	}
}