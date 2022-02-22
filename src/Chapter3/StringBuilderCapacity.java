
package Chapter3;
import java.lang.StringBuilder;

public class StringBuilderCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder(5);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("anim");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("al");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		System.out.println("sb2");
		StringBuilder sb2 = new StringBuilder();
		System.out.println(sb2.capacity());
		System.out.println(sb.length());
		
		
		
		String x = "Hello World";
		String y = "Hello World";
		System.out.println(x == y);
	}
	

	
}
