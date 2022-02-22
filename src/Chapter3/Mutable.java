package Chapter3;

public class Mutable {

	public Mutable() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "1";
		String s2 = s1.concat("2"); 
		s2.concat("3"); 
		
		System.out.println(s2);
		
		s2 = s2.concat("4"); 
		System.out.println(s2);

	}

}
