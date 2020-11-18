package com.resourcePool.learning;

/**
 * Resource Pools (Object Pools)
 * 
 * Resource pools (otherwise known as object pools) are used to manage the
 * sharing of objects between multiple clients. A client with access to a
 * resource pool can avoid creating a new resource by simply asking the pool for
 * one that has already been instantiated instead. Examples of object pooling
 * can be found in many distributed systems: a number of Java server systems,
 * including Enterprise JavaBeans servers, use this technique to speed client
 * access and improve overall throughput.
 * 
 * The object being pooled is referred to as the resource. Examples of resources
 * might be database connections, socket connections, or available phone lines.
 * 
 * When a resource, such as a database connection, is required, we do not create
 * the object within the client code. Instead, we go to the resource pool and
 * call the getResource() method, which returns one of the available objects
 * within the pool. Normally, the objects in the pool have been created
 * (instantiated) in advance. When we have finished with the object, we must
 * return it to the ResourcePool. Note that, if all the users of a resource pool
 * are not well-behaved code citizens, doing their job and returning the object
 * to the pool, the benefits of the pooling model are broken, and we would be
 * better off without it. So, as good clients of the pool, when we take an
 * object out, we make a vow that we will put it back some time in the future.
 * 
 * It is quite possible that implementations of this interface will use a
 * FactoryMethod to create the resource objects when the object pool is first
 * created; this allows the pooling mechanism to be decoupled from the logic of
 * creating the objects. The implementations could also use a lazy instantiation
 * to create a resource when all the currently constructed resources are in use.
 * 
 * For example, some resource pool implementations have a MAX and MIN capacity.
 * When this type of pool is first instantiated, it creates the MIN number of
 * resources, but as the number of requests exceed MIN, the pool creates more
 * objects on demand by means of lazy instantiation until it reaches MAX.
 * 
 * If a broken object is put back into the pool, it will most likely cause
 * problems for the next client that tries to use it. What we really need is a
 * mechanism that allows clients to return broken resources in a way that
 * gracefully acknowledges that the resource is faulty. To do this we need to be
 * able to call an explicit method on ResourcePool rather than returning the
 * broken resource with releaseResource().
 * 
 * Recycler
 * 
 * A Recycler is an ecologically friendly version of the Director object that
 * appears in the builder pattern just discussed. When a broken object is
 * returned to the pool, it is the Recycler's job to examine the object and to
 * try to replace only the part (or parts) of the object that are broken. This
 * alleviates the cost of removing and creating new resource objects from
 * scratch.
 * 
 * Recyclers useful in distributed systems designs in which a number of
 * connections are attached to a Session object. In this particular context, the
 * Session becomes unusable when a single connection fails, because its correct
 * behavior is dependent on all of the connections being available. So, although
 * the session is no longer usable, all but one of the connections are still
 * valid. This scenario is a perfect example of a time when you would want to
 * use a Recycler.
 */
public interface ResourcePools {

}
