package com.oops.inheritance;

/**
 * This determines whether a certain class HAS-A certain thing. This
 * relationship helps to reduce duplication of code.
 */
public class HasARelationship {

}

class Vehicle {
}

class Speed {
}

class Van extends Vehicle {
	private Speed sp;
}
