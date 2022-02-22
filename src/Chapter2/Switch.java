package Chapter2;

public class Switch {

	public Switch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int dayOfWeek = 20; 
		switch(dayOfWeek) {
		case 0: 
			System.out.println("Sunday");
			//break;

		//	break;
		case 6:			
			System.out.println("Saturday"); 
		//	break;
		default: 
			System.out.println("Weekday");
		case 3: 
			System.out.println("Tuesday");
			break;
		case 1: 
			System.out.println("Monday");
		//	break;
			
		}
		String myname ="Kiran";
		switch(myname) {
		//case 'K':
		case "K":
			System.out.println("Yes, K");
			break;
		case "Kiran":
			System.out.println("Yes, Kiran");
			break;
			
		}
	}

}
