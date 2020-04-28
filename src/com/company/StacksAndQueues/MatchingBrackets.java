package com.company.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Deque<Integer> stack  = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch=='('){
                stack.push(i);
            }
            if(ch == ')'){
                int openBracketIndex = stack.pop();
                System.out.println(input.substring(openBracketIndex, i+1));


            }
        }
    }
}
