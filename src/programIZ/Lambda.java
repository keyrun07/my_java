package programIZ;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		lambda1();
		// lambda2();

	}

	private static void lambda2() {
		// TODO Auto-generated method stub
		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>(Arrays.asList("java", "python"));
		System.out.println("ArrayList: " + languages);

		// call the foEach() method
		// pass lambda as argument fo forEach()
		// reverse each element of ArrayList
		System.out.print("Reversed ArrayList: ");
		languages.forEach((e) -> {

			// body of lambda expression
			String result = "";
			for (int i = e.length() - 1; i >= 0; i--)
				result += e.charAt(i);
			System.out.print(result + ", ");
		});

	}

	public static void lambda1() {
		// create an ArrayList
		ArrayList<String> languages = new ArrayList<>();

		// add elements to the ArrayList
		languages.add("java");
		languages.add("swift");
		languages.add("python");
		System.out.println("ArrayList: " + languages);

		// pass lambda expression as parameter to replaceAll() method
		// languages.replaceAll(e -> e.toUpperCase());
//		languages.forEach((e) -> {
//			e = e.toUpperCase();
//			System.out.println(e);
//		});

		System.out.println("Updated ArrayList: " + languages);

	}

}

