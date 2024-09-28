package JavaCoreConcepts;

import java.util.Scanner;

public class OutputFormating {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        char ch='=';
        String repeated=String.valueOf(ch).repeat(32);
        System.out.println(repeated);
        for(int i=0;i<3;i++){
            String lang=sc.next();
            int version=sc.nextInt();
            System.out.printf("%-15s%03d%n",lang,version);
        }
        sc.close();
        System.out.println(repeated);
    }
}
