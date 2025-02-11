package Java8Features.Day2.Question5;
/*Given a list of objects of following class:
class Employee{ String fullName; Long salary; String city; }
Get list of all unique firstNames of employees
where their salary is less than 5000 and who live in delhi.
Note: Full name is concatenation of first name, middle name and
last name with single space in between.*/
public class Employee {
    String fullName;
    long salary;
    String city;

    public Employee(String fullName, long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }

}
