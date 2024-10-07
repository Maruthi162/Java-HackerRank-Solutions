package OOPS.Inheritance;

interface Walker{
    void walk();
}

interface Swimmer{
    void Swim();
}

interface Flyer{
    void Fly();
}

//multiple inheritance with interface
class Frog implements Walker,Swimmer{
    @Override
    public void walk(){
        System.out.println("Frog can walk");
    }
    public void Swim(){
        System.out.println("Frog can swim");
    }

}
//multiple inheritance with interface
class Bird implements Walker,Flyer{
    @Override  //in java if we don't use @Override annotation also method overriding will work
    public void walk(){
        System.out.println("Bird can walk");
    }
    public void Fly(){
        System.out.println("Bird can fly");

    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        Frog frog=new Frog();
        frog.Swim();
        frog.walk();

        Bird bird=new Bird();
        bird.Fly();
        bird.walk();
    }
}
