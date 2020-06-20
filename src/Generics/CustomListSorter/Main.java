package Generics.CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box<String> box = new Box<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] temp = input.split("\\s+");
            String command = temp[0];
            if (command.equals("Add")) {
                box.addInfo(temp[1]);
            }

            if (command.equals("Remove")) {
                box.remove(Integer.parseInt(temp[1]));
            }

            if (command.equals("Contains")) {
                box.contains(temp[1]);
            }

            if (command.equals("Swap")) {
                box.swap(Integer.parseInt(temp[1]), Integer.parseInt(temp[2]));
            }

            if (command.equals("Greater")) {
                box.greater(temp[1]);
            }

            if (command.equals("Print")) {
                box.print();
            }

            if (command.equals("Max")) {
                System.out.println(box.getMax());
            }

            if (command.equals("Min")) {
                System.out.println(box.getMin());
            }

            if (command.equals("Sort")) {
                box.sort();
            }

            input = scanner.nextLine();
        }

    }
}
