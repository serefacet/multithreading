package com.serefacet.thread.basic;



/**
 * java.lang.Object class has object for multithreading .
 * 
 * wait() , notify(), notifyAll()
 *
 */
public class ThreadProperties {
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		t.setName("Seref");
		t.setPriority(9);
		
		/**
		 * Thread toString() method prints the threadName,threadPriority,thread Group
		 * 
		 * Default priority is 5.
		 * 
		 * Output will be Thread[Thread-0,5,main] if we didn't set any property to this thread.
		 */
		System.out.println(t);
		
		System.out.println("Minimum priority of a thread " + Thread.MIN_PRIORITY);
		System.out.println("Normal priority of a thread " + Thread.NORM_PRIORITY);
		System.out.println("Maximum priority of a thread " + Thread.MAX_PRIORITY);
	}

}
