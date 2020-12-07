package com.regex.learnings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Java Regex
 * 
 * The Java Regex or Regular Expression is an API to define a pattern for
 * searching or manipulating strings.
 * 
 * It is widely used to define the constraint on strings such as password and
 * email validation. After learning Java regex tutorial, you will be able to
 * test your regular expressions by the Java Regex Tester Tool.
 * 
 * Java Regex API provides 1 interface and 3 classes in java.util.regex package.
 * 
 * The Matcher and Pattern classes provide the facility of Java regular
 * expression. The java.util.regex package provides following classes and
 * interfaces for regular expressions.
 * 
 * MatchResult interface
 * 
 * Matcher class: It implements the MatchResult interface. It is a regex engine
 * which is used to perform match operations on a character sequence.
 * 
 * Pattern class: It is the compiled version of a regular expression. It is used
 * to define a pattern for the regex engine.
 * 
 * PatternSyntaxException class
 */
public class RegexLearnings {

	public static void main(String[] args) {
		// Three ways to write the regex

		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);

		// The . (dot) represents a single character.
		System.out.println("Dot: " + Pattern.matches(".s", "as"));

		regexCharacterclasses();

		regexQuantifiers();

		regexMetacharacters();

		/*
		 * (?i) starts case-insensitive mode
		 * 
		 * (?-i) turns off case-insensitive mode
		 */
		System.out.println();
		System.out.println("case-sensitivity check: " + Pattern.matches("(?i)te(?-i)st", "TEst"));
		System.out.println("case-sensitivity check: " + Pattern.matches("(?i)te(?-i)st", "teST"));

	}

	/**
	 * Regex Character classes:-
	 * 
	 * [abc] :: a, b, or c
	 * 
	 * [^abc] :: Any character except a, b, or c (negation)
	 * 
	 * [a-zA-Z] :: a through z or A through Z, inclusive (range)
	 * 
	 * [a-d[m-p]] :: a through d, or m through p :: [a-dm-p] (union)
	 * 
	 * [a-z&&[def]] :: d, e, or f (intersection)
	 * 
	 * [a-z&&[^bc]] :: a through z, except for b and c :: [ad-z] (subtraction)
	 * 
	 * [a-z&&[^m-p]] :: a through z, and not m through p :: [a-lq-z](subtraction)
	 */
	private static void regexCharacterclasses() {
		System.out.println();
		System.out.println("Regex Character classes:-");
		System.out.println(Pattern.matches("[amn]", "abcd"));// false (not a or m or n)
		System.out.println(Pattern.matches("[amn]", "a"));// true (among a or m or n)
		System.out.println(Pattern.matches("[amn]", "ammmna"));// false (m and a comes more than once)
	}

	/**
	 * Regex Quantifiers:-
	 * 
	 * X? X occurs once or not at all
	 * 
	 * X+ X occurs once or more times
	 * 
	 * X* X occurs zero or more times
	 * 
	 * X{n} X occurs n times only
	 * 
	 * X{n,} X occurs n or more times
	 * 
	 * X{y,z} X occurs at least y times but less than z times
	 */
	private static void regexQuantifiers() {
		System.out.println();
		System.out.println("? quantifier:-");
		System.out.println(Pattern.matches("[amn]?", "a"));// true (a or m or n comes one time)
		System.out.println(Pattern.matches("[amn]?", "aaa"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aammmnn"));// false (a m and n comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "aazzta"));// false (a comes more than one time)
		System.out.println(Pattern.matches("[amn]?", "am"));// false (a or m or n must come one time)

		System.out.println();
		System.out.println("+ quantifier:-");
		System.out.println(Pattern.matches("[amn]+", "a"));// true (a or m or n once or more times)
		System.out.println(Pattern.matches("[amn]+", "aaa"));// true (a comes more than one time)
		System.out.println(Pattern.matches("[amn]+", "aammmnn"));// true (a or m or n comes more than once)
		System.out.println(Pattern.matches("[amn]+", "aazzta"));// false (z and t are not matching pattern)

		System.out.println();
		System.out.println("* quantifier:-");
		System.out.println(Pattern.matches("[amn]*", "ammmna"));// true (a or m or n may come zero or more times)

		System.out.println();
		System.out.println("X{n} quantifier:-");
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));// false (more than 6 char)
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));// true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));// false ($ is not matched)
	}

	/**
	 * Regex Metacharacters
	 * 
	 * The regular expression metacharacters work as shortcodes.
	 * 
	 * . Any character (may or may not match terminator)
	 * 
	 * \d Any digits, short of [0-9]
	 * 
	 * \D Any non-digit, short for [^0-9]
	 * 
	 * \s Any whitespace character, short for [\t\n\x0B\f\r]
	 * 
	 * \S Any non-whitespace character, short for [^\s]
	 * 
	 * \w Any word character, short for [a-zA-Z_0-9]
	 * 
	 * \W Any non-word character, short for [^\w]
	 * 
	 * \b :: A word boundary. The metacharacter \b is an anchor.There are three
	 * different positions that qualify as word boundaries:
	 * 
	 * Before the first character in the string, if the first character is a word
	 * character. After the last character in the string, if the last character is a
	 * word character. Between two characters in the string, where one is a word
	 * character and the other is not a word character.
	 * 
	 * \B A non word boundary
	 */
	private static void regexMetacharacters() {
		System.out.println();
		System.out.println("Metacharacters:-");

		System.out.println();
		System.out.println("metacharacters d:-");// d means digit
		System.out.println(Pattern.matches("\\d", "abc"));// false (non-digit)
		System.out.println(Pattern.matches("\\d", "1"));// true (digit and comes once)
		System.out.println(Pattern.matches("\\d", "4443"));// false (digit but comes more than once)
		System.out.println(Pattern.matches("\\d", "323abc"));// false (digit and char)

		System.out.println();
		System.out.println("metacharacters D:-");// D means non-digit
		System.out.println(Pattern.matches("\\D", "abc"));// false (non-digit but comes more than once)
		System.out.println(Pattern.matches("\\D", "1"));// false (digit)
		System.out.println(Pattern.matches("\\D", "4443"));// false (digit)
		System.out.println(Pattern.matches("\\D", "323abc"));// false (digit and char)
		System.out.println(Pattern.matches("\\D", "m"));// true (non-digit and comes once)

		System.out.println();
		System.out.println("metacharacters D with quantifier:-");
		System.out.println(Pattern.matches("\\D*", "mak"));// true (non-digit and may come 0 or more times)

	}

}
