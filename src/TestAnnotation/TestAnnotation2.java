package TestAnnotation;

import java.util.*;

class TestAnnotation2 {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");
		list.add(4);

		for (Object obj : list)
			System.out.println(obj);

	}
}
