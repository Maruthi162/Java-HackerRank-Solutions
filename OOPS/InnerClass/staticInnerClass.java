package OOPS.InnerClass;

class OuterClass3{
    //making static to access it inside static class
    static int x=10;
    int y=20;

    static class InnerClass{
        int a=100;
        int b=200;
        //static innerclass can't access outer class attributes and method unless that is also static
        int out=x;

    }
}

public class staticInnerClass {
    
}
