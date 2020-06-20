package Generics.GenericSwapMethodString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Box> boxes = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            boxes.add(new Box<>(Double.parseDouble(reader.readLine())));
        }
        int[] indexes = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        swapElements(boxes,indexes[0],indexes[1]);
        for (Box<Integer> box : boxes) {
            System.out.println(box);
        }


    }
    public static <E> void swapElements(List<E> list,int firstIndex , int secondIndex){
        E firstElement = list.get(firstIndex);
        E secondELlement = list.get(secondIndex);
        list.set(firstIndex,secondELlement);
        list.set(secondIndex,firstElement);

    }
}
