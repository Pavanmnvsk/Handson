package com.org.gen.day6HandsOn;

public class thread extends Thread {
	 public void run()
	    {
	        try {
	            Thread.sleep(2000);
	            System.out.println("Java");
	        }
	        catch (InterruptedException e) {
	            throw new RuntimeException("Thread " +
	                                    "interrupted");
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 thread t1 = new thread();
	        t1.start();
	        try {
	            t1.interrupt();
	        }
	        catch (Exception e) {
	            System.out.println("Exception handled");
	        }
	}

}
