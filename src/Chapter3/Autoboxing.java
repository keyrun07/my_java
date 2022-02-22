package Chapter3;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Autoboxing {
	public static void main(String args[]) {
		List<Double> weights = new ArrayList<>();
		weights.add(50.5); // [50.5]
		weights.add(new Double(60)); // [50.5, 60.0]
		weights.remove(50.5); // [60.0]
		double first = weights.get(0); // 60.0	
		
		System.out.println(weights);
		System.out.println(weights.get(0));

		System.out.println("===========");
		
		List<Integer> numbers = new ArrayList<>(); 
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		numbers.remove(1); 
		System.out.println(numbers);
		numbers.remove(new Integer(30)); 
		System.out.println(numbers);
		
		System.out.println("1111111111111111");
		
		List<String> st = new ArrayList<>(); 
		st.add("D");
		st.add("B");
		st.add("A");
		st.add("C");
		//Arrays.sort(st);
		
		System.out.println(st);
		Collections.sort(st);
		System.out.println(st);
		st.remove(1); 
		System.out.println(st);
		st.remove(new String("C")); 
		System.out.println(st);
		
		System.out.println("22222222222222");
		
		List<Integer> numbers2 = new ArrayList<>(); 
		numbers2.add(99);
		numbers2.add(5);
		numbers2.add(81); 
		Collections.sort(numbers2);
		System.out.println(numbers2); //[5, 81, 99]

	}
}
