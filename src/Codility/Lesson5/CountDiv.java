package Codility.Lesson5;

import java.util.*;

public class CountDiv {

	public CountDiv() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(0,50,4);
		System.out.println(result);
	}

    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int firstCount =0;
        int allCount =0;
        if (B==0)
            return 1;
        if (A>1){    
           firstCount = (int)(A-1)/K;
        }
       allCount = (int)B/K;
       if (A==0)
            allCount++;
       return allCount-firstCount;
    }
}
