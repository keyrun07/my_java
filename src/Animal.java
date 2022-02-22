
public class Animal {
	static String name;

	public String getName() {
		return name;
	}

	public static void setName(String newName) {
		name = newName;
	}
	public static void main(String[] args) {
		
		String s = "abc";
		s.length();
		

		Animal a1 = new Animal();
		Animal.setName("kiran1");
		Animal a2 = new Animal();
		a2.name ="kiran2";

		setName("kiran");
		System.out.println(name);
		
		System.out.println(a1.name);
		System.out.println(a2.name);
		
	}
}