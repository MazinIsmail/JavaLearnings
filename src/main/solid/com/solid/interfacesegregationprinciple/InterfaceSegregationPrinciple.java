package com.solid.interfacesegregationprinciple;

/**
 * Interface Segregation Principle
 * 
 * Clients should not be forced to implement unnecessary methods which they will
 * not use.
 * 
 * So basically, the interface segregation principles as you prefer the
 * interfaces, which are small but client specific instead of monolithic and
 * bigger interface. In short, it would be bad for you to force the client to
 * depend on a certain thing, which they don’t need.
 * 
 * For example, a single logging interface for writing and reading logs is
 * useful for a database but not for a console. Reading logs make no sense for a
 * console logger.
 */
public class InterfaceSegregationPrinciple {

}
