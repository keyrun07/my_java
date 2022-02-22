
public class LocalVariable {

	public static void main(String... $n) {
		LocalVariable a = new LocalVariable();
		a.findAnswer(true);
		
		Mouse m = new Mouse();
		m.grow(2);
		System.out.println("Mouse Length: " + m.length);
		//System.out.println("Mouse Length: " + m.MAX_LENGTH);
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
			onlyOneBranch = 2;
		}
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE
	}
}

class Mouse{
	static int MAX_LENGTH = 5;
	int length;

	public void grow(int inches) {
		String s = "ABC";
		s.trim().substring(1, 2).concat(str).
		if (length < MAX_LENGTH) {
			length =1;
			int newSize = length + inches;
			MAX_LENGTH = newSize;
			length = newSize;
		}
	}
}