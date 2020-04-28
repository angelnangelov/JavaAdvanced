package com.company.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalToBinaryCovnerter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Deque<Integer> stack = new ArrayDeque<>();
        if(input==0){
            System.out.println(0);
            return;
        }
        while(input>0){
            stack.push(input %2);
            input /=2;
        }

        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());
        }


    }
}
