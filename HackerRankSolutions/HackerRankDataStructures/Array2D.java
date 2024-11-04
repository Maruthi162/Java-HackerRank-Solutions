package HackerRankSolutions.HackerRankDataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        
        //declaring maxSum to store maxSum value
        int maxSum=Integer.MIN_VALUE;
        //now finding sum of HourGlassSum 
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                //row1 sum
                int row1= arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                //row2 sum
                int row2= arr.get(i+1).get(j+1);
                //row3 sum
                int row3= arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);          
                //sum of HorGlass
                int sum= row1+row2+row3;
                //checking if sum is greater than maxSum
                if(sum>maxSum){
                    //if sum is greater than maxSum update maxSum
                    maxSum=sum;
                }
            }
        }
        //printing maxSum
        System.out.println(maxSum);
    }
}
