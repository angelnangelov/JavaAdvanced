package ExamPrep.Third.healthyHeaven;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Salad> data;
    private String name;

    public Restaurant(String name){
        this.name=name;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(Salad salad) {
        this.data.add(salad);
    }

    public Salad getHealthiestSalad() {
        for (Salad salad : data) {
            int max = 101021190;
            if(salad.getTotalCalories()<max){
                max = salad.getTotalCalories();
                return salad;
            }
        }
        return null;
    }
    public String generateMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s have %d salads:",this.getName(),this.data.size()));
        sb.append(System.lineSeparator());

        for (Salad salad : data) {
           sb.append(salad.toString()) ;
           sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }



    public boolean buy(String salad) {
       return data.removeIf(salad1 -> salad1.getName().equals(salad));
    }
}
