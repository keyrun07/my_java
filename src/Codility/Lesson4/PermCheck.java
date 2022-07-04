package Codility.Lesson4;

import java.util.*;

public class PermCheck {

	public PermCheck() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {1,3,1,1,2,3,4,7,6,5,7,8};
		int result = solution( input);
		System.out.println (result);
	}
	
	public static int solution( int[] A) {
        // write your code in Java SE 8
        // write your code in Java SE 8
        Arrays.sort(A);
        Set<Integer> set1  = new HashSet<Integer>();
        for (int a : A){
            set1.add(a);
        }
        int sLen = set1.size();
        int iLen = A.length;
        if(sLen != iLen)
            return 0;

        if(A[iLen-1] == sLen){
            return 1;
        }else{
            return 0;
        }
    }

}
