package Generics.CustomListSorter;

import java.util.ArrayList;
import java.util.Collections;

public class Box<T extends Comparable<T>> {
    ArrayList<T> arr = new ArrayList<>();

    public void addInfo (T element) {
        this.arr.add(element);
    }

    public void remove (int element) {
        this.arr.remove(element);
    }

    public void contains (T element) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(element)) {
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }

    public void swap (int index, int index1) {
        Collections.swap(arr,index, index1);
    }

    public void greater (T element) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).compareTo(element) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public T getMax() {
        T maxElement = this.arr.get(0);
        for (T element : this.arr) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public T getMin() {
        T minElement = this.arr.get(0);
        for (T element : this.arr) {
            if (element.compareTo(minElement) < 0) {
                minElement = element;
            }
        }
        return minElement;
    }

    public void sort () {
        Collections.sort(arr);
    }


    public void print() {
        arr.stream().forEach(e -> System.out.println(e));
    }
}
