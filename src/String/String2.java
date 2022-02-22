package String;
import java.io.File;
import java.util.*;

public class String2 {

	public static void main(String[] args) {
		String x = "ABC";
		String y = "ABC";
		String z = x;
		System.out.println(x == y); // Outputs false 
		System.out.println(x == z); // Outputs true
		
		

		File x1 = new File("myFile.txt");
		File y1 = new File("myFile.txt");
		File z1 = x1;
		System.out.println(x1 == y1); // Outputs false S
		System.out.println(x1 == z1); // Outputs true
		
		
		final String[] names = new String[3];	
		names[0] = "Lisa";
		names[1] = "Kevin";
		names[2] = "Roger";
		for(String name : names) {
			System.out.print(name + ", ");
		}

		

	//	List<String> values = new ArrayList<String>();
		List<String> values = new ArrayList<String>();

		values.add("Lisa");
		values.add("Kevin");
		values.add("Roger");
		for(String value : values) {
			System.out.print(value + ", ");
		}
	}
}
