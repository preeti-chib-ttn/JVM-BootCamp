package IntrotoJava.Day1;

/* Create a class named IntrotoJava.Day1.Employee with fields firstname,lastname,age and designation.
The class should:

1. have all types of constructors to initialize the object

2. class should also have setter methods to update a particular field

3. Override its toString method to display a meaningful message using all these fields.

*/
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    // default constructor
    public Employee() {
        this.firstName = "TTN";
        this.lastName = "Trainee";
        this.age = 0;
        this.designation = "Not Assigned";
    }
    // parameterized constructor
    public Employee(String firstName, String lastName, int age, String designation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.designation = designation;
    }

    // copy constructor
    public Employee(Employee emp) {
        this.firstName = emp.firstName;
        this.lastName = emp.lastName;
        this.age = emp.age;
        this.designation = emp.designation;
    }

    // setter functions
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Please enter a positive value.");
        }
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee Details: " + firstName + " " + lastName +
                ", Age: " + age + ", Designation: " + designation;
    }

    public static void main(String[] args) {
        System.out.println("Using parameterised constructor:");
        Employee emp1 = new Employee("Preeti", "Chib", 23, "JVM Trainee");
        System.out.println(emp1);
        System.out.println("Using default constructor");
        Employee emp2 = new Employee();
        System.out.println(emp2);

        System.out.println("Changed the attribute values using setter and get the object using toString():");
        emp2.setFirstName("Gauri");
        emp2.setLastName("Sharma");
        emp2.setAge(22);
        emp2.setDesignation("Python Trainee");
        System.out.println(emp2);

        System.out.println("Using Copy constructor:");
        Employee emp3 = new Employee(emp1);
        System.out.println(emp3);
    }
}

