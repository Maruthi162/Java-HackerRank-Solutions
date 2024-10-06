package OOPS.Inheritance;

class Animal2 {
    int noOfLegs;
    void Eat(){
        System.out.println("Animal Eats");
    }
}
//first level of inheritance
class Cat2 extends Animal2{
    void HoeManyLegs(){
        this.noOfLegs=4;
        System.out.println("Cat  has "+noOfLegs+ " legs");
    }
    @Override
    void Eat(){
        System.out.println("Cat drinks milk");
    }
}

//second level of inheritance
class Kitten extends Cat2{
    @Override
    void HoeManyLegs(){
        this.noOfLegs=3;
        System.out.println("Kitten only have "+noOfLegs+" legs");
    }
    void parentHowManyLegs(){
        super.HoeManyLegs();
    }
    @Override
    void Eat(){
        System.out.println("Kitten likes milk and rats");
    }

    void ParentEat(){
        super.Eat();
    }
}

public class mulitLevelInheritance {
    public static void main(String[] args){
        Kitten myKitten=new Kitten();
        myKitten.parentHowManyLegs();
        myKitten.HoeManyLegs();
        myKitten.Eat();
        myKitten.ParentEat();
        

    }
}
