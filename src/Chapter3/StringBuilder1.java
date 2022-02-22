
package Chapter3;
//import java.lang.StringBuilder;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha = "";
		alpha += false;

		for(char current = 'B'; current <= 'z'; current++) {
			alpha += current;
		}
		
		System.out.println(alpha);
		System.out.println(alpha.substring(1, 2));
		
	}

	public void append(String string) {
		// TODO Auto-generated method stub
		
	}
}
