package DefiningClasses.CarDemo.OpinionPoll;

import DefiningClasses.CarDemo.BankAccount.BankAccount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name,age);
            persons.add(person);


        }
        persons.stream()
                .filter(person -> person.getAge()> 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> {
                    System.out.println(String.format("%s - %d", person.getName(), person.getAge()));
                });

    }
}
