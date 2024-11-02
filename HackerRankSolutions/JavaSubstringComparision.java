package HackerRankSolutions;

import java.util.Scanner;

public class JavaSubstringComparision {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        if (k > s.length()) {
            return ""; // Handle the case appropriately
        }
        
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        
        for(int i=0;i<=s.length()-k;i++){
            String subStringOfLengthK=s.substring(i,i+k);
            if(subStringOfLengthK.compareTo(smallest)<0){
                smallest=subStringOfLengthK;
                
            }
            if(subStringOfLengthK.compareTo(largest)>0){
                largest=subStringOfLengthK;
            }
        }
    
        return "Smallest substring: "+smallest + "\n" +"Largest SubString: "+ largest;
    }
    
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
