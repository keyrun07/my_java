package Regex;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.regex.*;

public class Pattern2 {
	
		

	   private static final String REGEX = "\\\\u[a-fA-F0-9]{4}";
	   private static final String INPUT = "cat cat tie cat Title \\u2122, \\u2122, 	\\u2265  test \\uaaae ";

	   public static void main( String args[] ) {

		   String str ="ABCtr™tr©®Œ*#";
		   String newStr = "";

			int len = str.length();
			for (int i = 0; i < len; i++) {			
				char c = str.charAt(i);
				int in = (int)c;
				
				System.out.println(c);
				System.out.println(in);
				System.out.println("\\u"+ String.format("%4s", Integer.toHexString(in)).replace(' ', '0'));
				System.out.println("");
				
				
				if(in<=255) {
					newStr += c;
				}else {
					//newStr += "\\u"+ String.format("%04d", Integer.toHexString(in));
					newStr += "\\u"+ String.format("%-4s", "ss");
				}
				
			}
		      
		   System.out.println(newStr);
//			byte[] arr;
//			try {
//				arr = str.getBytes("UTF-8");
//				str ="";
//				 for(byte a: arr) {
//			         System.out.println(a + " ");
//			         if (a>100) {
//			        	 str += (char)a;
//			         }
//			      }
//				 System.out.println(str);
//				
//			} catch (UnsupportedEncodingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
	   }
}
