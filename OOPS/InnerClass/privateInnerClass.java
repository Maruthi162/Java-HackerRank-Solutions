package OOPS.InnerClass;

class OuterClass2{
    int a=10;
    int b=20;
    //if we declare inner class as private we can't access it outside of the outer class

    int GetInnerAttribute(){
        //we can only access private Innerclass within the Outer class
        InnerClass2 inner=new InnerClass2();
        return inner.x;
    }
    private class InnerClass2{
        int x=100;
    }
}

public class privateInnerClass {

    public static void main(String[] args){
        OuterClass2 myout=new OuterClass2();
        //accessing private innerclass by creating method in outerclass
        int innerVal=myout.GetInnerAttribute();
        System.out.println("accessed private inner value: "+innerVal);
    }
    
   
}
