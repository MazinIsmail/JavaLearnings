package com.java9.newVersionStringScheme;

/**
 * Version-String Scheme
 * 
 * Java version-string is a format that contains version specific information.
 * This version-string consists of major, minor, security and patch update
 * releases.
 * 
 * In Java 9, a new version-string scheme is introduced that looks like the
 * below.
 * 
 * $MAJOR.$MINOR.$SECURITY.$PATCH
 * 
 * $MAJOR: This version number shows a major change in Java version. It
 * increases when a major change occurs. Like Java 8 to Java 9. Each major
 * release contains new features to the existing one.
 * 
 * $MINOR: This version number shows minor changes in Java version and increases
 * with each minor update. These updates can be bug fixes, revision to standard
 * API etc. if an update is released to Java 9, version-string format will be
 * Java 9.1 (contains major and minor release number).
 * 
 * $SECURITY: This version number represents security update and increase for
 * each new security update. Security updates can be critical fixes and security
 * issues. If any security update is released to Java 9, the version-string
 * format will be like: Java 9.1.5 (contains major, minor and security release
 * number).
 * 
 * $PATCH: This version number increases for each security and high-priority
 * customer fixes, which has been tested together. If a patch is released to
 * Java 9, version-string format will be Java 9.1.5.1 (contains major, minor,
 * security and patch release number).
 * 
 * The $MINOR and $SECURITY version numbers are set to zero, if the $MAJOR
 * version number is incremented. However, when the $MINOR version number is
 * incremented, the subsequent $SECURITY version number need not be set to zero.
 * 
 * In Java 9, a Runtime.Version class is added to get Java version information.
 * This class contains methods and has following signature:-
 * 
 * public static final class Runtime.Version extends Object implements
 * Comparable<Runtime.Version>
 */
public class NewVersionStringScheme {
	public static void main(String[] args) {
		// Getting runtime version instance
		Runtime.Version version = Runtime.version();
		System.out.println("Current Java version is: " + version);
		System.out.println("Major version number: " + version.major());
		System.out.println("Minor version number: " + version.minor());
		System.out.println("Security version number: " + version.security());
		System.out.println("Pre-released information: " + version.pre());
		// Getting Optional build number
		System.out.println("Build Number: " + version.build());
	}
}
