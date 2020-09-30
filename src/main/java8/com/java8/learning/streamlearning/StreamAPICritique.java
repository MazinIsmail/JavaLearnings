package com.java8.learning.streamlearning;

public class StreamAPICritique {

	/**
	 * Batch, Not Streaming
	 * 
	 * The result of the terminal operation is returned after the last element in
	 * the stream has been processed.
	 * 
	 * Returning a final result after having processed the last element of a stream
	 * is only possible if you know what element is the last in the stream. The only
	 * way to know if a given element is the last element in a stream is, if you are
	 * processing a batch which has a last element. In contrast, a true stream does
	 * not have a last element. You never know if a given element is the last or
	 * not. Therefore it is not possible to perform a terminal operation on a
	 * stream.
	 */

	/**
	 * Chain, Not Graph
	 * 
	 * You can only add a single non-terminal operation to a Stream, resulting in a
	 * new Stream object.You can add another non-terminal operation to the resulting
	 * Stream object, but not to the first. The resulting structure of non-terminal
	 * Stream instances form a chain.
	 * 
	 * In a true stream processing API, the root stream and the event listeners can
	 * typically form a graph, not just a chain. Multiple listeners can listen to
	 * the root stream, and each listener may process the elements in the stream in
	 * its own way, and may forward a transformed element as a result. This is how
	 * Apache Kafka Streams is designed. Each listener (intermediate stream) could
	 * also have multiple listeners. The resulting structure forms a graph of
	 * listeners with listeners with listeners etc.
	 * 
	 * With a stream processing graph rather than a chain, there is not a single,
	 * final operation in the graph. By final operation I mean an operation which is
	 * guaranteed to be the last in the processing chain. Instead there can be
	 * multiple final operations. Each "leaf" in the graph is a final operation.
	 */

}
