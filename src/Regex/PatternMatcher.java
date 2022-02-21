/**
 * 
 */
package Regex;

import java.util.*;
import java.util.regex.*;

/**
 * @author kawal
 *
 */
public class PatternMatcher {

	/**
	 * 
	 */
	public PatternMatcher() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//regex1();
		//regex2();
		//regex3LookingAt();
		regex4DuplicateWords();
		
	

	}

	public static void regex1() {
		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3Schools! w3schools again w3schOOls");
		boolean matchFound = matcher.find();
		System.out.println(matcher.group());
		// System.out.println(matcher.group(1));
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}

	public static void regex2() {

		// String to be scanned to find the pattern.
		String line = "This order QT3000! OK? was placed for QT3000! OK?";
		// String pattern = "(.*)(\\d+)(0{2,5})(.*)";
		String pattern = "(.*)([\\A])(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		if (m.find()) {
			System.out.println("Group Count: " + m.groupCount());
			System.out.println("Found value 0: " + m.group(0));
			System.out.println("Found value 1: " + m.group(1));
			System.out.println("Found value 2: " + m.group(2));
			System.out.println("Found value 3: " + m.group(3));
			// System.out.println("Found value 4: " + m.group(4) );
		} else {
			System.out.println("NO MATCH");
		}
	}

	public static void regex3LookingAt() {
		String REGEX = "FOO";
		String INPUT = "fooooooooooooooooo";
		Pattern pattern;
		Matcher matcher;

		pattern = Pattern.compile(REGEX, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(INPUT);

		System.out.println("Current REGEX is: " + REGEX);
		System.out.println("Current INPUT is: " + INPUT);

		//matcher.toString();
		System.out.println("lookingAt(): " + matcher.lookingAt());
		System.out.println("INPUT: " + INPUT);
		System.out.println("matches(): " + matcher.matches());
		System.out.println("INPUT: " + INPUT);

	}
	
	public static void regex4DuplicateWords() {
                
        String regex = "\\b(\\w+)(?:\\w+\\1\\b)+";
		//String regex = "(\\w+)(the)+";
        
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
            	System.out.println("m.group(): "+m.group());
            	System.out.println("m.group(1): "+m.group(1));
                input = input.replaceAll(m.group(), m.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
		
		
		
	}

}
