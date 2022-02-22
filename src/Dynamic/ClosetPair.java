package Dynamic;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosetPair {

    static void getValue(int[] pair1, int[] pair2, int value) {
    		ArrayList<ArrayList <Integer>> result = new ArrayList<ArrayList <Integer>>();
    		int closet = 0;
    		int current;
    		int diff;
    		boolean initialied =false;
        for (int i = 0; i < pair1.length; i++) {
	        	for (int j = 0; j < pair2.length; j++) {
	        		current = pair1[i]+pair2[j];
	        		diff = Math.abs(value - current);
	        		if(!initialied) {
	        			closet =diff;
	        			initialied = true;
	        			ArrayList<Integer> temp = new ArrayList(Arrays.asList(i, j, closet));
	        			result.add(temp);
	        			continue;
	        			//System.out.println("sdfsdf");
	        			
	        		}
	        		if (diff < closet) {
	        			closet = diff;
	        			result.clear();
	        			ArrayList<Integer> temp = new ArrayList(Arrays.asList(i, j, closet));
	        			result.add(temp);
	        		}
	        		if (diff == closet) {
	        			closet = diff;
	        			ArrayList<Integer> temp = new ArrayList(Arrays.asList(i, j, closet));
	        			result.add(temp);
	        		}
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] pair1 = new int[]{-3, 21, 1, 40, 3, 19, -9, 10};
        int[] pair2 = new int[]{13, 7, 7, 15, 1, 4, 9, 30};
        int value = 24;
        getValue(pair1, pair2, value);
    }
}