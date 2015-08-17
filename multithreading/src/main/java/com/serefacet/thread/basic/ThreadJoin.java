package com.serefacet.thread.basic;


/**
 * join() method for waiting for a thread to die.
 * 
 * timer.join() means that wait the timer thread to die.
 * 
 * timer.join(2000) means that wait 2000 ms for this instance of thread to die.
 * 
 * @author seref
 *
 */
public class ThreadJoin extends Thread{
	String[] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

	@Override
	public void run() {
		for (int i = 9; i >= 0; i--) {

			try {
				System.out.println(timeStr[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		ThreadJoin timer = new ThreadJoin();
		System.out.println("Starting 10 second count down...");
		timer.start();
		
		try {
			timer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Boom");
	}
}
