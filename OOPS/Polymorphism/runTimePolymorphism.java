package OOPS.Polymorphism;

class Laptop{
    void Brand(){
        System.out.println("Every Laptop has it's own branding.");
    }
}

class HP extends Laptop{
    @Override
    void Brand(){
        System.out.println("Laptop brand is HP");
    }
}

class Dell extends Laptop{
    @Override
    void Brand(){
        System.out.println("Laptop brand is Dell");
    }
}

public class runTimePolymorphism {
    public static void main(String[] args){
        //PArent class reference to create instance for child classes
        Laptop mylap;

        mylap=new HP();
        //Brand method in HP class
        mylap.Brand();
        mylap=new Dell();
        //Brand method in Dell class
        mylap.Brand();
    }
}
