package com.org.gen.day6HandsOn;

public class ques2 extends Thread {
     public void run()
     {
    	 System.out.println("Current: "+Thread.currentThread());
    	 Thread.yield();
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             ques2 q1=new ques2();
             ques2 q2=new ques2();
             
             Thread t1=new Thread(q1,"1st Thread");
             Thread t2=new Thread(q2,"2nd Thread");
             
             t1.setPriority(2);
             t2.setPriority(8);
             t1.start();
             t2.start();
	}

}
