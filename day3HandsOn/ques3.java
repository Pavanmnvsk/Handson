package com.org.gen.day3HandsOn;
abstract class Marks
{
	void percentage() {}
}
class StudentA extends Marks
{
	int s1,s2,s3;
	float p;
	StudentA(int s1, int s2, int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	void percentage()
	{
		p=(s1+s2+s3)/3;
		System.out.println("Percentage marks for student A:"+p);
	}
}
class StudentB extends Marks
{
	int s1,s2,s3,s4;
	float p;
	StudentB(int s1, int s2, int s3, int s4)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
	}
	void percentage()
	{
		p=(s1+s2+s3+s4)/4;
		System.out.println("Percentage marks for student B:"+p);
	}
}
public class Q3 {
	public static void main(String[] args) {
		StudentA s1 =new StudentA(68,94,80);
		s1.percentage();
		StudentB s2 =new StudentB(83,74,60, 78);
		s2.percentage();
	}

}