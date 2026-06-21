// import java.util.Scanner;
// import java.util.IOException;
// public class Io {
//     public static void main(String[] args) throw IOException {

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the first number:");
//         int a = scanner.nextInt();

//         System.out.println("Enter the second number:");
//         int b = scanner.nextInt();

//         int result = 0;

//         try {
//             result = b / a;   
//         } catch (IOException ioe) {
//             System.out.println("Cannot divide by zero!");
//         } finally {
//             System.out.println("The result is: " + result);
//         }

//         scanner.close();
//     }
// }
import java.io.*;
public class IO{
  public static void main(String[] args)throws IOException{
    file directory = new file("D:\\docs\\JAVA\\JAVA\\I\\MyDirectory");
    file textfile= new file (directory, "MyFile.txt");
    System.out.println(directory.exists());
    System.out.println(MyDirectory.exists());


  }
}