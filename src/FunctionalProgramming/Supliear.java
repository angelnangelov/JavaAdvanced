package FunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supliear {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supplier<String> supplier= () -> "Invalid input"; //ne priema vhodni danni ,no vrushta

        //primer koga se polzva :

        List<String> input = new ArrayList<>();
        input.add("A");
        input.add("DC");
        input.add("B");

        Predicate<String> validator = str-> str.length() >=2;  //priema input vrushta bool
        validator.test("ABC");
        System.out.println(validator.toString());

        String inputValidation = input.stream()
                .filter(validator)
                .findFirst()
                .orElse(supplier.get());

        System.out.println(inputValidation);
    }
}
