package com.org.gen.day1;
import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float bal=10000.00f;
	 	do{
	        	
	        	System.out.println("Welcome to PAVAN'S ATM");
	        	System.out.println("1.English");
	        	System.out.println("2.Telugu");
	        	System.out.println("3.Hindi");
	        	System.out.println("Select your language");

	     	    int lan=sc.nextInt();
	     	    
	     	    switch(lan)
	     	    {
	     	    	
	     	    	case 1:
	    	        	System.out.println("Enter your pin: ");
                          int pin=sc.nextInt();
						 int cpin=5555;
						 if(pin==cpin)
						 {
					        	System.out.println("1.Balance Enquiry");
					        	System.out.println("2.With Draw");
					        	System.out.println("3.Depoist");
					        	System.out.println("Enter your choice:");

						 	    int c=sc.nextInt();
						 	      
						 	      switch(c)
						 	      {	
						 	      	case 1:
							        	System.out.println("Balance"+bal);
						 	      		break;
						 	        case 2:
						 	        	System.out.println("Enter the Withdraw amount:");
										int w=sc.nextInt();
										if(w<=bal)
										{
											System.out.println("Cash::"+w);
											bal=bal-w;
											System.out.println("Remaining Balance"+bal);
										}	
										else
										{
											System.out.println("Insufficient Balance");
										}	
													break;
									case 3:
									      
									      System.out.println("Enter the Deposit amount:"+bal);
										  int d=sc.nextInt();
										  bal=bal+d;
										  System.out.println("Remaining Balance"+bal);
										  break;				
								   }
						 }
						else
						{
							System.out.println("Invalid Pin");
						 } 
						 break;
						// break;
						 case 2:
							 System.out.println("Sorry I know only English");						 	
						 	break;
						 case 3:
							 System.out.println("Sorry I know only English");	
							break; 	
				 }
				  
				  System.out.println("Do you want another transaction:");	
				  System.out.println("1.Yes");
		        	System.out.println("2.No");
		        	System.out.println("Enter your choice:");
				    int ch=sc.nextInt();
				              if(ch==1)
				              {
				              	continue;
							  }
							  else
							  {
							  	break;
							  }
		 }
		 while(true);
	 	 System.out.println("Thank you visit again");
		 sc.close();
		
	}

}
