package com.org.gen.day3HandsOn;
interface time
{
	void getinfo();
}
public class ques6 implements time{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ques6 q=new ques6();
        q.getinfo();
	}

	@Override
	public void getinfo() {
		// TODO Auto-generated method stub
		  System.out.println("Time: ");
	}

}
