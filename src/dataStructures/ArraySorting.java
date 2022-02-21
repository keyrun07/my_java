package dataStructures;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class ArraySorting {

	public ArraySorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {4,5,7,1,9,10};
		Integer[] in = {4,5,7,1,9,10};
		
//		Arrays.sort( arr);
//		System.out.println(Arrays.toString(arr));
		
		ArrayUtils.reverse(arr);
		System.out.println(Arrays.toString(arr));
		
		 String[] geeks = {"Rahul", "Utkarsh",
                 "Shubham", "Neelam"};

// Conversion of array to ArrayList
// using Arrays.asList
List al = Arrays.asList(in);


System.out.println(al);

	}

}
