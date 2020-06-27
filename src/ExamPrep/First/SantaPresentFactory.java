package ExamPrep.First;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantaPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doll = 0;
        int woodenTrain = 0;
        int teddyBear = 0;
        int bicycle = 0;

        ArrayDeque<Integer> materialStack = new ArrayDeque<>();
        ArrayDeque<Integer> magicQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(e -> materialStack.push(e));
        Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).forEach(e -> magicQueue.offer(e));

        while (!materialStack.isEmpty() && !magicQueue.isEmpty()) {

            int materials = materialStack.peek();
            int magicLevel = magicQueue.peek();
            int result = materials * magicLevel;

            if (materials == 0 || magicLevel == 0) {
                if(materials==0){
                    materialStack.pop();
                }
                if(magicLevel==0){
                    magicQueue.poll();
                }

                continue;
            }
            if (materials * magicLevel < 0) {
                int resultplus = materials + magicLevel;
                materialStack.pop();
                magicQueue.poll();
                materialStack.push(resultplus);
                continue;
            }

            switch (materials * magicLevel) {
                case 150:
                    materialStack.pop();
                    magicQueue.poll();
                    doll++;
                    break;
                case 250:
                    materialStack.pop();
                    magicQueue.poll();
                    woodenTrain ++;
                    break;
                case 300:
                    materialStack.pop();
                    magicQueue.poll();
                    teddyBear++;
                    break;
                case 400:
                    materialStack.pop();
                    magicQueue.poll();
                    bicycle ++;
                    break;
                default:
                    magicQueue.poll();
                    materialStack.pop();
                    materialStack.push(materials + 15);;

            }
            }



        if((doll >0 && woodenTrain>0) || (teddyBear>0&&bicycle>0)){
            System.out.println("The presents are crafted! Merry Christmas!");
            Print(doll, woodenTrain, teddyBear, bicycle, materialStack,magicQueue);


        }else {
            System.out.println("No presents this Christmas!");
            Print(doll, woodenTrain, teddyBear, bicycle, materialStack,magicQueue);
        }






        }

    private static void Print(int doll, int woodenTrain, int teddyBear, int bicycle, ArrayDeque<Integer> materialStack,ArrayDeque<Integer> magicQue) {
        if(!materialStack.isEmpty()){
            System.out.println("Materials left: " + materialStack.stream().map(String::valueOf).collect(Collectors.joining(", ")));        }
        if(!magicQue.isEmpty()){
            System.out.println("Magic left: " + magicQue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
        }



        if(bicycle>0){
            System.out.println("Bicycle: " + bicycle);
        }
        if(doll>0){
            System.out.println("Doll: " + doll);
        }
        if(teddyBear>0){
            System.out.println("Teddy bear: " + teddyBear);
        }
        if(woodenTrain>0){
            System.out.println("Wooden train: " + woodenTrain);
        }
    }

}

