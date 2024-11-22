package LeetCode;
import java.util.*;
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int count=0;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
    public static void main(String[] args) {
        FactorialTrailingZeroes obj=new FactorialTrailingZeroes();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        System.out.println("trailing zeros in "+n+" Factorial "+ " are "+ obj.trailingZeroes(n));
    }
}
