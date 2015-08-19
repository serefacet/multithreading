package com.serefacet.concurrency.racecondition;

public class DataRaceStatic implements Runnable{

	public static synchronized void increment(){
		Counter.count++;
		System.out.println(Counter.count + " ");
	}
	
	public void run() {
		increment();
		increment();
		increment();
	}
	
	public static void main(String[] args) {
		DataRaceStatic dataRaceStatic = new DataRaceStatic();
		
		Thread t1 = new Thread(dataRaceStatic);
		Thread t2 = new Thread(dataRaceStatic);
		Thread t3 = new Thread(dataRaceStatic);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	

}
