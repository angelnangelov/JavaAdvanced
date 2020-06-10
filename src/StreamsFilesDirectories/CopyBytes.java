package StreamsFilesDirectories;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        byte[] bytes = Files.readAllBytes(file.toPath());

        Writer writer = new FileWriter("text-as-bytes.txt");

        for (byte b : bytes) {
            String out = String.valueOf(b);
            if(b ==32){
                out = " ";
            }else if (b ==10){
                out = System.lineSeparator();
            }
            writer.append(String.valueOf(b));
        }
        writer.flush();
    }
}
