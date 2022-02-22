package Chapter4;

public class Koala {
	public static int count = 0; // static variable

	public static void main(String[] args) { // static method
		count++;
		System.out.println("main:"+count);
		//anotherStatic();
		
	}
	public void nonStatic() { // non- static method
		
		System.out.println("Non-static method is called");
		
	}
	
public static void anotherStatic() { // non- static method
		
		System.out.println(" another static method is called");
		
	}

}

