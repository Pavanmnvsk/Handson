package com.org.gen.day2HandsOn;
class Member {
	String name;
	int age;
	int phone_no;
	String address;
	int salary;
	
	Member() {
		//TODO
	}
	public Member(String name , int age , int phone_no , String address , int salary){
		super();
		this.name = name;
		this.age = age;
		this.phone_no= phone_no;
		this.address = address;
		this.salary = salary;
	}
	void printsalary() {
		System.out.println("name : " + this.name + " salary: " + this.salary);
	}
}
class Employee extends Member {
	String specialization;
	Employee() {
		super();
	}
	public Employee(String name , int age , int phone_no , String address ,int salary, String specialization) {
		super(name, age, phone_no, address,salary );
		this.specialization = specialization;
	}
	public void print() {
		System.out.println(this.name + this.age + this.phone_no + this.address );
    }
}
class Manager extends Member {
	String department;
	Manager() {
		super();
	}
	public Manager(String name , int age , int phone_no , String address , int salary, String department) {
		super(name, age, phone_no, address, salary);
		this.department = department;
	}
	public void print() {
		System.out.println(this.name + this.age + this.phone_no + this.address );
	}
}
    
public class ques2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Manager manager = new Manager("Pavan"   , 25  , 626  , " Hyderabad"  , 70000 , " Computer Science ");
         manager.print();
         manager.printsalary();
         Employee employee = new Employee("Arjun"  ,23   , 567   , "Vizag"    , 50000   , " Electronics");
         employee.print();
         employee.printsalary();
       }
}