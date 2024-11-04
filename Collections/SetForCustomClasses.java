package Collections;

import java.util.*;

public class SetForCustomClasses {
    public static void main(String[] args) {
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("Maruthi", 18));
        studentSet.add(new Student("Hima",19));
        studentSet.add(new Student("Rahul",20));

        System.out.println("Student set : "+ studentSet);

        //creatid student s1
        Student s1=new Student("Vivek",11);
        Student s2=new Student("Vikas",11);
        //comparing s1 and s2 using the equals method which was overidden in Student class
        //since rollNo are same in s1 and s2, s1.equals(s2) is true
        System.out.println("S1 and s2 are same: "+ s1.equals(s2));

    }
    

}
