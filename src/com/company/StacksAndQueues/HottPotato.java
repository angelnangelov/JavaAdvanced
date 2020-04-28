package com.company.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class HottPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String childNames = readChildNames(scanner);
        String[] splitChildren = childNames.split("\\s+");
        int tossesToRemoveOn = readN(scanner);
        Deque<String> queue  = new ArrayDeque<>(Arrays.asList(splitChildren));
        int currentRound =1;
        while (queue.size()>1){
            String currentChild = queue.poll();

            if(currentRound % tossesToRemoveOn != 0){
                queue.offer(currentChild);

            }
            currentRound++;
        }
        System.out.println(queue.poll());

    }

    private static int readN(Scanner scanner) {
        return scanner.nextInt();
    }

    private static String readChildNames(Scanner scanner) {
        return scanner.nextLine();
    }
    }

