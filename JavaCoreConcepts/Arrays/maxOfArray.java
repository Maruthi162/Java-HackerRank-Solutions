package JavaCoreConcepts.Arrays;

public class maxOfArray {
    public static void main(String[] args){
        int[] arr={1,2,3,67,54,34,232};
        int max=arr[0];
        for(int a:arr){
            max=a>max?a:max;
        }
        System.out.println(" maximum value of array is "+max);
    }
}
