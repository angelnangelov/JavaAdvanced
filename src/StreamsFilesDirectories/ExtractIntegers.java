package StreamsFilesDirectories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");

        Scanner scanner = new Scanner(file);

        PrintWriter writer = new PrintWriter("integeres.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int nextInt = scanner.nextInt();

                writer.println(nextInt);
            } else scanner.next();
        }
        writer.flush();

    }
}
