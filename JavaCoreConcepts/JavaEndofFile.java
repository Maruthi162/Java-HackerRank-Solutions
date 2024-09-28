package JavaCoreConcepts;

import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        String str3="";
        int i=1;
        while(sc.hasNext()){
            str3=sc.nextLine();
            sc.close();
            System.out.println(i+" "+str3);
            i++;
        }
        
    }
}
