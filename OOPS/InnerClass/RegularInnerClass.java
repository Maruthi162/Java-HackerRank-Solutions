package OOPS.InnerClass;

class OuterClass{
    int age=10;
    String name="Maruthi";

    //Inner class
    class InnerClass{
        int y=10;
        void myInnerMethod(){
            //accessing outer class attributes from inner class
            System.out.println("Name from outer class: "+name);
        }
    }
}

public class RegularInnerClass {
    public static void main(String[] args){
        //creating object for outer class and accessing inner class from outer object
        OuterClass myOutter=new OuterClass();
        //creating inner object from outer object
        OuterClass.InnerClass myInner= myOutter.new InnerClass();
        System.out.println("Inner class variable: "+myInner.y);
        myInner.myInnerMethod();

    }
}


