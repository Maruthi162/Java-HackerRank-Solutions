package FileHandling;

import java.io.*;



public class basicFileOperations {
    public static void main(String[] args){
        String content="Writting this piece of text using filewritter";
        try(FileWriter fw= new FileWriter("test.txt", true)){ // opening file in append mode, by default file will be opened in overwrite mode which will delete the existing data
            
            fw.write(content);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }

        try(BufferedReader br= new BufferedReader(new FileReader("test.txt"))){
            String line;
            System.out.println("Reading test.txt file line by line: ");
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
