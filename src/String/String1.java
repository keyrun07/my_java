package String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace();
		ReplaceImmutable();


	}

	private static void ReplaceImmutable() {
		// TODO Auto-generated method stub
		String result = "AniMaL1 ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
	}

	private static void Replace() {
		// TODO Auto-generated method stub
		java.lang.String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
		
	}


}
