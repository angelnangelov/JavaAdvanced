package WorkShopDataStructures.ArrayListOnlyIntegers;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();

        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            smartArray.add(random.nextInt(1000));
        }
        int sum =0;
        for (int i = 0; i < 10; i++) {
            sum+= smartArray.get(i);
        }
        System.out.println(sum);
    }
}
