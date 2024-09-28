package JavaCoreConcepts;

import java.util.*;

public class StdInAndStdOut {
     public static void main(String[] args) {

        System.out.println("Enter three numbers:  ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int[] numbers ={a,b,c};

        System.out.println("you have entred below numbers");
        
        for(var num:numbers){
            System.out.println(num);
        }
        sc.close();
    }
}
