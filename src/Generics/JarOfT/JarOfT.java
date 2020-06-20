package Generics.JarOfT;

import java.util.ArrayDeque;
import java.util.Deque;

public class JarOfT<Type> {
    private Deque<Type> stack;

    public JarOfT(){
        this.stack = new ArrayDeque<>();
    }
    public void add(Type element){
        this.stack.push(element);
    }
    public Type remove(){
        return this.stack.pop();
    }
}
