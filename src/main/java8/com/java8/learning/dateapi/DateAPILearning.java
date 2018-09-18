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

public class DateAPILearning {
	public static void main(String[] args) {

		// Clock provides access to the current date and time.
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();

		// Instants can be used to create legacy java.util.Date objects.
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);

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

		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		LocalDate yesterday = tomorrow.minusDays(2);
		LocalDate independenceDay = LocalDate.of(2014, Month.JULY, 4);
		DayOfWeek dayOfWeek = independenceDay.getDayOfWeek();
		System.out.println(dayOfWeek); // FRIDAY

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
