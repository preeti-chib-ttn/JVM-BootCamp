package JavaCollections;
/* Create class Employee with attributes name,age,designation and
use instances of these class as keys in a Map and their salary as value*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

class Employee{
    String name;
    int age;
    String designation;

    Employee(String name, int age, String designation){
        this.name= name;
        this.age=age;
        this.designation=designation;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+designation;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age, designation);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return age == employee.age && name.equals(employee.name) && designation.equals(employee.designation);
    }
}
public class Question4 {

    public static void main(String[] args) {
        Map<Employee,Double> employeeSalaryMap = new HashMap<>();

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n= scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){
            String name;
            int age;
            String designation;
            System.out.println("Name:");
            name=scanner.nextLine();
            System.out.println("Age:");
            age= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Salary:");

            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Designation:");
            designation=scanner.nextLine();
            Employee emp = new Employee(name, age, designation);
            if (employeeSalaryMap.containsKey(emp)) {
                System.out.println("Employee already exists, updating salary...");
            }

            employeeSalaryMap.put(emp, salary);
        }

        System.out.println("Employees with Salary:");
        for(Map.Entry<Employee,Double> e:employeeSalaryMap.entrySet()){

            System.out.println(e.getKey() + "   " +  e.getValue());

        }

    }
}
