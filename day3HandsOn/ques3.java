package com.org.gen.day3HandsOn;
abstract class Marks
{
	
	abstract void getPercentage(int x);
	//abstract void getPercentage(int a,int b,int c);
}
class studa extends Marks
{
	studa(int a)
	{
		getPercentage(a);
	}
   void getPercentage(int a)
   {
	   System.out.println("%:"+a);
   }
}
class studb extends Marks
{
	studb(int b)
	{
		getPercentage(b);
	}
   void getPercentage(int b)
   {
	   System.out.println("%:"+b);
   }
}

public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studa s1=new studa(45);
		studb s2=new studb(35);

	}

}
