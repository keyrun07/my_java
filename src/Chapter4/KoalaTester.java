package Chapter4;

public class KoalaTester {
	public static void main(String[] args) {
		Koala.main(new String[0]); // call static method
	
	
	
	
		Koala k = new Koala();
		System.out.println("1."+ k.count); // k is a Koala
		k = null;
		System.out.println("2."+k.count); // k is still a Koala
		Koala.main(new String[0]);
		Koala k2 = new Koala();
		System.out.println("3."+k2.count); // k is a Koala
		Koala.main(new String[0]);
		System.out.println("4."+k2.count); // k is a Koala
		Koala.main(new String[0]);
		k2.main(new String[0]);
		k.main(new String[0]);
		Koala.anotherStatic();
		//Koala.nonStatic();
	}

}
