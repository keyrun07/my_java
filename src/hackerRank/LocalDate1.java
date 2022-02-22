package HackerRank;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDate1 {

	public LocalDate1() {
		// TODO Auto-generated constructor stub
		
		
	}
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 8, 14);
		LocalDate date1 = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek());
		
	}

}
