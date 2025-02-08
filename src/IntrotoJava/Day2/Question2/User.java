/*Q2. Create a User class with fields:  firstname, lastname, age, phone number.
Write a program which accepts values of user
fields from commandline, create objects and append that to a text file.
After every user creation the program should prompt:
"Do you want to continue creating users? (Type QUIT to exit)"
and keep on accepting values and writing to file until the user quits.*/

package IntrotoJava.Day2.Question2;
public class User {

    String firstname;
    String lastname;
    int age;
    String phonenumber;


    User(String fName, String lName, int age, String phoneNo){
        firstname=fName;
        lastname=lName;
        this.age=age;
        phonenumber=phoneNo;
    }

    @Override
    public String toString(){
        return firstname+" "+lastname+" is "+age+" years old. "+
               firstname+ " phone number is "+phonenumber;
    }
}

