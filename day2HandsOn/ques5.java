package com.org.gen.day2HandsOn;
class Caluclator
{
	int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum is: "+c);
		return c;
	}
	void add(int a,int b,int c)
	{
	     int d=a+b+c;
	     System.out.println("Sum is: "+d);
	}
	void add(float a,float b)
	{
		float c=a+b;
		System.out.println("Sum is: "+c);
	}
}
public class ques5 extends Caluclator{
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method overloading
        Caluclator c=new Caluclator();
        c.add(2, 3);
        c.add(3, 5, 7);
        c.add(3.5f, 4.2f);
        //ques5.add(2, 6);
	}

}
