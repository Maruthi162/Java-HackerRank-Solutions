package JavaCoreConcepts;

public class JavaForEach {
    public static void main(String[] args){
        String[] Movies={"Devara", "bahubali", "King", "Game Changer", "Kalki"};
        //printing elements in array
        printArray(Movies);
    }

    public static void printArray(String[] arrayToPrint){
        //using for each loop
        for(var element:arrayToPrint){
            System.out.println(element);
        }
    }
}
