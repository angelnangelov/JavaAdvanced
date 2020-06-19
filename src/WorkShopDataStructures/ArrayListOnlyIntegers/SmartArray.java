package WorkShopDataStructures.ArrayListOnlyIntegers;

public class SmartArray {

    private int[] elements;
    private int index;

    public SmartArray(){

        this.elements = new int[10];
        this.index =0;
    }

    public void add(int number){
        if(index == this.elements.length) {
            int[] newElements = new int[this.elements.length+1];
            for (int i = 0; i < this.elements.length; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
        this.elements[index] = number;
        index++;
    }

    public int get(int number){
        return this.elements[index];
    }
}
