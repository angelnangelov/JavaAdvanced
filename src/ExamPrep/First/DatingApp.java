package ExamPrep.First;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> malesStack = new ArrayDeque();
        ArrayDeque<Integer> femaleQueue = new ArrayDeque();

        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(e -> malesStack.push(e));
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(e -> femaleQueue.add(e));
        int matches = 0;

        while (!malesStack.isEmpty() && !femaleQueue.isEmpty()) {
            int female = femaleQueue.peek();
            int male = malesStack.peek();

            if(female <= 0){
                femaleQueue.poll();
                continue;
            }else if(male <= 0){
                malesStack.pop();
                continue;
            }

            if(female % 25 == 0){
                femaleQueue.poll();
                femaleQueue.poll();
                continue;
            }else if(male % 25 == 0){
                malesStack.pop();
                malesStack.pop();
                continue;
            }

            if(female == male){
                matches ++;
                femaleQueue.poll();
                malesStack.pop();

            }else{
                femaleQueue.poll();
                malesStack.push(malesStack.pop()-2);
            }



        }
        System.out.println("Matches " + matches);
        System.out.println("Males left: " + printDeque(malesStack));
        System.out.println("Females left: " + printDeque(femaleQueue));

    }
    private static String printDeque(ArrayDeque<Integer> deque) {
        if(deque.isEmpty()){
            return "none";
        }else{
            return deque.stream()
                    .map(String::valueOf).collect(Collectors.joining(", "));
        }
    }
}