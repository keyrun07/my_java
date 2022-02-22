public class Chick {
	
	int i;
	char c;
	String s;
	String s1, s2;
	String s3 = "yes", s4 = "no";
	static int MAX_LENGTH = 5;
	int length;
	
	
	private String name = "Fluffy";
	{
		System.out.println("setting field");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
		System.out.println("i:" +i);
		System.out.println("c:" +c);
		System.out.println("s:" +s);

		
	}

	public static void main(String[] args) {
		
		double annoyingButLegal = 1_00_0.00; // this one compiles
		//method1();
		System.out.println(017);
		System.out.println("hi");
		
		Chick chick = new Chick();
		System.out.println(chick.name);
		Chick chick2 = new Chick();
		System.out.println(chick2.name);
		System.out.println(0b100);
		System.out.println(annoyingButLegal);
		chick.grow(4);
		System.out.println(MAX_LENGTH);
		System.out.println(chick.length);
		System.out.print(13D / 3);

	}
	public void method1() {
		

	}
	public void grow(int inches) { 
		if (length < MAX_LENGTH) {
			int newSize = length + inches;
			//MAX_LENGTH=2;
			length = newSize; 
		}
	}
}

class Chick1 {
	public Chick1() {
		int i = Chick.MAX_LENGTH;
		int w2 = Chick.MAX_LENGTH;
	}
}