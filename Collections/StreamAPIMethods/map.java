package Collections.StreamAPIMethods;

import java.util.*;
import java.util.stream.Collectors;



public class map {
    
    public static void main(String[] args) {
        //Example -1
        List<String> words=Arrays.asList("Apple","Banana","Custord Apple","Goa","Kiwi");
        //map(Function<? super T,? extends R> mapper)
        List<String> upperCaseWords= words.stream()
                                            .map(String::toUpperCase) // converts each word to upper case
                                            .collect(Collectors.toList());
        
        System.out.println(upperCaseWords.toString());

        //Example-2:
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
        //map(Function<? super T,? extends R> mapper)
        List<Integer> squares=nums.stream()
                                    .map(n->n*n) //squares each number
                                    .collect(Collectors.toList());
        System.out.println("Sqaures: "+squares.toString());

        //Example-3: arrays of objects
        List<Employee> staff=Arrays.asList(new Employee("Maruthi", 26000, Gender.MALE),
                                            new Employee("Shankar", 25000, Gender.MALE),
                                            new Employee("Lalitha", 29000, Gender.FEMALE));
        List<String> staffNames=staff.stream()
                                        .map(Employee::getName)
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println("Staff Names"+staffNames.toString());

        List<Integer> staffSalaries=staff.stream()
                                            .map(Employee::getSalary)
                                            .collect(Collectors.toList());
        System.out.println("Staff salaries"+staffSalaries.toString());

    }
}

class Employee{
    private String name;
    private int salary;
    private Gender gender;

    public Employee(String name, int salary, Gender gender){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
    }
    
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }
    public int getSalary(){
        return salary;
    }
}
