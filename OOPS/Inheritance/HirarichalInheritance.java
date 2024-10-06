package OOPS.Inheritance;

class Animal3{
    void eat(){
        System.out.println("Animal Eats food");
    }
}

class Dog2 extends Animal3{
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal3{
    void Meow(){
        System.out.println("Cat meows");
    }
}

class Bird2 extends Animal3{
    void fly(){
        System.out.println("Bird flys");
    }
}

public class HirarichalInheritance {
    public static void main(String[] args){
        Dog2 dog=new Dog2();
        dog.eat();
        dog.bark();
        Cat2 cat=new Cat2();
        cat.eat();
        cat.Meow();
        Bird2 bird=new Bird2();
        bird.eat();
        bird.fly();


    }
}
