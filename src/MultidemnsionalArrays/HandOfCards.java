package MultidemnsionalArrays;

import java.util.*;

public class HandOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, LinkedHashSet<String>> players = new LinkedHashMap<>();

        String line = scanner.nextLine();

        while (!line.equals("JOKER")) {
            String[] tokens = line.split(": ");
            String name = tokens[0];
            String[] hand = tokens[1].split(", ");
            if (!players.containsKey(name)) {
                players.put(name, new LinkedHashSet<>());

            }
            for (String s : hand) {
                players.get(name).add(s);
            }


            line = scanner.nextLine();
        }
        players.forEach((k, v) -> {
            int totalPower = 0;
            for (String card : v) {
                totalPower +=
                        findPower(card.substring(0, card.length() - 1)) *
                                getMultiplier(card.substring(card.length() - 1));
            }
            System.out.println(String.format("%S: %d",k,totalPower));

        });
    }

    private static int findPower(String power) {
        switch (power) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
                return 10;
            case "J":
                return 11;
            case "K":
                return 12;
            case "A":
                return 13;
            default:
                return 0;
        }
    }

    private static int getMultiplier(String type) {
        switch (type) {
            case "C":
                return 1;
            case "D":
                return 2;
            case "H":
                return 3;
            case "S":
                return 4;
            default:
                return 0;
        }
    }
}
