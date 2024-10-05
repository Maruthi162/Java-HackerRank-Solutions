package OOPS;


import java.util.Scanner;

class Car{
    int weight=150;
    String color="Red";

    public static void Drive(int speed){
        System.out.println("Driving in "+speed+" speed");
    }

    public void Break(){

        System.out.println("stopped");
    }    
}

public class JavaClassObjects {
    public static void main(String[] args){
        Car myCar=new Car();
        Scanner sc=new Scanner(System.in);
        int exit =1;
        while(exit!=0){
            System.out.println("Enter 0: off, 1: Repaint, 2:Drive, 3:Break" );
            int command=sc.nextInt();
            switch(command){
                case 0 -> {
                    System.out.println("turned off, please start again to continue");
                    exit=0;
                }
                case 1 -> 
                {
                    System.out.println("enter color you like: ");
                    String color=sc.next();
                    myCar.color=color;
                    System.out.println("your car repainted with "+ myCar.color);
                }
                //caling static method
                case 2 -> {
                    System.out.println("set speed: ");
                    int speed=sc.nextInt();
                    Car.Drive(speed);
                }
                //calling instance method
                case 3 -> myCar.Break();
            }
        
        }
        sc.close();
        
    }
}


