package hackerRank;

import java.util.Scanner;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHtmlTag {

	public RegexHtmlTag() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer in = new Integer(5);
		

        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        
        while (testCases-- > 0) {
            String line = scan.nextLine();
            
            boolean matchFound = false;
            //Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                
            	System.out.println(m.group());
            	System.out.println(m.group(0));
            	System.out.println(m.group(1));
            	
            	System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
	}
	private static int findSum(List<List<Integer>> al, int r, int c) {
		int max = Integer. MIN_VALUE;
		Integer arr[][] = new Integer[6][6];
         for (int i =0; i< al.size(); i++){
        	 Integer[] al2 = al.su toArray(al2);
        	 arr[i] =al2;        	 
         }
           
            
        int sum = arr[r+0][c+0] + arr[r+0][c+1] + arr[r+0][c+2]
                                + arr[r+1][c+1] + 
                  arr[r+2][c+0] + arr[r+2][c+1] + arr[r+2][c+2];
        return sum;
    }
}

}
