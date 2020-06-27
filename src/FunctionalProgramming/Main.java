package FunctionalProgramming;

import WorkShopDataStructures.Array;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .toArray();

        Consumer<int[]> consumer = arr -> System.out.println(Arrays.stream(numbers).
                mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));

        consumer.accept(numbers);

        Arrays.sort(numbers);

        consumer.accept(numbers);

        Function<Integer, Integer> function = x -> x * x;
        System.out.println(function.apply(3));


    }


}
