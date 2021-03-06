package com.serefacet.thread.basic;

public class FirstThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("In run method; thread name is " + Thread.currentThread().getName());
	}
	
	
	
	public static void main(String[] args) {
		FirstThread firstThread = new FirstThread();
		
		/**
		 * If we use start method, it is scheduled and spawned by JVM.
		 * 
		 * If we use run method directly,it is called by main thread directly which is not suitable.
		 * 
		 * NEVER CALL  the run() method directly for invoking a thread.
		 * Use start() method and leave it to the JVM to implicitly invoke the run() method.
		 * 
		 * Calling the run() method directly instead of calling start() is a mistake and is fairly 
		 * common bug.
		 */
		
		firstThread.start();
		
		
		
		System.out.println("In main method; there name is " + Thread.currentThread().getName());
	}
}
