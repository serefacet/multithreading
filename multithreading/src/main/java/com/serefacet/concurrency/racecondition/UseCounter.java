package com.serefacet.concurrency.racecondition;

public class UseCounter implements Runnable {

	public void increment() {

		Counter.count++;
		System.out.println(Counter.count + " ");
	}

	public void run() {
		increment();
		increment();
		increment();
	}

}
