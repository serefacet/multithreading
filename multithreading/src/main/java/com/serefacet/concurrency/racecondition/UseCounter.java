package com.serefacet.concurrency.racecondition;

/**
 * 
 * @author seref
 *
 */
public class UseCounter implements Runnable {

	/**
	 * with synchronized keyword, we do not have the race condition problem.
	 * If we omit sychronized keyword , the output will not be stable.
	 * 
	 */
	public synchronized void increment() {

		Counter.count++;
		System.out.println(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}

}
