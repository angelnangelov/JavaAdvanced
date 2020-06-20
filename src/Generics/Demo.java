package Generics;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static class ListUtils {
        public static <T extends  Comparable<T>> T getMax(Collection<T> collection){
            return collection.stream().max(T::compareTo).orElse(null);
        }
        public static <T extends  Comparable<T>> T getMin(Collection<T> collection){
            return collection.stream().min(T::compareTo).orElse(null);
        }
        public static <T extends Comparable<T>>  void sort(List<T> collection){
           Collections.sort(collection);
        }
    }
    public static class Cat extends Animal{

    }
    public static class Dog extends  Animal{

    }
    public static class Car{

    }
    public static  class Person implements Comparable {
        public int rating;

        public int compareTo(Person other) {
            return  Integer.compare(this.rating,other.rating);
        }


        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
    public static class Scale<T extends  Comparable<T>>{
        T left;
        T right;

        Scale(T left, T right){
            this.left = left;
            this.right = right;
        }
        T getHeavier(){
           int result = this.left.compareTo(right);
           if(result == 0){
               return null;
           }
           if(result>0){
               return this.left;

           }
           else return this.right;
        }
    }
    public static void main(String[] args) {
        AnimalList<Animal> animals = new AnimalList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        Scale<String> scale = new Scale<>("Angel","a");
        System.out.println(scale.getHeavier());

        List<Person> people = new ArrayList<>();
        ListUtils.sort(people);
    }
}
