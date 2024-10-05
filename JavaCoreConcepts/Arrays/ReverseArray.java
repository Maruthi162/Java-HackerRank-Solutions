package JavaCoreConcepts.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    private void Reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int len=sc.nextInt();
        int[] arr= new int[len];
        System.out.println("Enter array elements");
        for(int i=0;i<len;i++){
            int ele=sc.nextInt();
            arr[i]=ele;
        }
        sc.close();
        ReverseArray obj=new ReverseArray();
        obj.Reverse(arr);
    }
}
