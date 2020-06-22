package Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = Arrays.stream(scanner.nextLine().split("\\s+"))
                .skip(1)
                .toArray(String[]::new);

        ListyIterator listyIterator = new ListyIterator(strings);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            switch (input) {
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    System.out.println(listyIterator.getCurrentElement());
                    break;
                case "HasNext":
                    try {
                        System.out.println(listyIterator.hasNext());
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "PrintAll" :
                    listyIterator.forEach(e -> {
                        System.out.print(e + " ");
                    });
                    System.out.println();
                    break;
            }


            input = scanner.nextLine();
        }

    }
}
