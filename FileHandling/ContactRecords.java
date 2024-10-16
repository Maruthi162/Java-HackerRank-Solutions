package FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ContactRecords {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //get username and contact number from user, if user exists update the contact number else add new record
        System.out.println("enter name: ");
        String newName=sc.next();
        System.out.println("enter number: ");
        long newNumber=sc.nextLong();
        sc.close();
        String nameNumberString;

        try{
            File file=new File("MyContacts.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            RandomAccessFile raf=new RandomAccessFile(file,"rw");
            boolean found=false;

            while(raf.getFilePointer()<raf.length()){
                nameNumberString=raf.readLine();
                String[] nameNumberSplit=nameNumberString.split(";");

                String name=nameNumberSplit[0];
                System.out.println(name);
                long number= Long.parseLong(nameNumberSplit[1]);

                if(name.equals(newName) || number == newNumber){
                    found=true;
                }
            }
            if(found==false){
                nameNumberString=newName+";"+String.valueOf(newNumber);
                
                // writeBytes function to write a string
                // as a sequence of bytes.
                raf.writeBytes(nameNumberString);
 
                // To insert the next record in new line.
                raf.writeBytes(System.lineSeparator());
 
                // Print the message
                System.out.println(" Friend conatct added. ");
 
                // Closing the resources.
                raf.close();
                
                
            }
            else{
                //closing resource
                raf.close();
                System.out.println("INput name already exists");
            }
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
        catch(NumberFormatException nfe){
            System.out.println(nfe);
        }
        
    }
}
