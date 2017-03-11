/**
 * Copyright Alan, coding at 11:17:01 AM Mar 11, 2017
 */
package edu.ecnu.alan;

/**
 * @author Alan
 *
 */
public class Producer extends Thread{
    
    private Common cm;
    

    /**
     * , constructors
     */
    public Producer (Common thisComm) {
	// TODO Auto-generated constructor stub
	cm = thisComm;
    }
    public synchronized void run() {
	int nth = 10;
	for(int i = 1; i <= nth; i++)
	{
	   cm.put(i);
	    System.out.println("put data is: " + i);
	    try{
		sleep(10);
	    }catch(InterruptedException e){}
	}
    }
}