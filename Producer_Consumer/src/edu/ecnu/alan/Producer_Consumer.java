/**
 * Copyright Alan, coding at 11:21:44 AM Mar 11, 2017
 */
package edu.ecnu.alan;

/**
 * @author Alan
 *
 */
public class Producer_Consumer {

    /**
     * , constructors
     */
    public Producer_Consumer() {
	// TODO Auto-generated constructor stub
    }

    /**
     * @param args, method
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Common cm = new Common();
	Producer p1 = new Producer(cm);
	Producer p2 = new Producer(cm);
	Consumer c1 = new Consumer(cm);
	p1.start();
	p2.start();
	c1.start();
    }

}
