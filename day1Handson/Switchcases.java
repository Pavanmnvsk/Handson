package com.org.gen.day1;
import java.util.Scanner;
public class Switchcases {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int bill=0;
		do {
       System.out.println("Hi Pavan..");
       System.out.println("Welcome to Multicuisine Resturant");
       System.out.println();
      
       System.out.println("1.South Indian");
       System.out.println("2.North Indian");        
       System.out.println("3.Rajastani");        
       System.out.println("4.Bengali");        
       System.out.println("Select your choice: ");
       int c=sc.nextInt();
       
       switch(c)
       {
       case 1:
	       {
		        System.out.println("Select your dish: ");   
		        System.out.println("1.Idli");        
		        System.out.println("2.Dosa");        
		        System.out.println("3.Puri");        
                System.out.println("4.Hyderabad Biriyani");
                 int d=sc.nextInt();
                 int prices[]= {20,30,40,200};
                 
                 switch(d)
                 {
	                 case 1:
		                 {
		                	 System.out.println("Your Idli is ready");
		                	 bill+=prices[0];
		                	 break;
		                 }
	                 case 2:
	                 {
	                	 System.out.println("Your Dosa is ready");
	                	 bill+=prices[1];
	                	 break;
	                 }
	                 case 3:
	                 {
	                	 System.out.println("Your Puri is ready");
	                	 bill+=prices[2];
	                	 break;
	                 }
	                 case 4:
	                 {
	                	 System.out.println("Your Biriyani is ready");
	                	 bill+=prices[3];
	                	 break;
	                 }
	                 default:
	                 {
	                	 System.out.println("Wrong Choice");	                	
	                	 break;
	                 }
                 }
                 break;
	       }
          case 2:
	       {
		        System.out.println("Sorry!..Currently not available");        
                break;
	       }
	       case 3:
	       {
		        System.out.println("Sorry!..Currently not available");        
	            break;
	       }
	       case 4:
	       {
		        System.out.println("Sorry!..Currently not available");        
	            break;
	       }
	       default:
	       {
		        System.out.println("Wrong Choice.");        
	            break;
	       }
       }
       System.out.println();
         System.out.println("Do you want to order more: ");
         System.out.println("1.Yes");
         System.out.println("2.No");
         System.out.println("Select your choice: ");
         int r=sc.nextInt();
	         if(r==1)
	         {
	        	 continue;
	         }
	         else
	         {
	        	 if(bill>500)
	        	 {
	        		 System.out.println("Take a Soft Drink as complementary");
	        	 }
	        	 System.out.println("Total Bill is: "+bill);
	        	 System.out.println("Thank you visit again!");
	        	 break;
	         }
		}
		while(true);
		sc.close();
	}

}
