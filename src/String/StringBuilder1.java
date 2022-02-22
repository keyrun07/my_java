package String;
import java.util.Arrays;

public class StringBuilder1 {

	public static void main(String[] args) {		

		reverse();

	}


	private Object append;

	
	public static void reverse() {
		StringBuilder sb = new StringBuilder();
		sb.append("bbb").append("aa").reverse(); //delete(4,3).deleteCharAt(4)
		System.out.println(sb);
	}
}