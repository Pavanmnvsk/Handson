package com.org.gen.day1;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter the year: ");
		int y=sc.nextInt();
	    boolean b=false;
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
				{
					b=true;
				}
				else
				{
					b=false;
				}
			}
			else
			{
				b=true;
			}
		}
		else
		{
			b=true;
		}
        if(b)
        {
        	System.out.print("Leap Year...."); 
        }
        else
        {
        	System.out.print("Non leap year.. "); 
        }
        sc.close();
	}

}
