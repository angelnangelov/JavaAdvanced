package FunctionalProgramming;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CountUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        Predicate<String> startWithCapital = str -> Character.isUpperCase(str.charAt(0));

        StringBuilder sb = new StringBuilder();


        AtomicInteger counter = new AtomicInteger(0); //da se polzva v lambda

        Consumer<String> addToOutput = str->{
            counter.incrementAndGet();

         sb.append(str).append(System.lineSeparator());
        };

        Arrays.stream(text.split("\\s+"))
                .filter(startWithCapital)
                .forEach(addToOutput);

        System.out.println(counter);
        System.out.println(sb.toString());


    }
}
