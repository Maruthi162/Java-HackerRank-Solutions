package JavaCoreConcepts;

import java.util.Scanner;

public class JavaLoops1 {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        for (int i = 0; i < l; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            String out = Pattern(a, b, n);
            sc.close();
            System.out.println(out);
        }
    }

    public static String Pattern(int a, int b, int n) {
        int res = 0;
        String out = "";
        for (int i = 0; i < n; i++) {
            res += a + (int) Math.pow(2, i) * b;
            out += res + " ";
        }
        return out;
    }
}
