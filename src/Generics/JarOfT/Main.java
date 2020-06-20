package Generics.JarOfT;

import Generics.JarOfT.JarOfT;

public class Main {
    public static void main(String[] args) {
     JarOfT<Integer> jar = new JarOfT<>();
     jar.add(1);
     jar.remove();
     jar.add(1102);
        System.out.println();
        JarOfT<String> jar1 = new JarOfT<>();
        jar1.add("a");

    }
}
