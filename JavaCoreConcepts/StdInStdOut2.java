package JavaCoreConcepts;

import java.util.Scanner;

public class StdInStdOut2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        double d=sc.nextDouble();
        sc.nextLine(); // it will move to the next line, if we don't use this it will read the empty string.
        String str=sc.nextLine(); 
        sc.close();
        
        System.out.println("String: "+str);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);
    }
}
