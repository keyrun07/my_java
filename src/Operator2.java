import java.io.File;

public class Operator2 {

	public static void main(String[] args) {
		int dayOfWeek = 5;
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
		default:
			System.out.println("Weekday");
		case 6:
			System.out.println("Saturday");
			break;
		}
		Operator5();

	}

	public void Operator() {

		short x = 10;
		short y = 3;
		/// short z = x * y; // DOES NOT COMPILE
	}

	public void Operator1() {
		long x = 10;
		int y = 5;
		// y = y * x; // DOES NOT COMPILE

	}

	public void Operator3() {
		long x = 10;
		int y = 5;
		y *= x;

	}

	public void Operator4() {
		long x = 5;
		long y = (x = 3);
		System.out.println(x); // Outputs 3
		System.out.println(y); // Also, outputs 3
	}

	public static void Operator5() {
		int x = 6;
		boolean y = (x >= 6) || (x++ <= 7);
		System.out.println(x);
		
		// boolean x = 3 == true; // DOES NOT COMPILE
		// boolean y = false != "Giraffe"; // DOES NOT COMPILE
		// boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE

	}
}
