package Codility.Lesson6;

import java.util.*;

public class MaxProductOfThree {

	public MaxProductOfThree() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] in2 = { 4, 5, 6 };
		int result = solution(in2);
		System.out.println(result);
	}

    public static int solution(int[] A) {
        List aList = new ArrayList();
        for(int i=0; i<A.length; i++) {
          aList.add(A[i]);
        }
        Collections.sort(aList);
       
        int product1, product2, product3, product4 = 0;

        product1 = (int)aList.get(0) * (int)aList.get(1) * (int)aList.get(2); //first 3 elements
        product2 = (int)aList.get(aList.size()-3) * (int)aList.get(aList.size()-2) * (int)aList.get(aList.size()-1); //last 3 elements
        product3 = (int)aList.get(0) * (int)aList.get(1) * (int)aList.get(aList.size()-1); //first 2 and last element
        product4 = (int)aList.get(0) * (int)aList.get(aList.size()-2) * (int)aList.get(aList.size()-1); //first and last 2 elements

        int max1 = Math.max(product1, product2);
        int max2 = Math.max(product3, product4);
       
        return Math.max(max1, max2);
    }

}
