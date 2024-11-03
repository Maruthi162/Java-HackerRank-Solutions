package Collections;
import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        //stack follows last in first out
        //Stack comes under List interface

        Stack<String> books =new Stack<>();
        //adding elements to stack using push()
        books.push("Telugu");
        books.push("Java");
        books.push("Python");
        books.push("C#");

        //printing stack
        System.out.println("Initial Stack: "+ books);

        //iterating through stack using iterator

        Iterator<String> it=books.iterator();
        System.out.println("Iterating through stack using iterator: ");
        while(it.hasNext()){
            
            System.out.println(it.next());
        }


        //getting peek element 
        String peek=books.peek();
        System.out.println("Next peek element ready to remove is : "+peek);

        //removing next peek element using pop

        String popedElement= books.pop();

        System.out.println("Removed element = "+ popedElement);

        System.out.println("stack after removing peek element: "+ books);

        //check if the stack is empty or not
        System.out.println("Stack is Empty: "+ books.empty());

        //search for particular element 
        System.out.println("Position of Java: "+books.search("Java"));
    }
}
