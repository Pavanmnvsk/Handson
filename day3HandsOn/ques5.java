package com.org.gen.day3HandsOn;
interface in
{
	void display(int p);
}
public class ques5 implements in{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ques5 q=new ques5();
           q.display(5);
	}

	@Override
	public void display(int p) {
		// TODO Auto-generated method stub
		for(int i=2;i<=p;i++)
		{
			boolean c=true;
			for(int j=2;j<=p/2;j++)
			{
				if(i%j==0)
				{
					c=false;
					break;
				}
			}
			if(c==true)
			{
				System.out.println(i);
			}
		}
	}

}
