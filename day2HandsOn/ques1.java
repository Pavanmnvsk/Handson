package com.org.gen.day2HandsOn;
class Parent
{
	void pdisplay()
	{
		System.out.println("This is parent class");
	}
}
class Child extends Parent
{
	void cdisplay()
	{
		System.out.println("This is child class");
	}
}
public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Child c=new Child();
     c.pdisplay();
     c.cdisplay();
     System.out.println();
     Parent p=new Parent();
     p.pdisplay();
	}

}
