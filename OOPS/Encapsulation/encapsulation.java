package OOPS.Encapsulation;

class Employee{
    //using private fields to achieve data hiding, private fields only accessible in same class
    private String name;
    private int age;

    public Employee (String name,int age){
        this.name=name;
        setAge(age);
    }
    //getter for name
    public String getName(){
        return name;
    }
    //I want name to be unmodified hence not using 
    
    //getter for age
    public int getAge(){
        return age;
    }
    //setter for age
    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("age shouldn't be negetive");
        }
    }
}

public class encapsulation {
    public static void main(String[] args){
        Employee emp=new Employee("Maruthi", 24);
        //getting name using getter
        System.out.println(emp.getName());
        //getting name using age getter
        System.out.println(emp.getAge());
        //modifying age using age setter
        emp.setAge(23);
        System.out.println("Updated age: "+emp.getAge());
        
    }
}
