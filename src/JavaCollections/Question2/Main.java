
/* Q2. Given the following class Employee class{ Double Age; Double Salary; String Name}
Design the class in such a way that the default sorting should work on firstname and lastname.
Also, Write a program to sort Employee objects based on salary using Comparator. */
package JavaCollections.Question2;

import java.util.*;
import java.util.Scanner;

class Employee implements  Comparable<Employee>{

    int age; Double salary; String name;


    Employee(String name, int age, Double salary){
        this.name= name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return  name.compareTo(employee.name);
    }
}
public class Main {

    public static void main(String[] args) {

       List<Employee> employeeList = new ArrayList<>();


       employeeList.addAll( List.of(
               new Employee("Reena Sharma",20,15000d),
               new Employee("Raj Nanda",30,20000d),
               new Employee("Priya Kumari",21,20000d),
               new Employee("Aman Jamshed",22,15000d)
       ));

        System.out.println("Initial List elements:");
        for (Employee e: employeeList) {
            System.out.println(e.name+" "+e.age+" "+e.salary);
        }

        Collections.sort(employeeList);
        System.out.println("\n\nAfter sorting by natural order:");

        for (Employee e: employeeList) {
            System.out.println(e.name+" "+e.age+" "+e.salary);
        }

        Collections.sort(employeeList);
        System.out.println("\n\nAfter sorting by salary using comparator:");
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee, Employee t1) {
                return Double.compare(employee.salary, t1.salary);
            }
        });
        for (Employee e: employeeList) {
            System.out.println(e.name+" "+e.age+" "+e.salary);
        }

    }
}
