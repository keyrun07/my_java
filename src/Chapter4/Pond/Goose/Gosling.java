package Chapter4.Pond.Goose;

import Chapter4.Pond.Shore.Bird; // in a different package

public class Gosling extends Bird { // extends means create subclass
	public void swim() {
		floatInWater(); // calling protected member
		System.out.println(text); // calling protected member
	}
	public static void main(String[] arg) {
		//floatInWater();
	}
}