package JavaCoreConcepts.Arrays;

public class arraySum {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,3322};
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        System.out.println("Sum of th elements of a array= "+sum);
    }
}
