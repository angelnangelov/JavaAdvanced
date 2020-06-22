package com.company.StacksAndQueues;


import java.util.ArrayDeque;
import java.util.Collections;

import java.util.ArrayDeque;

import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersToOffer = scanner.nextInt();
        int numbersToPoll = scanner.nextInt();
        int lookUpNumber = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < numbersToOffer; i++) {
            numbers.offer(scanner.nextInt());
        }
        for (int i = 0; i < numbersToPoll; i++) {
            numbers.poll();
        }
        if(numbers.contains(lookUpNumber)){
            System.out.println("true");
        }else{
            System.out.println(numbers.stream()
                    .min(Integer::compareTo)
                    .orElse(0));
        }
    }
}
