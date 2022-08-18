package com.solid.learnings;

/**
 * Liskov Substitution Principle
 * 
 * Derived types must be completely substitutable for their base types.
 * 
 * Every subclass or derived class should be substitutable for their parent or
 * base class.
 * 
 * The principle can further be simplified by; a child type of a particular
 * parent type without making any complication or blowing things up should have
 * the ability to stand in for that parent.
 * 
 * This avoids misusing inheritance. It helps us confirm to the
 * is-a-relationship. For example, its tempting to say that a circle is a type
 * of ellipse but circles don't have two foci or major/minor axes.
 * 
 * The LSP is popularly explained using the square and rectangle example. If we
 * assume an is-a relationship between Square and Rectangle. Thus, we call
 * Square is a Rectangle. As per the principle, the functions that use
 * references to the base classes must be able to use objects of derived class
 * without knowing it. The Square class always assumes that the width is equal
 * with the height. If a Square object is used in a context where a Rectangle is
 * expected, unexpected behaviour may occur because the dimensions of a Square
 * cannot (or rather should not) be modified independently.
 */
public class LiskovSubstitutionPrinciple {

	// Rectangle example
	// ShapeService example
}
