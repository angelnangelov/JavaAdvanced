package ExamPrep.Third.healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> products;

    public Salad(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getProductCount() {
        return this.products.size();
    }

    public int getTotalCalories() {
        int total = 0;
        for (Vegetable vegetable : this.products) {
            int vegsCalorie = vegetable.getCalories();
            total += vegsCalorie;
        }
        return total;
    }
    public void add(Vegetable product){
        this.products.add(product);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("* Salad ").append(this.name).append(" is ")
                .append(this.getTotalCalories()).append(" calories and have ")
                .append(this.getProductCount()).append(" products:").append(System.lineSeparator());

        for (Vegetable vegetable : products) {
            result.append(vegetable.toString());
            result.append(System.lineSeparator());
        }
        return  result.toString().trim();
    }
}
