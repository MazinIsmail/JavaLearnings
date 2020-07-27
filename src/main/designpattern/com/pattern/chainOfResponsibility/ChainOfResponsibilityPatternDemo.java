package com.pattern.chainOfResponsibility;

/**
 * Chain of Responsibility pattern comes under behavioral patterns. Chain of
 * responsibility pattern is used to achieve loose coupling in software design
 * where a request from client is passed to a chain of objects to process them.
 * 
 * Implementation Principles:-
 * 
 * Each processor in the chain will have its implementation for processing a
 * command.
 * 
 * Every processor in the chain should have reference to the next processor
 * 
 * Each processor is responsible for delegating to the next processor so beware
 * of dropped commands
 * 
 * Processors should not form a recursive cycle
 * 
 * Only one processor in the chain handles a given command
 * 
 * Example: Servlet Filters in Java, Exception handling systems also implement
 * this pattern. Multiple catch blocks in a try-catch block code. Here, every
 * catch block is kind of a handler to handle that particular exception. When an
 * exception occurs in the try block, it sends the exception to the first catch
 * block to process. If the catch block is not able to handle it, it forwards
 * the exception to the next handler in the chain, i.e. the next catch block. If
 * even the last catch block is not able to handle it, then the exception is
 * thrown outside of the chain to the calling program.
 * 
 * Highlights of Chain of Responsibility:-
 * 
 * Sender will not know which object in the chain will serve its request. Every
 * node in chain will have the responsibility to decide, if they can serve the
 * request. If node decides to forward the request, it should be capable of
 * choosing the next node and forward it. There is a possibility where none of
 * the node may serve the request.
 * 
 * Advantage:-
 * 
 * Decoupling a sender and receiver of a command. Picking a processing strategy
 * at processing-time. Allows us to add or remove responsibilities dynamically
 * by changing the members or order of the chain.
 * 
 * Drawbacks:-
 * 
 * Mostly, it can get broken easily: if a processor fails to call the next
 * processor, the command gets dropped or if a processor calls the wrong
 * processor, it can lead to a cycle. It can create deep stack traces, which can
 * affect performance. There is the potential that the request could reach the
 * end of the chain and not be handled at all.
 */

public class ChainOfResponsibilityPatternDemo {

	// configure Chain of Responsibility
	private static NumberChain getChainOfNumberChain() {
		NumberChain c1 = new NegativeProcessor();
		NumberChain c2 = new ZeroProcessor();
		NumberChain c3 = new PositiveProcessor();
		c1.setNext(c2);
		c2.setNext(c3);
		return c1;
	}

	public static void main(String[] args) {

		NumberChain numberChain = getChainOfNumberChain();

		// calling chain of responsibility
		numberChain.process(new NumCheck(99));
		numberChain.process(new NumCheck(-30));
		numberChain.process(new NumCheck(0));
		numberChain.process(new NumCheck(100));

	}

}
