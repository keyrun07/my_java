package Chapter3;

public class StringBuffer1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuilder was added to Java in Java 5. If you come across older code, 
		// you will see StringBuffer used for this purpose. 
		// StringBuffer does the same thing but more slowly because it is thread safe.
		
		StringBuffer stringBuffer = new StringBuffer("Hello World");
		System.out.println(stringBuffer.capacity());
		
		
		StringBuffer sb3 = new StringBuffer("Hello World");
		
		String s = sb3.substring(1, 5);
		sb3.insert(7, "-").insert(0, "-").insert(4, "-"); // sb = -ani-mals
		System.out.println(sb3);
		System.out.println(s);

	}

}
