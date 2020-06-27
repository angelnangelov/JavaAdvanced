package FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UnaryOperator<Double> applyVAT = price -> price *1.20;

        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine()
                .split(", "))
                .mapToDouble(str->applyVAT.apply(Double.parseDouble(str)))
                .forEach(vatValue -> System.out.println(String.format("%.2f",vatValue)));
    }
}
