
public class Operator {

	public static void main(String[] args) {	
		double a = 39.21;
		float b = 2.1f;
		
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);	
		
		byte c = (byte)13000;
		System.out.println(c);
	}
}
