package IteratorsAndComparators;

import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printVarArgs("1","2","3");
    }
    public static  <T> void printVarArgs(T... elements){

        if(elements.length==0){
            System.out.println("No elements");
        }else {

            for (T s : elements) {
                System.out.println(s);
            }
        }
    }
}
