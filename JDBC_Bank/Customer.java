package com.org.gen.day11HandsOn;
import java.util.*;
import java.sql.*;
public class Customer {
	static Scanner sc=new Scanner(System.in);
    static int accountno=0,balance=0;
   static String name=null;;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Connection con = getConnection.connection();
			System.out.println("Enter your name");
			String name = sc.nextLine();
			System.out.println("Enter your account no:");
			int acc = sc.nextInt();
			System.out.println("Entered details:"+name +"  "+acc);
//			
			PreparedStatement pr = con.prepareStatement("select * from Bank where accountno=? and name=?");
			pr.setString(2, name);
			pr.setInt(1, acc);
			System.out.println(pr);
			
			ResultSet rs = pr.executeQuery();
			rs.next();
			accountno= rs.getInt(1);
			name=rs.getString(2);
			balance=rs.getInt(3);
			System.out.println(accountno+" "+ name);
			if(acc==accountno) {
				int ch=0;
				while(ch!=4) {
					pr.setInt(1, acc);
					rs = pr.executeQuery();
					rs.next();
					accountno= rs.getInt(1);
					name=rs.getString(2);
					balance=rs.getInt(3);
				
				System.out.println("Chose what you want to do:");
				System.out.println("1. Check balance:");
				System.out.println("2. Deposit:");
				System.out.println("3. Withdraw:");
				System.out.println("4. Exit:");
				ch= sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Balance: "+balance);
					break;
				case 2:
					PreparedStatement pr1=con.prepareStatement("update Bank set balance =? where accountno=? ");
					System.out.println("Enter amount to deposit:");
					int bal=sc.nextInt();
					pr1.setInt(1, balance+bal);
					pr1.setInt(2, accountno);
					pr1.executeUpdate();
					System.out.println("Deposited");
					break;
				case 3:
					if(balance>10000) {
						int d=Withdraw(rs);
						if(d>0) {
							rs=pr.executeQuery();
							rs.next();
							System.out.println("New Balance:"+rs.getInt(3));
						}
					}
					else {
						System.out.println("Available balance too low to withdraw");
					}
					break;
				case 4:
					 System.out.println("Thank you!..Visit again..");
					 break;
				default:
					System.out.println("Invalid option");
				}				
				}
			}
			else {
				System.out.println("you are not registered in our bank");
			}
			sc.close();
			con.close();
        }
         catch(Exception e)
        {
         	System.out.println(e);
        }
         
	}
	private static int Withdraw(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("Enter amount to withdraw:");
		int withdraw=sc.nextInt();
		int data=0;
		if(withdraw>=balance){
			System.out.println("Available balance too low to withdraw");
			
		}
		else {
			PreparedStatement pr2 =getConnection.connection().prepareStatement("update bank set balance =? where accountno=?");
			pr2.setInt(1, balance-withdraw);
			pr2.setInt(2, accountno);
			data =pr2.executeUpdate();
			System.out.println("executed:"+data);
			}
		return data;	
		
	}
}
