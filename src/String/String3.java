package String;
import java.util.Arrays;

public class String3 {

	public static void main(String[] args) {		
		sB();
		sLen();
		join();
		mutalble();

	}
	public static void sLen() {
		//String str= "aaaabbbbcccdddeeffffffff";
		String str= "aaabbc";
		Integer counter = 1;
		String result ="";
		char currentChar=0;
		char prevChar= 0;

		for(int i =0; i<str.length(); i++) {
			currentChar = str.charAt(i);
			if (prevChar == currentChar) {
				counter++;
//				if(i == str.length()-1)
//					result +=  counter.toString() + prevChar ;
			}else {
				
//				if ( str.length() == 1 || str.length()-1 == i) {
//					result +=  counter.toString() + currentChar;
//				}else 
				if(prevChar != 0) {
					result +=  counter.toString() + prevChar;
					counter=1;
				}
			}			
			prevChar = currentChar;
		}
		result +=  counter.toString() + prevChar;
		System.out.println(result);
	}
	
	public static void sB() {
		String str= "aaaabbbbcccdddeeffffffff";
		StringBuilder sb = new StringBuilder();
		char[] strChars= str.toCharArray();
		char prevChar=0;
		int counter=1;
		for (char c: strChars) {
			if(c == prevChar) {
				counter++;
			}else if (prevChar != 0) {
				sb.append(counter).append(prevChar);				
				counter=1;			
			}
			prevChar=c;
		}
		sb.append(counter).append(prevChar);
		System.out.println(sb);
		

	}
	
	public static void join() {		
String str = " Java  C++ php grovvy";
String[] languages = str.split("\\s+", 2);
System.out.println("output: " + Arrays.toString(languages));

	}
	public static void mutalble() {
		StringBuilder a = new StringBuilder("abc");
		StringBuilder b = a.append("de");
		b = b.append("f").append("g"); 
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		
		String a1 = new String("abc");
		String b1 = a1.concat("de");
		b1 = b1.concat("f").concat("g"); 
		System.out.println("a1=" + a1);
		System.out.println("b1=" + b1);
		
	
	}
}