package com.org.gen.day2HandsOn;
class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int len,int bred)
	{
		length=len;
		breadth=bred;
	}
	void area()
	{
		System.out.println("Area: "+(length*breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter: "+(2*(length+breadth)));
	}
}
class Square extends Rectangle
{
	int s=4;
	
    public Square()
    {
       super(4,4);
    }
}
public class ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r=new Rectangle(2,3);
       r.area();
       r.perimeter();
       Square s=new Square();
       s.area();
       s.perimeter();
	}

}
