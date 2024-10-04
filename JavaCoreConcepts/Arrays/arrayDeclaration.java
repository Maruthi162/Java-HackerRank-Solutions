package JavaCoreConcepts.Arrays;

public class arrayDeclaration {
    
    public static void main(String[] args){
        //intializing array
        int[] nums= {1,2,3,4,5,67};
        //iterating through array
        for(int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        //modify the 5th element in the array
        nums[5]=6;
        System.out.println("Array after modifying 5th ele: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
