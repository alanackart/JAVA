/**
 * Copyright Alan, coding at 11:10:29 AM Mar 11, 2017
 */
package edu.ecnu.alan;

/**
 * @author Alan
 *
 */
public class Consumer extends Thread{
    
    private Common cm;
    

    /**
     * , constructors
     */
    public Consumer(Common thisComm) {
	// TODO Auto-generated constructor stub
	cm = thisComm;
    }
    public void run() {
	int nth = 20;
	for(int i = 1; i <= nth; i++)
	{
	    int production = cm.get();
	    System.out.println("get data is: " + production);
	    try{
		sleep(10);
	    }catch(InterruptedException e){}
	}
    }
}
