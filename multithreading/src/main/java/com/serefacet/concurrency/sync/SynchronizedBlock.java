package com.serefacet.concurrency.sync;

import com.serefacet.concurrency.racecondition.Counter;

/**
 * we can use sychronized block only with reference types in java.
 * 
 * We can not use with primitive types.
 * 
 * Even if there is an exception in synchronized block , the JVM releases the
 * lock. No matter how the program execution terminates.
 * 
 * 
 * @author seref
 *
 */
public class SynchronizedBlock {

	/**
	 * Beginners commonly misunderstand that a synchronized block obtains a lock
	 * for a block of code. Actually, the lock is obtained for an object and not
	 * for a piece of code. The obtained lock is held until all the statements
	 * in that block complete execution.
	 **/
	public void increment() {

		// code segment guarded by the mutex lock
		synchronized (this) {
			Counter.count++;
			System.out.println(Counter.count + " ");
		}

	}

	public void run() {
		increment();
		increment();
		increment();
	}

}
