package Chapter3;

public class StringEquality {

	public StringEquality() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String a = "Kiran";
		String b = "Kiran";
		String c = "Kir";
		c.concat("an");
		if (a==b) System.out.println("a and b ==");
		if (a.equals(b)) System.out.println("a and b equal");
		if (b==c) System.out.println("b and c ==");
		if (b.equals(c)) System.out.println("b and c equal");
		System.out.println("----------");
		if (a==b) System.out.println("a and b ==");
		if (a.equals(b)) System.out.println("a and b equal");
		if ("Kiran"==c) System.out.println("b and c ==");
		if (b.equals("Kiran")) System.out.println("b and c equal");
		// TODO Auto-generated method stub

	}

}
