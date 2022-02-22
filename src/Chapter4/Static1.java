package Chapter4;

public class Static1 {


	public static void main(String[] args) { 
		String name = "String - Name";
		StringBuilder s = new StringBuilder();
		speak(name, s);
		System.out.println(name);
		System.out.println(s);
	}
	
	public static void speak(String name, StringBuilder s) {
		name = "Sparky";
		s.append("Speak - Webby");
	}

}
