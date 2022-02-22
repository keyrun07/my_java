package Chapter3;
import java.util.List;
import java.util.ArrayList;

public class Wrapper {
	public static void main(String args[]) {

		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");		
		
		
		System.out.println(primitive);
		System.out.println(wrapper);
		
		//int bad1 = Integer.parseInt("a1"); // throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException

	}
}
