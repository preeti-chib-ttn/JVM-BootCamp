package BeyondJava.Day2;
/*Q1) Create a Record for the Student with the
 following Fields:
 id name standard

Q2) Make sure that no null values should
be used for initialization.

Q3) Use equal and hashCode methods
with Student records
 */

record  Student(Integer id, String name, String standard){

    public Student{
        if(id==null ||name==null  || standard==null){
            throw new IllegalArgumentException("All Fields are required");
        }
    }

}
public class Question1_2_3 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Rohan","5th");
        Student s2 = new Student(1,"Rohan","5th");
        Student s3 = new Student(2,"Priya","6th");

        try{
            Student s4= new Student(null,"test",null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getLocalizedMessage());
        }

        // Same Hashcode based on the content
        System.out.println("Hashcode of s1, s2, s3: "+ s1.hashCode()
                +", "+s2.hashCode()+", "+s3.hashCode());

        // Both have same hashcode
        System.out.println("s1 is equal to s2? "+s1.equals(s2));

    }
}
