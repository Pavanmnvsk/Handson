package com.org.gen.day3HandsOn;

public class Bankacc implements credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Bankacc b=new Bankacc();
         b.Dollars();
         b.Rupees();
         b.Pounds();
	}

	@Override
	public void Rupees() {
		// TODO Auto-generated method stub
		 System.out.println("Rupees");
	}

	@Override
	public void Dollars() {
		// TODO Auto-generated method stub
		System.out.println("Dollars");
	}

	@Override
	public void Pounds() {
		// TODO Auto-generated method stub
		System.out.println("Pounds");
		
	}

}
