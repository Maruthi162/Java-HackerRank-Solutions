package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class CountOfVovels {
    
    static int VovelCount(String str){
        //base case
        if(str.equals("")){
            return 0;
        }
        else{
             // Check if the first character is a vowel
            int count="aeiou".indexOf(Character.toLowerCase(str.charAt(0))) != -1?1:0;
            // Recursive call with the rest of the string
            return count+ VovelCount(str.substring(1));
        }
    }
}

class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string to count vovels");
        String str=sc.nextLine();
        sc.close();
        System.out.println("No of vovels: "+CountOfVovels.VovelCount(str));
    }
}
