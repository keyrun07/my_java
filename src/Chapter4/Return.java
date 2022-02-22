package Chapter4;

public class Return {

	public static void main(String[] args) {
		System.out.println(walk4(4));
	}
	
	
	static String walk4(int a) {
		if (a == 4) 
			return "rr";
		return null; 
	}
	
	public void fly(int numMiles) { }
	public void fly(int s) { } // DOES NOT COMPILE
	

}
