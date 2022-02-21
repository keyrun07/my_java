package Regex;

import java.util.*;
import java.util.regex.*;  

public class JavaPoint {

	public JavaPoint() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		regex1();
		regex2();

	}
	
	public static void regex1() {
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  
		
	}

	public static void regex2() {
		System.out.println("by character classes and quantifiers ...");  
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println("Regex 2- 5: "+Pattern.matches("[7890][0-9]{9}", "0773038949"));//true  
		  
		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println("Regex 2- 7: "+Pattern.matches("[7893]{1}\\d{9}", "3853038949"));//false (starts from 3)  
		  
		
		
	}

	public static void regex3() {
		 Scanner sc=new Scanner(System.in);  
	        while (true) {    
	            System.out.println("Enter regex pattern:");  
	            Pattern pattern = Pattern.compile(sc.nextLine());    
	            System.out.println("Enter text:");  
	            Matcher matcher = pattern.matcher(sc.nextLine());    
	            boolean found = false;    
	            while (matcher.find()) {    
	                System.out.println("I found the text "+matcher.group()+" starting at index "+    
	                 matcher.start()+" and ending at index "+matcher.end());    
	                found = true;    
	            }    
	            if(!found){    
	                System.out.println("No match found.");    
	            }    
	        }    
		
	}

	public static void regex4() {
		
	}

}
