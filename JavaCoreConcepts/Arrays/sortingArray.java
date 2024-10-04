package JavaCoreConcepts.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class sortingArray {


    public static void SortAsce(int[] arr){
        Arrays.sort(arr);
        System.out.println("Ascending order of array : "+Arrays.toString(arr));
    }

    public static void SortDsce(int[] arr){

        arr = Arrays.stream(arr)
                .boxed() // Convert int to Integer
                .sorted(Collections.reverseOrder()) // Sort in descending order
                .mapToInt(Integer::intValue) // Convert back to int
                .toArray();
        
        System.out.println("Descending order of an array: "+Arrays.toString(arr));
    // Note: The original array won't be modified unless you return it or pass it in a wrapper.
    }
    public static void main(String[] args){
        int[] arr={1,6,32,21,2,4};
        System.out.println("Array before dorting: ");
        System.out.println(Arrays.toString(arr));

        SortAsce(arr);
        SortDsce(arr);

        
    }
}
