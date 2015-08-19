package com.serefacet.concurrency.sync;

/**
 * You can not declare constructors synchronized , it will result in a compiler error.
 * Because JVM ensures that only one thread can invoke a constructor call(for a specific constructor)
 * at a given point in time.So, there is no need to declare a constructor synchronized.However,
 * if you want,you can use synchronized blocks inside constructors;
 * 
 * 
 * @author seref
 *
 */
public class StaticSynchronizedMethod {

	
	private static int staticVal;
	
	/**
	 * Static methods do not have the implicit this variable.So that it acquires lock on class.
	 * @param i
	 */
	public static synchronized void assign(int i){
		staticVal = i;
	}
	
	/**
	 * This method equals upper method.
	 * 
	 * @param i
	 */
	public static synchronized void assignBlock(int i){
		
		synchronized(StaticSynchronizedMethod.class){
			staticVal = i;
		}
		
	}
}
