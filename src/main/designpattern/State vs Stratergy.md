# JavaLearning

Difference between Strategy and State Pattern in Java

1) Strategy Pattern encapsulate a set of related algorithms, and allow client to use interchangeable behaviours though composition and delegation at runtime.
On the other hand State pattern helps a class to exhibit different behaviours in different state.

2) State encapsulate state of an Object, while Strategy Pattern encapsulate an algorithm or strategy.
Since states are cohesively associated with object, it can not be reused, but by separating strategy or algorithm from it's context, we can make them reusable.

3) In State pattern, individual state can contain reference of Context, to implement state transitions, but Strategies doesn't contain reference of Context, where they are used.

4) Strategy implementations can be passed as parameter to there the Object which uses them e.g. Collections.sort() accepts a Comparator, which is a strategy. 
On the other hand state is part of context object itself, and over time, context object transitions from one State to other.

5) Difference between Strategy and State pattern is that former defines "How" part of an Object e.g. How a Sorting object sorts data, One the other hand State Pattern defines "what" and "when" part of Object e.g. What can an object, when it's on certain state.

6) Order of State transition is well defined in State pattern, there is no such requirement for Strategy pattern.
Client is free to choose any Strategy implementation of his choice.

7) Change in Strategy is done by Client, but Change in State can be done by Context or State object itself.

