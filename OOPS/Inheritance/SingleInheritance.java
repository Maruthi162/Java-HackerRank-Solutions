package OOPS.Inheritance;

class Animal{
    public int noofLegs;
    void Eat(){
        System.out.println("Animal eats");
    }

    void Sleep(){
        System.out.println("animal sleeps for x hours a day");
    }
}

class Dog extends Animal{
    String breed;

    public Dog(String breed, int noOfLegs){
        this.breed=breed;
        this.noofLegs=noOfLegs;
    }

    @Override
    void Eat(){
        System.out.println("Dog eats meet and rice");
    }
    @Override
    void Sleep(){
        System.out.println("Dog sleeps 10hrs a day");
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        Animal animal=new Animal();
        Dog dog=new Dog("Ratviler",4);
        System.out.println("Result of eat() method in animal class");
        animal.Eat();
        System.out.println("result of overriden eat() method in dog class");
        dog.Eat();

    }
}
