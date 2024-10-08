package OOPS.DataAbstraction;


abstract class Employee{
    private String empName;
    int salary;
    void EmployeeName(){

    }
    public void SetEmpName(String name){
        this.empName=name;
    }
    public String getEmpName(){
        return empName;
    }
    //used abstract to method achieve data abstraction
    abstract void EmployeePersonalInfo();
   
    public Employee(String name, int salary){
        this.empName=name;
        this.salary=salary;
    }
}
 
class IT extends Employee{

    public IT(String name, int salary){
        super(name, salary);
    }
    //implementing abstract method
    @Override
    void EmployeePersonalInfo(){
        System.out.println("Employee "+this.getEmpName()+" is working in IT department with "+this.salary+" salary.");
    }


}

public class usingAbstractClass  {
    public static void main(String[] args){
        IT it=new IT("Maruthi",26000);
        it.SetEmpName("Santosh");
        it.EmployeePersonalInfo();
    }
}
