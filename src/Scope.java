
public class Scope {

	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		two ="c";
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

}
