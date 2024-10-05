package JavaCoreConcepts;

import java.util.Scanner;

public class LexicogrphicStringComparision {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
   
        String A= sc.nextLine();
       
        String B= sc.nextLine();
        sc.close();
        
        System.out.println(getTotalLength(A, B));
        System.out.println(AgreaterThanB(A, B));
        System.out.println(stringConcat(A, B));
        
    }
    
    static String AgreaterThanB(String A, String B){
        
        // int ALength=A.length();
        // int BLength=B.length();
        if(A==null && B==null){
            return "No";
        }
        else if(A==null){
            return "No";
        }
        else if(B==null){
            return "Yes";
        }
        else if(A.equals(B)){
            return "No";
        }
        return A.compareTo(B)>=0?"Yes":"No";
        // if(ALength!=BLength){
        //     int minLength= (ALength>BLength)?ALength:BLength;
        //     for(int i=0;i<minLength;i++){
        //         char char1=A.charAt(i);
        //         char char2=B.charAt(i);
        //         if(char1!=char2){
        //             return (char1>char2)?"Yes":"No";
        //         }
        //    }
        
        //  }
            
        // return "No";
        
    }
    
    static int getTotalLength(String a, String b){
        return a.length()+b.length();
    }
    
    static String stringConcat(String a, String b){
        return a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1);
    }
}
