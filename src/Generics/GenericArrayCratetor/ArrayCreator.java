package Generics.GenericArrayCratetor;

import java.lang.reflect.Array;


public class ArrayCreator {
    public static<T> T[] create(int lenght,T item){
        return (T[]) Array.newInstance(item.getClass(),lenght);
    }


}
