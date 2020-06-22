package IteratorsAndComparators.ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {

            String[] temp = input.split("\\s+");
            people.add(new Person(temp[0], Integer.parseInt(temp[1]), temp[2]));

            input = scanner.nextLine();
        }

        int index = Integer.parseInt(scanner.nextLine()) - 1;
        Person person = people.get(index);

        int count = 0;

        for (Person person1 : people) {
            if (person1.compareTo(person) == 0) {
                count++;
            }
        }


        if (count == 1) {
            System.out.println("No matches");
        } else {
            System.out.println(String.format("%d %d %d", count, people.size() - count, people.size()));
        }
    }
}
