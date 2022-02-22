package Chapter3;

import java.util.*;

public class MultidimensionalArray {
	public static void main(String args[]) {
		int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
		differentSize[1][0]=2;
		System.out.println(differentSize[1][0]);
		int[][] twoD = new int[3][2];
		twoD[0][1]=5;
		twoD[1][1]=5;
		//twoD[1][2]=5; // compile error
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++)
				System.out.print(twoD[i][j] + "-"); // print element
			System.out.println(); // time for a new row
		}
		
		
		
	}
}