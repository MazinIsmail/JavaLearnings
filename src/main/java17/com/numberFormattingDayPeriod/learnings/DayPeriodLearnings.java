package com.numberFormattingDayPeriod.learnings;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * A new pattern B is added for formatting a DateTime which indicates a day
 * period according to the Unicode standard.
 */
public class DayPeriodLearnings {
	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("B");
		System.out.println(dtf.format(LocalTime.of(8, 0)));
		System.out.println(dtf.format(LocalTime.of(13, 0)));
		System.out.println(dtf.format(LocalTime.of(20, 0)));
		System.out.println(dtf.format(LocalTime.of(23, 0)));
		System.out.println(dtf.format(LocalTime.of(0, 0)));

		System.out.println();
		dtf = DateTimeFormatter.ofPattern("B").withLocale(Locale.forLanguageTag("NL"));
		System.out.println(dtf.format(LocalTime.of(8, 0)));
		System.out.println(dtf.format(LocalTime.of(13, 0)));
		System.out.println(dtf.format(LocalTime.of(20, 0)));
		System.out.println(dtf.format(LocalTime.of(0, 0)));
		System.out.println(dtf.format(LocalTime.of(1, 0)));
	}
}
