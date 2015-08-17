package com.serefacet.thread.states;


/**
 * 
 * Thread States are in Thread.State enum 
 * 
 * NEW,
 * RUNNABLE, (is ready to run or is in the running state which you cannot determine)
 * BLOCKED,
 * WAITING,
 * TIMED_WAITING,
 * TERMINATED
 * 
 * @author seref
 *
 */
public class ThreadState extends Thread {

	public static void main(String[] args) throws Exception {
		
		Thread t = new ThreadState();
		
		System.out.println("Just after creating thread; \n The thread state is: " + t.getState());
		t.start();
		
		System.out.println("Just after calling t.start(); \n The thread state is: " + t.getState());
		t.join();
		
		System.out.println("Just after main calling t.join(); \n The thread state is: " + t.getState());

		
		/**
		 * Output : 
		 * 
		 * Just after creating thread; 
		 *	 The thread state is: NEW
		 *	Just after calling t.start(); 
		 *	 The thread state is: RUNNABLE // it can be printed out as TERMINATED, no guarantee 
		 *	Just after main calling t.join(); 
		 *	 The thread state is: TERMINATED
		 */
	}
}
