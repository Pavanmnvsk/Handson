package com.org.gen.day7Handson;
import java.util.*;
class Developer {
	 
    
    int id,exp,salary;
    String name;
   
    public Developer(int id, String name, int exp,int salary)
    {        
        this.id = id;
        this.name = name;
        this.exp = exp;
        this.salary=salary;
    }
 
    public String toString()
    {
 
        
        return this.id + " " + this.name + " "
            + this.exp+" "+this.salary;
    }
}
 

class Sortbyexp implements Comparator<Developer> {
 
   
    public int compare(Developer a, Developer b)
    {
 
        return a.exp - b.exp;
    }
}
class SortbySalary implements Comparator<Developer> {
	 
    
    public int compare(Developer a, Developer b)
    {
 
        return a.salary - b.salary;
    }
}
 
// Class 3
// Helper class implementing Comparator interface
class Sortbyname implements Comparator<Developer> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(Developer a, Developer b)
    {
 
        return a.name.compareTo(b.name);
    }
}

public class ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Developer> ar = new ArrayList<Developer>();

		// Adding entries in above List
		// using add() method
		ar.add(new Developer(125, "Pavan", 3,85000));
		ar.add(new Developer(18, "Mahesh", 6,45000));
		ar.add(new Developer(25, "Prabhas", 1,95000));
		ar.add(new Developer(333, "Nani", 8,35000));

		
		System.out.println("Unsorted");

	
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		
		Collections.sort(ar, new Sortbyexp());

		
		System.out.println("\nSorted by Experience:");

			for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		System.out.println("\nSorted by Name:");
		Collections.sort(ar, new Sortbyname());
		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		
		System.out.println("\nHighest salary");
		Collections.sort(ar, new SortbySalary());		
			System.out.println(ar.get(3));
	}

}
