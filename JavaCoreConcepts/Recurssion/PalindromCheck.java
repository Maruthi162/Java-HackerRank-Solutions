package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string to check palindrom");
        String str=sc.next();
        sc.close();
        System.out.println("given string "+str+" is "+PalindromCheckerClass.IsPalindrom(str));
    }
}

class PalindromCheckerClass{
    
    static String IsPalindrom(String str){
        //base case
        if(str.length()<=1){
            return "Palindrom";
        }
        else if(str.charAt(0)==(str.charAt(str.length()-1))){
            return IsPalindrom(str.substring(1,str.length()-1));
        }
        else{
            return "Not a Palindrom";
        }
    }
}
