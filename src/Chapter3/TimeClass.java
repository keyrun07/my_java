package Chapter3;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.Date;

public class TimeClass {
	public static void main(String args[]) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE

		Date d = new Date();
		
		
		
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		date = date. plusDays(2);
		System.out.println(date); // 2014-01-22
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28
		
		System.out.println(date.getDayOfWeek());
		LocalTime time = LocalTime.of(11, 12, 34);
		System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
		
		LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d1 = d1.minus(p);
		//DateTimeFormatter f = DateTimeFormatter(FormatStyle.SHORT);
		//System.out.println(d1.format(f));
	}
}
