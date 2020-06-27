package ExamPrep.First;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class LootBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueLootbox = new ArrayDeque<>();
        ArrayDeque<Integer> stackLootbox = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(e->queueLootbox.offer(e));
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(e->stackLootbox.push(e));

        int collectedItems = 0;

        while(!queueLootbox.isEmpty() && !stackLootbox.isEmpty()){
            int item = queueLootbox.peek() + stackLootbox.peek();
            if(item%2==0){
                collectedItems+=item;
                queueLootbox.poll();
                stackLootbox.pop();
            }else{
                queueLootbox.offer(stackLootbox.pop());
            }

        }

        if(queueLootbox.isEmpty()){
            System.out.println("First lootbox is empty");
        }else{
            System.out.println("Second lootbox is empty");
        }

        if(collectedItems>=100){
            System.out.println("Epic loot "+ collectedItems);
        }else{
            System.out.println("Not a epic loot " + collectedItems);
        }



    }
}
