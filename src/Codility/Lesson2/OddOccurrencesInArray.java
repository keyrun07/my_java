package Codility.Lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class OddOccurrencesInArray {

	public OddOccurrencesInArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // write your code in Java SE 8
		int[] A = {6,7,8,7,6};
		
		
		  HashMap <Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
		   
		  Collections.sort();
		    for(int i=0; i<A.length; i++) {
		      if(occurrencesMap.containsKey(A[i])) {
		        int occurrences = occurrencesMap.get(A[i]);
		        occurrences++;
		        occurrencesMap.put(A[i], occurrences); //increment occurrence counter and store it
		      }
		      else {
		        occurrencesMap.put(A[i], 1); //1st occurrences of this value
		      }
		    }

		    Set<Integer> keySet = occurrencesMap. keySet();
		   
		    for(int currentKey : keySet) {
		      int occurrences = occurrencesMap.get(currentKey);
		     
		      //if occurs odd number of times, we found the unpaired value - no need to continue checking
		      if(occurrences % 2 != 0) {
		    	  //return currentKey;
		    	  System.out.println(currentKey);
		    	  }
		    }
		    //should never get to here
		   // throw new RuntimeException("shouldn't get to here - should've return unpaired value by now");
		
//        boolean isFound=false;
//        List <Integer> result = new ArrayList<Integer>();
//        for(int i = 0; i< A.length; i++){
//            isFound =false;
//            if (i < A.length -1){
//                for(int j = i+1; j< A.length; j++){
//                    if(A[i]==A[j]){
//                        result.add(A[i]);
//                        isFound =true;
//                    }
//                }
//            }
//            if(!isFound && result.contains(A[i])==false){
//                System.out.println(A[i]);
//            }
//        }

	}

}
