package ExamPrep.Third.chrismas;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> presents;


    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.presents = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public int count() {
        return  this.presents.size();
    }

    public void add(Present present) {
        if (this.presents.size() < this.capacity) {
            this.presents.add(present);
        }


    }

    public boolean remove(String name) {
        for (Present present : this.presents) {
            if (present.getName().equals(name)) {
                return true;
            }
        }

        return false;
    }


        public Present heaviestPresent() {
            return this.presents.stream()
                    .max(Comparator.comparing(Present::getWeight))
                    .orElse(null);
        }




    public Present getPresent(String name) {
        return this.presents.stream()
                .filter(customer -> name.equals(customer.getName()))
                .findAny()
                .orElse(null);
    }

    public String report() {
        StringBuilder out = new StringBuilder();

        out.append(String.format("%s bag contains: ",this.getColor()));
        out.append(System.lineSeparator());


        for (Present present : this.presents) {
            out.append(present.toString())
                    .append(System.lineSeparator());
        }

        return out.toString().trim();
    }




    }

