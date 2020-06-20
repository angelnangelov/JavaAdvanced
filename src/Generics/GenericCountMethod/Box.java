package Generics.GenericCountMethod;

public class Box<E extends  Comparable<E>> implements  Comparable<E> {
    private E data;

    public Box(E data){
        this.data=data;
    }

    @Override
    public String toString() {
        return this.data.getClass().getName() + ": " + this.data;
    }

    @Override
    public int compareTo(E o) {
        return  this.data.compareTo(o);
    }

    public E getData() {
        return data;
    }
}
