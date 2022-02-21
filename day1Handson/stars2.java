package com.org.gen.day1;

public class stars2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Name:Pavan....To print 'P'
		int i, j,n=5;
	    for (i = 0; i < n; i++)
	    {
	        System.out.print("*");
	        for (j = 0; j < n; j++)
	        {
	            if ((i == 0 || i == n / 2) && j < n - 1)
	                System.out.print("*");
	            else if (i < n / 2 && j == n - 1 && i != 0)
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	        System.out.println();
	    }
	}

}
