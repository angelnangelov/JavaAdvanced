package Generics.GenericCountMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box> boxes = new ArrayList<>();

            for (int i = 0; i <n; i++) {
                boxes.add(new Box<>(Double.parseDouble(scanner.nextLine())));
        }
            Box<Double> compareWith = new Box<>(Double.parseDouble(scanner.nextLine()));

        System.out.println(genericCount(boxes,compareWith));


    }
    private  static  int genericCount(List<Box> list , Box<Double> target){
        int count = 0;
        for (Box<Double> e : list) {
            if(e.compareTo(target.getData())>0){
                count ++;
            }
        }
        return count;

    }
}
