package com.company.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] symbols = input.split("\\s+");

        if(symbols.length==0){
            return;
        }
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(Integer.parseInt(symbols[0]));

        for (int i = 1; i < symbols.length; i++) {
            String operations = symbols[i];
            int number = Integer.parseInt(symbols[++i]);
            Integer stackNum = stack.pop();

            if("+".equals(operations)){
                stack.push(number + stackNum);
            }else if("-".equals(operations)){
                stack.push(stackNum - number);
            }
        }
        System.out.println(stack.pop());


    }
}
