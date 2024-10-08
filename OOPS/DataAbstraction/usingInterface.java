package OOPS.DataAbstraction;
//Interface contain only abstract methods
interface IStudent{
    void CalculateScore(int m1, int m2, int m3);
    void AverageMarks(int m1,int m2, int m3);
}

//implementing interface
class Student implements IStudent{
    @Override
    public void CalculateScore(int m1,int m2, int m3){
        System.out.println("Total score: " + (m1+m2+m3));
    }
    @Override
    public void AverageMarks(int m1, int m2, int m3){
        System.out.println("Average marks: "+(m1+m2+m3)/3);
    }
}

public class usingInterface {
    public static void main(String[] args){
        IStudent iStudent;
        iStudent=new Student();
        iStudent.CalculateScore(100, 60, 70);
        iStudent.AverageMarks(100, 60, 70);
    }
    
    
}
