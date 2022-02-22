package Chapter3;

public class StringPool {

	public StringPool() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pool = "Fluffy";
		String noPool = new String("Fluffy");
		System.out.println(pool.length()); // 7
		System.out.println(noPool.length()); // 7
		
		System.out.println(pool.charAt(0)); // a 
		System.out.println(noPool.charAt(4)); // s
		
		System.out.println("=====================");
		
		String string = "animals"; 
		System.out.println(string.indexOf('a')); 
		System.out.println(string.indexOf("al")); 
		System.out.println(string.indexOf('a', 4)); 
		System.out.println(string.indexOf("al", 5));
		// 0 // 4 // 4 // -1

		System.out.println("=====================");
		
		String string2 = "animals"; 
		System.out.println(string2.substring(3)); // mals 
		System.out.println(string2.substring(string.indexOf('m'))); // mals 
		System.out.println(string2.substring(3, 4)); // m 
		System.out.println(string2.substring(3, 7)); // mals
		
		System.out.println("=====================");
		
		String start = "a AniMaL ";
		String trimmed = start.trim(); // "AniMaL"
		String lowercase = trimmed.toLowerCase(); // "animal" 
		String result = lowercase.replace('a', 'A'); // "Animal" 
		System.out.println(result);

	}

}
