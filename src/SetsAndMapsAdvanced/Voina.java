package SetsAndMapsAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO CHETENE NA SET ON KONZOLATA
        Set<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Set<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;
        while(rounds-- > 0){
            Iterator<Integer> firstIterator = firstPlayer.iterator();
            int firstCard = firstIterator.next();
            firstIterator.remove();
            Iterator<Integer> secondIterator = secondPlayer.iterator();
            int secondCard = secondIterator.next();
            secondIterator.remove();

            if(firstCard>secondCard){
                firstPlayer.addAll(Arrays.asList(firstCard,secondCard));
            }else{
                secondPlayer.addAll(Arrays.asList(firstCard,secondCard));
            }
            if(firstPlayer.size()<secondPlayer.size()){
                System.out.println("Second Player wins");
                break;
            }else if(firstPlayer.size()>secondPlayer.size()){
                System.out.println("First Player wins");
                break;
            }
        }
        if(firstPlayer.size() == secondPlayer.size()){
            System.out.println("Draw");
        }

    }
}
