package com.solid.learnings;

/**
 * Open Closed Principle
 * 
 * Software components should be open for extension, but closed for
 * modification.
 * 
 * According to this principle, a class should be written in such a manner that
 * it performs its job flawlessly without the assumption that people in the
 * future will simply come and change it. Hence, the class should remain closed
 * for modification, but it should have the option to get extended. Ways of
 * extending the class include:
 * 
 * Inheriting from the class
 * 
 * Overwriting the required behaviors from the class
 * 
 * Extending certain behaviors of the class
 * 
 * We should be able to extend those classes without worrying if those base
 * classes can support our extensions. But inheritance may lead to subclasses
 * which depend on base class implementation. To avoid this, use of interfaces
 * is recommended. This additional abstraction leads to loose coupling.
 */
public class OpenClosedPrinciple {

	// StudentInfo example
	// StudentInfoAgain example
	// StudentService
}
