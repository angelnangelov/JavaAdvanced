package com.company.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" "))
                .forEach(stack::push);

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }



    }
}
