package com.org.onetoone;

import javax.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
      
	   @Id @GeneratedValue
	   @PrimaryKeyJoinColumn(name = "EmpId")
	   private int empid;

   
	
	private String name,mailid;
	
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
