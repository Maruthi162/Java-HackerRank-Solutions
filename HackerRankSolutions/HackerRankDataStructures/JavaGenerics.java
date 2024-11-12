package HackerRankSolutions.HackerRankDataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaGenerics {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        List lst=new ArrayList();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add("Hello");
        lst.add("World");
        lst.forEach(System.out :: println);
        sc.close();
    }
}
