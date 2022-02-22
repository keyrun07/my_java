import java.time.*; // import time classes 
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LocalDate.now()); //2015-01-20
		System.out.println(LocalTime.now()); //12:45:18.401 
		System.out.println(LocalDateTime.now()); //2015-01-20T12:45:18.401 


		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date.plusDays(2);
		
		LocalDateTime dateTime = LocalDateTime.of(2014,4, 20,13, 34, 54);
		System.out.println(dateTime); // 2014-01-20
		
//	Period period = Period.ofDays(1);
//	while (upTo.isBefore(end)) {
//	System.out.println("give new toy: " + upTo);
//	upTo = upTo.plus(period); // adds the period }}
}

}
