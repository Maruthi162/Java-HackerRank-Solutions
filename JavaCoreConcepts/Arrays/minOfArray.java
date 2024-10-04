package JavaCoreConcepts.Arrays;

public class minOfArray {
    public static void main(String[] args){
        int[] arr={1,2,0,4,5};
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        System.out.println("minimum value od array is "+min);
    }
}
