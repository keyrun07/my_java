package String;

public class StringImmutable {

	public static void main(String[] args) {
		String s1 = "AN1";
		String s2 = s1.concat("2"); 
		s2.toLowerCase();
		System.out.println(s2);
		System.out.println(s2.concat("2"));
	}
}
