package JavaCoreConcepts;

import java.util.Scanner;

public class JavaintToString {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        try {
            String str = String.valueOf(N);
            System.out.println("Good job"+str);
        } catch (Exception ex) {
            System.out.println("Wrong Answer");
        }
        sc.close();

    }
}
