import java.util.Arrays;
import java.util.HashMap;

public class Hello {

	public static void main(String[] args) {
		String s;

		
		int[][] i = new int [1][3];
		 i[0][0]=10;
		 i[0][1]=20;
		 i[0][2]=30;
		 
		 System.out.println(Arrays.toString(i[0]));
		 System.out.println(Arrays.deepToString(i));
		 System.out.println(Arrays.binarySearch(i[0], 20));
		 System.out.println(Arrays.asList(i[0][0]));
		 //System.out.println(Arrays;asList(i[0][0]));
		 System.exit(0);
		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		int y = 7;
		System.out.println(y/2);
		
		double x = 3 + 2 * --y;
		double z = 10/3;
		System.out.println(x);
		System.out.println(z);
		System.out.println(10/3);

	}

}
