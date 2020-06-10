package MultidemnsionalArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();
        String line = scanner.nextLine();
        while (!line.equals("search")) {
            String[] tokens = line.split("-");
            phoneBook.put(tokens[0], tokens[1]);
            line = scanner.nextLine();
        }
        while (!line.equals("stop")) {
            if (phoneBook.containsKey(line)) {
                System.out.println(String.format("%s -> %s", line, phoneBook.get(line)));
            } else {
                System.out.println("Contact doesnt exist");

            }
            line = scanner.nextLine();
        }
    }
}
