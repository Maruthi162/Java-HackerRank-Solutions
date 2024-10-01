package JavaCoreConcepts;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        int age = 25;
        String name = "Alice";
        double height = 5.72;
        //understanding different format specifiers.
        System.out.printf("Name: %s, Age: %d, Height: %.1f%n", name, age, height);

        double pi = 3.14159;
        //printing pi woth 2 decimal points
        System.out.printf("Pi with 2 decimal places: %.2f%n", pi);
        //specifying minimum width of pi is 10 characters, if the given value is less than 10 characters, empty spaces are filled in the left side.
        System.out.printf("Right-aligned: %10.2f%n", pi); // Width of 10, 2 decimal places

    }

}
