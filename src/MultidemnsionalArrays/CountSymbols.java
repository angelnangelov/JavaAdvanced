package MultidemnsionalArrays;

import java.util.Scanner;
import java.util.*;
public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character,Integer> dictionary = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if(!dictionary.containsKey(symbol)){
                dictionary.put(symbol,1);
            }else{
                int count =dictionary.get(symbol) +1;
                dictionary.put(symbol,count);
            }
        }
        for (Map.Entry<Character, Integer> entry : dictionary.entrySet()) {
            System.out.println(String.format("%c: %d time/s ",entry.getKey(),entry.getValue()));
        }
    }
}
