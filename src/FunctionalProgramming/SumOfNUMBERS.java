package FunctionalProgramming;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Function;

public class SumOfNUMBERS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> printCount = arr -> {
            System.out.println("Count = " + arr.length);
            return arr;
        };
        Function<int[], String> arrSum = arr -> "Sum = " + Arrays.stream(arr).sum();
        System.out.println(printCount.andThen(arrSum).apply(numbers));
    }

}
