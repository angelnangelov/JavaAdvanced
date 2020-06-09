package SetsAndMapsAdvanced;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        Set<String> strings = new HashSet<>();
        Collections.addAll(strings,input);
        for (String string : strings) {
            System.out.println(string);
        }

        Set<Integer> numbers = new TreeSet<>();

        for (int i = 9; i >=0; i--) {
            numbers.add(i);
        }

        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("a",1);
        hashMap.put("b",1);
        hashMap.keySet().forEach(System.out::println);

        numbers.forEach(System.out::println);
    }
}
