
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		default:
		System.out.println("Weekday");
		break;
		case 0:
		System.out.println("Sunday");
		//break;
		case 6:
		System.out.println("Saturday");
		//break;
		
		case 51:
			System.out.println("Thursday");
			break;
		}
		
		System.out.println(java.time.DayOfWeek.SATURDAY);
		
		
		
		int x = 0;
		while(x++ < 10) {System.out.println(x);}
		System.out.println(x);


	}

}
