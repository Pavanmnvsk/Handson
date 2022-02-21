package com.org.gen.day5HandsOn;
import java.util.*;

class NewEmployee {
    String name;
    int id;
    int salary;
    int experience;
    String skillSet;

    public NewEmployee(String name, int id, int salary, int experience, String skillSet) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}

class OldEmployee {
    String name;
    int id;
    int salary;
    int experience;
    String skillSet;

    public OldEmployee(String name, int id, int salary, int experience, String skillSet) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.experience = experience;
        this.skillSet = skillSet;
    }
}

public class ques3 {
    public static void main(String[] args) {
        NewEmployee new1 = new NewEmployee("Pavan", 1001, 200000, 2, "Java");
        NewEmployee new2 = new NewEmployee("Mnvsk", 1002, 300000, 2, "Python");
        NewEmployee new3 = new NewEmployee("Srikar", 1003, 400000, 2, "C++");
        NewEmployee new4 = new NewEmployee("Pranav", 1004, 500000, 2, "Angular");
        NewEmployee new5 = new NewEmployee("Guru", 106, 600000, 2, "Php");
        OldEmployee old1 = new OldEmployee("Karthik", 1005, 100000, 2, "Java");
        OldEmployee old2 = new OldEmployee("Teja", 1006, 200000, 2, "Java");
        OldEmployee old3 = new OldEmployee("Mohan", 1007, 300000, 2, "C++");
        OldEmployee old4 = new OldEmployee("Akshay", 1008, 400000, 2, "React");
        OldEmployee old5 = new OldEmployee("Vikas", 1007, 500000, 2, "Node");

        HashSet<Object> Employee = new HashSet<>();
        Employee.add(new1);
        Employee.add(new2);
        Employee.add(new3);
        Employee.add(new4);
        Employee.add(new5);
        Employee.add(old1);
        Employee.add(old2);
        Employee.add(old3);
        Employee.add(old4);
        Employee.add(old5);

        Set<String> skillSetWithJava = new HashSet<>();
        System.out.println("Total no of employees: " + Employee.size());
        Object forRemoval = null;
        for (Object o : Employee) {
            if (o.getClass() == NewEmployee.class) {
                if (((NewEmployee) o).id == 106) {
                    System.out.println("Removed id 106");
                    forRemoval=o;
                }
                if (((NewEmployee) o).skillSet.contains("Java")) {
                    skillSetWithJava.add(((NewEmployee) o).name);
                }
            } else {
                if (((OldEmployee) o).id == 106) {
                    forRemoval=o;
                    System.out.println("Removed id 106");
                }
                if (((OldEmployee) o).skillSet.equals("Java")) {
                    skillSetWithJava.add(((OldEmployee) o).name);
                }
            }
        }
        
        Employee.remove(forRemoval);
        for (String s : skillSetWithJava) {
            System.out.println("Skill set with Java :" + s);
        }



    }
}
