package Java8Features.Day2.Question5;
/*Given a list of objects of following class:
class Employee{ String fullName; Long salary; String city; }
Get list of all unique firstNames of employees
where their salary is less than 5000 and who live in delhi.
Note: Full name is concatenation of first name, middle name and
last name with single space in between.*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeees= new ArrayList<>();

        employeees.add(new Employee("Rajat Sharma",4000,"Delhi"));
        employeees.add(new Employee("Simran Jain",2200,"Delhi"));
        employeees.add(new Employee("Simran Abrol",30000,"Delhi"));
        employeees.add(new Employee("Harsh Singh Jamwal",30000,"Jammu"));


        List<String> employeeeNames = employeees.stream()
                .filter(emp-> emp.salary<5000 && emp.city.equals("Delhi"))
                .map(Employee::getFirstName).collect(Collectors.toList());

        System.out.println(employeeeNames);
    }
}
