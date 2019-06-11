package com.java8.learning.dateapi;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Set;

/**
 * Java language provides direct support for Language based objects. Java 8
 * contained new API based on Immutable value classes which are Thread safe. The
 * base package is java.time Local : Simplified date-time API with no complexity
 * of timezone handling. Zoned : Specialized date-time API to deal with various
 * timezones.
 */
public class DateAPILearning {
	public static void main(String[] args) {

		// LocalDate is an Immutable class and Thread-Safe. Default format is
		// yyyy-MM-dd. It shows only Date
		// now() method to get Current Date alone
		LocalDate today = LocalDate.now();
		System.out.println("Current Date : " + today);

		// It allows to provide input arguments for Year, Month and Date
		LocalDate independenceDay = LocalDate.of(2014, Month.AUGUST, 15);
		System.out.println("Independance day : " + independenceDay);

		/**
		 * Exception in thread "main" java.time.DateTimeException: Invalid date
		 * 'FEBRUARY 30' at java.time.LocalDate.create(LocalDate.java:431) at
		 * java.time.LocalDate.of(LocalDate.java:249) at
		 * com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:32)
		 */
		 //LocalDate febDay = LocalDate.of(2014, Month.FEBRUARY, 30);
		// System.out.println("Independance day : " + febDay);

		// LocalDate of specific Zone
		LocalDate specificZoneDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Specific Zone Date : " + specificZoneDate);

		// LocalTime is also an immutable class and Thread-safe. It shows only the
		// time(no date). It's default format is hh:mm:ss.zzz
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Local Time : " + currentTime);

		// Creating LocalTime by providing input arguments
		// arguments provided is hh, mm, ss, ms
		LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
		System.out.println("Specific Time of Day=" + specificTime);

		/**
		 * Exception in thread "main" java.time.DateTimeException: Invalid value for
		 * HourOfDay (valid values 0 - 23): 25 at
		 * java.time.temporal.ValueRange.checkValidValue(ValueRange.java:311) at
		 * java.time.temporal.ChronoField.checkValidValue(ChronoField.java:703) at
		 * java.time.LocalTime.of(LocalTime.java:296) at
		 * com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:56)
		 */
		/**
		 * Exception in thread "main" java.time.DateTimeException: Invalid value for
		 * MinuteOfHour (valid values 0 - 59): 61 at
		 * java.time.temporal.ValueRange.checkValidValue(ValueRange.java:311) at
		 * java.time.temporal.ChronoField.checkValidValue(ChronoField.java:703) at
		 * java.time.LocalTime.of(LocalTime.java:300) at
		 * com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:65)
		 */
		LocalTime invalidTime = LocalTime.of(23, 25);
		System.out.println("Invalid time : " + invalidTime);

		// LocalTime of specific Zone
		LocalTime specificZoneTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Specific Zone Time : " + specificZoneTime);

		// LocalDateTime is an immutable date-time object that represents date-time
		// It's default format is yyyy-MM-dd-HH-mm-ss.zzz
		// Current DateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current DateTime : " + currentDateTime);

		// Current DateTime using LocalDate and LocalTime
		currentDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime using LocalDate and LocalTime : " + currentDateTime);

		// Creating LocalDateTime by providing input arguments
		LocalDateTime localDateTimeSpecific = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
		System.out.println("LocalDateTime Specific Date Time : " + localDateTimeSpecific);

		// Try creating date by providing invalid inputs for Date/Time
		/**
		 * Exception in thread "main" java.time.DateTimeException: Invalid date
		 * 'FEBRUARY 30' at java.time.LocalDate.create(LocalDate.java:431) at
		 * java.time.LocalDate.of(LocalDate.java:249) at
		 * java.time.LocalDateTime.of(LocalDateTime.java:261) at
		 * com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:91)
		 */
		/**
		 * Exception in thread "main" java.time.DateTimeException: Invalid value for
		 * HourOfDay (valid values 0 - 23): 26 at
		 * java.time.temporal.ValueRange.checkValidValue(ValueRange.java:311) at
		 * java.time.temporal.ChronoField.checkValidValue(ChronoField.java:703) at
		 * java.time.LocalTime.of(LocalTime.java:317) at
		 * java.time.LocalDateTime.of(LocalDateTime.java:262) at
		 * com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:99)
		 */
		// LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 25, 26, 1,
		// 1);
		// System.out.println("Invalid DateTime Format : " + feb29_2014);

		// LocalDateTime Specific Zone
		/**
		 * Exception in thread "main" java.time.zone.ZoneRulesException: Unknown
		 * time-zone ID: Asia/Mumbai at
		 * java.time.zone.ZoneRulesProvider.getProvider(ZoneRulesProvider.java:272) at
		 * java.time.zone.ZoneRulesProvider.getRules(ZoneRulesProvider.java:227) at
		 * java.time.ZoneRegion.ofId(ZoneRegion.java:120) at
		 * java.time.ZoneId.of(ZoneId.java:411) at java.time.ZoneId.of(ZoneId.java:359)
		 * at com.java8.learning.dateapi.DateAPILearning.main(DateAPILearning.java:120)
		 */
		// LocalDateTime specificZoneDateTime =
		// LocalDateTime.now(ZoneId.of("Asia/Chennai"));
		// System.out.println("Specific Zone Date Time : " + specificZoneDateTime);

		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		System.out.println("Tomorrow : " + tomorrow);
		LocalDate yesterday = tomorrow.minusDays(2);
		System.out.println("Yesterday : " + yesterday);

		DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
		System.out.println(dayOfWeek); // FRIDAY

		// Clock provides access to the current date and time.
		Clock clock = Clock.systemDefaultZone();
		System.out.println("Clock : " + clock);
		long millis = clock.millis();
		System.out.println("millis : " + millis);

		// Instants can be used to create legacy java.util.Date objects.
		Instant instant = clock.instant();
		System.out.println("Instant : " + instant);
		Date legacyDate = Date.from(instant);
		System.out.println("Legacy Date : " + legacyDate);

		// Timezones are represented by a ZoneId.
		System.out.println(ZoneId.getAvailableZoneIds());
		// prints all available timezone ids

		ZoneId zone1 = ZoneId.of("Europe/Berlin");
		ZoneId zone2 = ZoneId.of("Brazil/East");
		System.out.println(zone1.getRules());
		System.out.println(zone2.getRules());

		// LocalTime represents a time without a timezone
		LocalTime now1 = LocalTime.now(zone1);
		LocalTime now2 = LocalTime.now(zone2);

		System.out.println(now1.isBefore(now2)); // false

		long hoursBetween = ChronoUnit.HOURS.between(now1, now2);
		long minutesBetween = ChronoUnit.MINUTES.between(now1, now2);

		System.out.println(hoursBetween); // -3
		System.out.println(minutesBetween); // -239

		LocalTime late = LocalTime.of(23, 59, 59);
		System.out.println(late); // 23:59:59
		DateTimeFormatter germanFormatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
				.withLocale(Locale.GERMAN);
		LocalTime leetTime = LocalTime.parse("13:37", germanFormatter);
		System.out.println(leetTime); // 13:37

		LocalDateTime sylvester = LocalDateTime.of(2014, Month.DECEMBER, 31, 23, 59, 59);
		DayOfWeek dayOfWeek1 = sylvester.getDayOfWeek();
		System.out.println(dayOfWeek1); // WEDNESDAY
		Month month = sylvester.getMonth();
		System.out.println(month); // DECEMBER
		long minuteOfDay = sylvester.getLong(ChronoField.MINUTE_OF_DAY);
		System.out.println(minuteOfDay); // 1439

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy - HH:mm");

		LocalDateTime parsed = LocalDateTime.parse("Nov 03, 2014 - 07:13", formatter);
		String string = formatter.format(parsed);
		System.out.println(string); // Nov 03, 2014 - 07:13

		System.out.println();
		System.out.println("ZonedDateTime");
		ZonedDateTime nowZonedDateTime = ZonedDateTime.now(); // 2018-05-02T15:45:20.981-04:00[America/New_York]
		System.out.println("nowZonedDateTime: " + nowZonedDateTime);

		ZonedDateTime nowInParis = ZonedDateTime.now(ZoneId.of("Europe/Paris")); // 2018-05-02T21:45:20.982+02:00[Europe/Paris]
		System.out.println("nowInParis: " + nowInParis);

		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		System.out.println("zoneIds: " + zoneIds);

		ZonedDateTime departureTime = ZonedDateTime.parse("2018-07-01T10:00:00Z[America/New_York]");
		ZonedDateTime arrivalTime = ZonedDateTime.parse("2018-07-01T22:00:00Z[Europe/London]");
		System.out.println("departureTime: " + departureTime);
		System.out.println("arrivalTime: " + arrivalTime);

		System.out.println();
		System.out.println("Convert LocalDateTime to ZonedDateTime");
		LocalDateTime ldt = LocalDateTime.parse("2018-07-01T08:00");
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zdt = ZonedDateTime.of(ldt, zoneId); // 2018-07-01T08:00+02:00[Europe/Paris]
		System.out.println("zdt: " + zdt);
	}
}
