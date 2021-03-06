package com.org.Maven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity  
@Table(name="emp20")  
public class Employee {
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    @PrimaryKeyJoinColumn   
private int employeeId;   
 
private String name,email,skill; 
 
public int getEmployeeId() {  
    return employeeId;  
}  
public void setEmployeeId(int employeeId) {  
    this.employeeId = employeeId;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getEmail() {  
    return email;  
}  
public void setEmail(String email) {  
    this.email = email;  
}
public String getSkill() {
	return skill;
}
public void setSkill(String skill) {
	this.skill = skill;
}  

}