package StreamsFilesDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\angel\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams\\input.txt"));
        String fileName = "input.txt";
        String dir = System.getProperty("user.dir");



        System.out.println(dir);
    }
}
