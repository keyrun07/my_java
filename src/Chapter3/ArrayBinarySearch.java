package Chapter3;

import java.util.Arrays;

public class ArrayBinarySearch {

	public ArrayBinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers1 = new int[] {1,2,3,5};
		System.out.println(Arrays.binarySearch(numbers1, 2));
		System.out.println(Arrays.binarySearch(numbers1, 3));
		
		System.out.println("111111111111111111");
		
		int[] numbers2 = new int[] {9,1,6,2,3,5};
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
		System.out.println(Arrays.binarySearch(numbers2, 6));
		System.out.println(Arrays.toString(numbers2));
		
		System.out.println("2222222222222222222");
		Arrays.sort(numbers2);
		System.out.println(Arrays.binarySearch(numbers2, 2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
		System.out.println(Arrays.binarySearch(numbers2, 6));
		System.out.println(Arrays.toString(numbers2));

	}

}
