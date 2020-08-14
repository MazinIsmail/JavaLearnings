package com.pattern.facade;

/**
 * Structural pattern. Facade pattern hides the complexities of the system and
 * provides an interface to the client using which the client can access the
 * system. This pattern involves a single class which provides simplified
 * methods required by client and delegates calls to methods of existing system
 * classes.
 * 
 * Facade encapsulates a complex subsystem behind a simple interface. It
 * decouples a client implementation from the complex subsystem. Just provide a
 * unified and simplified interface to a set of interfaces in a subsystem,
 * therefore it hides the complexities of the subsystem from the client
 * 
 * Examples in Java:-
 * 
 * javax.faces.context.FacesContext uses LifeCycle, ViewHandler,
 * NavigationHandler classes under the hood, but most clients aren’t aware of
 * that.
 * 
 * javax.faces.context.ExternalContext uses ServletContext, HttpSession,
 * HttpServletRequest, HttpServletResponse and others inside.
 */
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
}
