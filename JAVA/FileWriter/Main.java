// How to write a file using Java ($ popular options)
//FileWriter = Good for small or medium-sized text files
// BufferWriter = Better performance for large amounts of text
// PrintWriter = Best for structured data , like reports or logs
//FileoutStream = Best for binary files(e.g , images , audio file)

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        String filePath ="test.txt";
        String textContent = """
                    Roses are Red 
                    Violets are Blue 
                    BOOTY BOOTY BOOTY
                    ROCKIN' EVERWHERE!
                    """;
       try(FileWriter writer = new FileWriter(filePath)){
           writer.write(textContent);
           System.out.println("File has been written");

       }
       catch (FileNotFoundException e){
           System.out.println("Could not locate file location");

       }
       catch (IOException e){
           System.out.println("Could not write file");
       }
    }
}
