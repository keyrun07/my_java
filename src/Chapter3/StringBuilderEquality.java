
package Chapter3;
import java.lang.StringBuilder;

public class StringBuilderEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		System.out.println("1"+one.equals(two)); // false
		System.out.println("2"+one.toString() == two.toString()); // false
		System.out.println("3"+one.toString().equals(two.toString())); // true
		System.out.println("4"+one.equals(two)); // false
		StringBuilder three = one.append("a");
		System.out.println(one == two); // false
		System.out.println(one == three); // true
		
		three.append("b");
		
		System.out.println(one.toString());
		System.out.println(three.toString());
		System.out.println(one == three);
		
		System.out.println("111111111111");
		
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(x == z); // false
		
		System.out.println("2222222222222");
		
		
		String a = new String("Hello World");
		String b = "Hello World";
		System.out.println(a == b); // false
		
		System.out.println("3333333333333333");
		
		String c = "Hello World";
		String d = " Hello World".trim();
		System.out.println(c.equals(d)); // true
		
		System.out.println("444444444444");
		
	}
	

	
}
