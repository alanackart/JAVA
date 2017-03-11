/**
 * Copyright Alan, coding at 11:08:02 AM Mar 11, 2017
 */
package edu.ecnu.alan;


/**
 * Copyright Alan, coding at 10:35:52 AM Mar 11, 2017
 */

/**
 * @author Alan
 *
 */



public class Common {
	
	private int production[];
	private int count;
	private int BSIZE = 3; //buffer size
	

	/**
	 * , constructors
	 */
	public Common() {
		// TODO Auto-generated constructor stub
		production = new int [BSIZE];
		count = 0;
	}
	
	public synchronized int get(){
		int result;
		while(count <= 0)
		{
			try{
				wait();
			}catch(InterruptedException e){}
		}
		result = production[--count];
		notifyAll();
		return result;
	}
	
	public synchronized void put(int newProduct){
		while(count >= BSIZE)
		{
			try{
				wait();
			}catch(InterruptedException e){}
		}
		production[count++] = newProduct;
		notifyAll();
	}

}
