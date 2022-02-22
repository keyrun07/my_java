
public class OperatorsAndStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test8();
		//Test10();
		//Test11();
		//Test14();
		//Test15();
		//Test16();
		//Test18();
		//Test19();
		Test20();

	}

	private static void Test20() {
		// TODO Auto-generated method stub
	final char a = 'A', d = 'D';
	 char grade = 'B';
	switch(grade) {
	case a:
	case 'C': System.out.print("great");
	case 'B': System.out.print("good"); break;
	case d:
	case 'F': System.out.print("not good");
	}
		
	}

	private static void Test19() {
		// TODO Auto-generated method stub
		int m = 9, n = 1, x = 0;
		while(m > n) {
			m--;
			n += 2;
			x += m + n;
		}
		System.out.println(x);
		
	}

	private static void Test18() {
		// TODO Auto-generated method stub
		int count = 0;
		ROW_LOOP: for(int row = 1; row <=3; row++)
			for(int col = 1; col <=2 ; col++) {
				if(row * col % 2 == 0) continue ROW_LOOP;
					count++;
			}
		System.out.println(count);
		
	}

	private static void Test16() {
		// TODO Auto-generated method stub
		do {
			int y = 1;
			y++;
			System.out.print(y + " ");
			} while( y <= 10);
		
	}

	private static void Test15() {
		// TODO Auto-generated method stub
		int x = 1, y = 15;
		while (x < 10) {
		y--;
		x++;
		}
		System.out.println(x+", "+y);
		
	}

	private static void Test14() {
		// TODO Auto-generated method stub
		int c = 7;
		int result = 4;
		result += ++c;
		System.out.println(result);
		
	}

	private static void Test11() {
		// TODO Auto-generated method stub
		int x = 5 * 4 % 3;
		System.out.println(x);
		
	}

	private static void Test10() {
	 byte a = 4, b = 5;
	byte sum = (byte) a + b;
	System.out.println(sum);		
	}

	private static void Test8() {
		// TODO Auto-generated method stub
		boolean x = true, z = true;
		int y = 20;
		x = (y != 10) ^ (z=false);
		System.out.println(x+", "+y+", "+z);
	}

}
