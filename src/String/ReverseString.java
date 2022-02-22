package String;

import java.lang.*; 
import java.io.*; 
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("convertingIntoBytes");
		convertingIntoBytes();
		System.out.println("reverseMethod");
		reverseMethod();
		System.out.println("characterArray");
		characterArray();
		System.out.println("toCharArray");
		toCharArray();
		System.out.println("ArrayList");
		ArrayList();
		System.out.println("StringBuffer");
		StringBuffer();
	}
	public static void convertingIntoBytes() 
    { 
        String input = "GeeksforGeeks"; 
  
        // getBytes() method to convert string 
        // into bytes[]. 
        byte[] strAsByteArray = input.getBytes(); 
  
        byte[] result = new byte[strAsByteArray.length]; 
  
        // Store result in reverse order into the 
        // result byte[] 
        for (int i = 0; i < strAsByteArray.length; i++) 
            result[i] = strAsByteArray[strAsByteArray.length - i - 1]; 
  
        System.out.println(new String(result)); 
    } 

	public static void reverseMethod() 
    { 
        String input = "Geeks for Geeks"; 
  
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
    }
	
	public static void characterArray() 
    { 
        String input = "GeeksForGeeks"; 
  
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length - 1; i >= 0; i--) 
            System.out.print(try1[i]); 
    } 
	
    public static void toCharArray() 
    { 
        String input = "Geeks For Geeks"; 
        char[] temparray = input.toCharArray(); 
        int left, right = 0; 
        right = temparray.length - 1; 
  
        for (left = 0; left < right; left++, right--) { 
            // Swap values of left and right 
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right] = temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
        	System.out.println(); 
    } 
    
    public static void ArrayList() 
    { 
        String input = "Geeks For Geeks"; 
        char[] hello = input.toCharArray(); 
        List<Character> trial1 = new ArrayList<>(); 
  
        for (char c : hello) 
            trial1.add(c); 
  
        Collections.reverse(trial1); 
        ListIterator li = trial1.listIterator(); 
        while (li.hasNext()) 
            System.out.print(li.next()); 
    } 
    
    public static void StringBuffer() 
    { 
        String str = "Geeks"; 
  
        // conversion from String object to StringBuffer 
        StringBuffer sbr = new StringBuffer(str); 
        // To reverse the string 
        sbr.reverse(); 
        System.out.println(sbr); 
    } 
}
