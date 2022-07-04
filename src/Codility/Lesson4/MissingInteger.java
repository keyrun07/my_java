package Codility.Lesson4;

import java.util.*;

public class MissingInteger {

	public MissingInteger() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {3,4,4,6,1,4,4};
		int result = solution(input);
		System.out.println (result);
	}
	
    public static int solution(int[] A) {
        // write your code in Java SE 8
        //Set hm = new HashSet();


        Arrays.sort(A);
        int counter=0;
        int previous =0;

        for(int i =0; i<A.length; i++){
            if(A[i]>0){
                if(previous != A[i]){
                    counter++;
                    if(A[i]!= counter){
                        return counter;
                    }
                }
                previous = counter;
            }
        }
        if(counter>=0){
            return counter +1;
        }
        return 1;
    }
}
