package com.org.gen.day3HandsOn;
abstract class Bank
{
	abstract void getBalance();
}
class Bank1 extends Bank
{
   void getBalance()
   {
	   System.out.println("100$");
   }
}
class Bank2 extends Bank
{
	void getBalance()
	   {
		   System.out.println("150$");
	   }
}
class Bank3 extends Bank
{
	void getBalance()
	   {
		   System.out.println("200$");
	   }
}
public class ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Bank1 b1=new Bank1();
		Bank2 b2=new Bank2();
		Bank3 b3=new Bank3();
		
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}

}
