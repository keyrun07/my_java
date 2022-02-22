
package Chapter3;
//import java.lang.String;
import java.util.*;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3");
		System.out.println(s2);
		String string = "animals";
		System.out.println(string.substring(2,5));
		System.out.println(string.substring(1,5).substring(0,2));
		System.out.println(string.length());
		
		String[] birds = new String[6];
		System.out.println(birds.length);
		int[] numbers = new int[] {3,2,1};

		List<Integer> numbers1 = new ArrayList<>();
		numbers1.add(1);
		numbers1.add(5);
		numbers1.remove(new Integer(5));
		System.out.println(numbers1);
		
		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if ( a == "2cfalse") System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals");
	}
}
