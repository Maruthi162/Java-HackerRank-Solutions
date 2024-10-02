package JavaCoreConcepts;

public class BreakContinue {
    public static void main(String[] args) {
        String[] Names = { "Maruthi", "Govind", "Guna", "Santhosh", "Abdul" };
        printNames(Names);
    }

    public static void printNames(String[] Names) {
        int length = Names.length;
        for (int i = 0; i < length; i++) {
            if (i == 2) { // this will skip printing the 2 index element i.e Guna
                // i++; id we increment this next element will also be skipped
                continue;

            }
            System.out.println(Names[i]);
        }
    }
}
