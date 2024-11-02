package Collections.CollectionsMethods.ArrayList;

import Collections.StreamAPIMethods.Gender;
import java.util.*;

class Student{
    private String name;
    private int rollNum;
    private Gender gender;
    private float percentage;

    public Student(String Name, int RollNum, Gender Gender, float Percentage){
        this.name=Name;
        this.rollNum=RollNum;
        this.gender=Gender;
        this.percentage= Percentage;
    }

    public String getName(){
        return name;
    }
    public int getRollNum(){
        return rollNum;
    }
    public Gender getGender(){
        return gender;
    }
    public float getPercentage(){
        return percentage;
    }
    
}

public class ArrayListOfObjects {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>(Arrays.asList(new Student("MAruthi", 418, Gender.MALE, 71.31f), 
                                                                    new Student("Abdul", 419, Gender.MALE, 89.32f),
                                                                    new Student("Bhargavi",420,Gender.FEMALE,90.22f)));

        for(Student student: students){
            System.out.println("NAme: "+student.getName()+ " | Roll: "+student.getRollNum()+" | Gender: "+student.getGender()+" | Percentage: "+student.getPercentage());

        }
    }
}
