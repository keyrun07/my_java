package Regex;

import java.util.*;
import java.util.regex.*;

public class Pattern1 {

	public Pattern1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s= "FirstKnight123";
		String ip= "FirstKnight123";
		// TODO Auto-generated method stub
		//System.out.println(Pattern.matches("[0-9]$", "FirstKnight123"));		
		//System.out.println(Pattern.compile("[0-9]$").matcher("FirstKnight123").find());
		System.out.println(s.matches("Fir(.*)"));		
		System.out.println(s.matches("^[Fir]"));
		System.out.println(Pattern.compile("^[Fir]").matcher(s).find());
		System.out.println(Pattern.compile("Fir(.*)").matcher(s).find());
		
		
		 String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		  String pattern = zeroTo255 + "\\." + zeroTo255 + "\\."
		                 + zeroTo255 + "\\." + zeroTo255;
		  
		  
		
		
		
	}

}
