package HackerRankSolutions.HackerRankDataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    public static boolean CheckBalanced(String input) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{' || input.charAt(i) == '[' || input.charAt(i) == '(') {
                stk.push(input.charAt(i));
            } else {
                //Extra closing bracket: if there is closing paranthesis then then there should be corresponding opening paranthesis if not return false;
                if (stk.empty()) {
                    return false;
                } else if (!stk.empty() && (input.charAt(i) == ')' && stk.peek() == '(') ||
                        (input.charAt(i) == ']' && stk.peek() == '[') ||
                        (input.charAt(i) == '}' && stk.peek() == '{')) {
                    stk.pop();
                }
            }
        }

        return stk.empty();
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int exit=0;
        while (sc.hasNext() && exit ==0) {
            String input = sc.next();
            // Complete the code
            System.out.println(CheckBalanced(input));
            System.out.println("enter 0 to contonue, 1 to exit");
            exit=sc.nextInt();
        }
        sc.close();
    }
}
