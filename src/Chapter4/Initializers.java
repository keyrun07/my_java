package Chapter4;

import java.util.ArrayList;

public class Initializers {

	private static final int NUM_BUCKETS = 45;
	private static final ArrayList<String> values = new ArrayList<>();


	public static void main(String[] args) {
	//	NUM_BUCKETS = 5; // DOES NOT COMPILE
		
		values.add("changed");
		
		Initializers i = new Initializers();
		i.method1();
		System.out.println(values);

	}
	public void method1() {

		values.add("changed1");
		System.out.println(values);

	}

}
