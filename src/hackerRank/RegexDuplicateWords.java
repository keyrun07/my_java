package hackerRank;

import java.util.*;
import java.util.regex.*;

public class RegexDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		Scanner in = new Scanner(System.in);
		int numSentences = Integer.parseInt(in.nextLine());

		while (numSentences-- > 0) {
			String input = in.nextLine();

			Matcher m = p.matcher(input);

			// Check for subsequences of input that match the compiled pattern
			while (m.find()) {
				System.out.println("m.group(): " + m.group());
				System.out.println("m.group(1): " + m.group(1));
				System.out.println("---------------");
				input = input.replaceAll(m.group(), m.group(1));
			}

			// Prints the modified sentence.
			System.out.println(input);
		}

		in.close();
	}
}
