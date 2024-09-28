package JavaCoreConcepts;

import java.util.Scanner;

public class JavaStaticInitializer {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int h=sc.nextInt();
        if(b<=0 || h<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(b*h);
        }
        sc.close();
    }
}
