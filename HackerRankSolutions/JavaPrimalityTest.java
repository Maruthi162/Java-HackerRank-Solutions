package HackerRankSolutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
     public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        // Create BigInteger from the input string
       BigInteger num=new BigInteger(n);
       // Check if the number is prime with a certainty value   
       String res=num.isProbablePrime(1)?"prime":"not prime";
       System.out.println(res);
       
        bufferedReader.close();
    }
}
