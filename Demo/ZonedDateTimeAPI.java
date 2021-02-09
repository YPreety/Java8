package Demo;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Zoned date-time API is to be used when time zone is to be considered. Let us see them in action.
public class ZonedDateTimeAPI {

	public static void main(String[] args) {
		ZonedDateTimeAPI java8tester = new ZonedDateTimeAPI();
		java8tester.testZonedDateTime();
	}

	public void testZonedDateTime() {
		// Get the current date and time
		ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
		System.out.println("date1: " + date1);

		ZoneId id = ZoneId.of("Europe/Paris");
		System.out.println("ZoneId: " + id);

		ZoneId currentZone = ZoneId.systemDefault();
		System.out.println("CurrentZone: " + currentZone);
	}

}
