package JavaCoreConcepts.Recurssion;

import java.util.Scanner;

public class REversingString {
    static String Reverse(String str){
        //base case
        if(str.equals("")){
            return "";
        }
        //recurssive case
        else{
            return str.charAt(str.length()-1)+Reverse(str.substring(0,str.length()-1));
        }
    }
}

class Answer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str=sc.nextLine();
        sc.close();
        String reversedString=REversingString.Reverse(str);
        System.out.println("String atfter reversing: "+reversedString);
        
    }
}
