package com.pattern.command;

/**
 * The Command Pattern is a Behavioral pattern.
 * 
 * A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command
 * and passes the command to the corresponding object which executes the
 * command. Encapsulate in an object all the data required for performing a
 * given action (command), including what method to call, the method's
 * arguments, and the object to which the method belongs.
 * 
 * This model allows us to decouple objects that produce the commands from their
 * consumers, so that's why the pattern is commonly known as the
 * producer-consumer pattern. Makes our code extensible as we can add new
 * commands without changing existing code.
 * 
 * In a classic implementation, the command pattern requires implementing four
 * components: the Command, the Receiver, the Invoker, and the Client.
 * 
 * A command is an object whose role is to store all the information required
 * for executing an action, including the method to call, the method arguments,
 * and the object (known as the receiver) that implements the method. In this
 * example 'Order', 'SellStock' and 'BuyStock' are the Command. And the
 * component that performs the operations is the receiver, in our case 'Stock'.
 * A receiver is an object that performs a set of cohesive actions. It's the
 * component that performs the actual action when the command's execute() method
 * is called.
 * 
 * An invoker is an object that knows how to execute a given command but doesn't
 * know how the command has been implemented. It only knows the command's
 * interface, in our case it is 'Broker'.
 * 
 * A client is an object that controls the command execution process by
 * specifying what commands to execute and at what stages of the process to
 * execute them. In our example it is 'CommandPatternDemo'.
 * 
 * Allows the requester of a particular action to be decoupled from the object
 * that performs the action. Where the Chain of Responsibility pattern forwarded
 * requests along a chain, the Command pattern forwards the request to a
 * specific module.
 * 
 * You'll see command being used a lot when you need to have multiple undo
 * operations, where a stack of the recently executed commands are maintained.
 * To implement the undo, all you need to do is get the last Command in the
 * stack and execute it's undo() method. Command is useful for wizards, progress
 * bars, GUI buttons and menu actions, and other transactional behaviour.
 */
public class CommandPatternDemo {
	public static void main(String[] args) {

		// The Receiver
		Stock abcStock = new Stock();

		// The Command
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		// The Invoker
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
