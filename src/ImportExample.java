import java.util.Random; // import tells us where to find Random


public class ImportExample {
	//java.util.Random r;
	public static void main(String[] args) {
		
		java.util.Random r = new java.util.Random();
		System.out.println(r.nextInt(10)); // print a number between 0 and 9
		Hello h = new Hello();
		h.main(args);
		
	}
}