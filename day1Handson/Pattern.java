package com.org.gen.day1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*12
          13
          21
          21
          32
          33
         */
		int a=12,b=21,c=32;
		for(int i=1;i<=6;i++)
		{
			if(i<=2)
			{
				System.out.println(a++);
			}
			else if(i<=4)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c++);
			}
		}
	}

}
