package com.org.gen.day3HandsOn;



abstract class Myclass
{
	int x=10;
	abstract void calculate(int a,int b);	
	public int data(int a)
	{
		return a*a;
	}
	public Myclass()
	{
		System.out.println("Abstarct class Constructor");
	}
	public static void m1()
	{
		System.out.println("Abstract Static method");
	}
	final void f()
	{
		System.out.println("Abstract final Method");
	}
}
public class ques4 extends Myclass{

	void calculate(int a,int b)
    {
   	 int c=a+b;
   	 System.out.println("Sum is: "+c);
    }
    public ques4()
    {
   	 super();
   	 System.out.println("Main class constructor");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ques4 a=new ques4();
        a.calculate(2, 3);
        Myclass.m1();
        a.f();
        a.data(2);

}
}
