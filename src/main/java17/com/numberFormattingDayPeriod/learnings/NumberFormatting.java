package com.numberFormattingDayPeriod.learnings;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A factory method is added to NumberFormat in order to format numbers in
 * compact, human-readable form according to the Unicode standard.
 */
public class NumberFormatting {

	public static void main(String[] args) {
		NumberFormat fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.SHORT);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));

		System.out.println();
		fmt = NumberFormat.getCompactNumberInstance(Locale.ENGLISH, NumberFormat.Style.LONG);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));

		System.out.println();
		fmt = NumberFormat.getCompactNumberInstance(Locale.forLanguageTag("NL"), NumberFormat.Style.LONG);
		System.out.println(fmt.format(1000));
		System.out.println(fmt.format(100000));
		System.out.println(fmt.format(1000000));

	}

}
