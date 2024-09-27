public class Variables {
    // declaring static variable
    static String static_variable = "this is static variable because declared outside method and inside class with static keyword";

    static double Sum(int a, int b) {
        // here sum is the Local variable since it is declared inside the method
        double sum = a + b; // implicit type casting int to double
        return sum;
    }

    public static void main(String[] args) {
        // instance variable since it is declared outside the body of the method and inside the class.
        double result = Sum(3, 4);
        System.out.println(result);

    }
}
