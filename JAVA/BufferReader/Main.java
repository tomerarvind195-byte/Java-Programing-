//How toread a file using jave(# popular options)
//BufferReader + fileReader Best for reading text files line by line
// FileInputStream : Best for binary files(e.g., images , audio fies )
// RandomAccessFile : Best for read/write specific portions of a large file


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){


        String filePath = "C:\\Users\\tomer\\OneDrive\\Desktop\\test.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                 System.out.println(line);
            }

        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate file");

        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }

    }
}
