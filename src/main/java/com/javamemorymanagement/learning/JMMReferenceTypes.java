package com.javamemorymanagement.learning;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/**
 * Reference Types:-
 * 
 * Different types of references: strong, weak, soft, and phantom references.
 * The difference between the types of references is that the objects on the
 * heap they refer to are eligible for garbage collecting under the different
 * criteria.
 * 
 * 1. Strong Reference:
 * 
 * These are the most popular reference types that we all are used to.
 * 
 * StringBuilder builder = new StringBuilder();
 * 
 * In the example above with the StringBuilder, we actually hold a strong
 * reference to an object from the heap. The object on the heap it is not
 * garbage collected while there is a strong reference pointing to it, or if it
 * is strongly reachable through a chain of strong references.
 * 
 * 2. Weak Reference
 * 
 * A weak reference to an object from the heap is most likely to not survive
 * after the next garbage collection process. A weak reference is created as
 * follows:
 * 
 * WeakReference<StringBuilder> reference = new WeakReference<>(new
 * StringBuilder());
 * 
 * A nice use case for weak references are caching scenarios. Imagine that you
 * retrieve some data, and you want it to be stored in memory as well — the same
 * data could be requested again. On the other hand, you are not sure when, or
 * if, this data will be requested again. So you can keep a weak reference to
 * it, and in case the garbage collector runs, it could be that it destroys your
 * object on the heap. Therefore, after a while, if you want to retrieve the
 * object you refer to, you might suddenly get back a null value.
 * 
 * 3. Soft Reference
 * 
 * These types of references are used for more memory-sensitive scenarios, since
 * those are going to be garbage collected only when your application is running
 * low on memory. Therefore, as long as there is no critical need to free up
 * some space, the garbage collector will not touch softly reachable objects.
 * Java guarantees that all soft referenced objects are cleaned up before it
 * throws an OutOfMemoryError. The Javadocs state, “all soft references to
 * softly-reachable objects are guaranteed to have been cleared before the
 * virtual machine throws an OutOfMemoryError.”
 * 
 * 4. Phantom Reference
 * 
 * Used to schedule post-mortem cleanup actions, since we know for sure that
 * objects are no longer alive. Used only with a reference queue, since the
 * .get() method of such references will always return null. These types of
 * references are considered preferable to finalizers. Remember that the
 * object.finalize() method is not guaranteed to be called at the end of the
 * life of an object, so if you need to close files or free resources, you can
 * rely on Phantom.
 * 
 * Soft references try to keep the reference. Weak references don’t try to keep
 * the reference. Phantom references don’t free the reference until cleared.
 */
public class JMMReferenceTypes {
	public static void main(String[] args) {
		WeakReference<StringBuilder> weakReference = new WeakReference<>(new StringBuilder());
		WeakHashMap<String, String> weakHashMap = new WeakHashMap<String, String>();

		SoftReference<StringBuilder> softReference = new SoftReference<>(new StringBuilder());

		// Reference<HeavyList> phantomRef = new PhantomReference<>(curr, queue);
	}
}
