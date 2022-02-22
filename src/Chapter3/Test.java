
package Chapter3;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

	int total = 0;
	StringBuilder letters = new StringBuilder("abcdefg");
	System.out.println(total);
	total += letters.substring(1, 2).length();
	System.out.println(total);
	total += letters.substring(6, 6).length();
	total += letters.substring(6, 5).length();
	System.out.println(total);
	
	StringBuilder numbers = new StringBuilder("0123456789");
	numbers.delete(2, 8);
	numbers.append("-").insert(2, "+");
	System.out.println(numbers);
		
	}
	

	
}
