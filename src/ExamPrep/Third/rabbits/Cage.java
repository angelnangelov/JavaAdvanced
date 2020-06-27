package ExamPrep.Third.rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    List<Rabbit> rabbits;

    public Cage(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
        this.rabbits = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit){
        if(this.capacity>this.rabbits.size()){
            rabbits.add(rabbit);
        }

    }
    public boolean removeRabbit(String name){
       return rabbits.removeIf(rabbit -> rabbit.getName().equals(name));
    }

    public void removeSpecies(String species){
        rabbits.removeIf(rabbit -> rabbit.getSpecies().equals(species));
    }
    public Rabbit sellRabbit(String name){
        for (Rabbit rabbit : rabbits) {
            if(rabbit.getName().equals(name)){
                rabbit.setAvailable(false);
                return rabbit;
            }
        }
        return null;
    }

    public List<Rabbit> sellRabbitBySpecies(String species) {
        List<Rabbit> speciesa = new ArrayList<>();
        for (Rabbit rabbit : rabbits) {
            if(rabbit.getSpecies().equals(species)){
                speciesa.add(rabbit);
            }
            
        }
        this.rabbits.removeAll(speciesa);
        return speciesa;
        
    }
    public int count(){
       return this.rabbits.size();
    }
    public String report(){
    //o	"Rabbits available at {cageName}:
        //{Rabbit 1}
        //{Rabbit 2}
        //(…)"
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Rabbits available at %s:",this.getName())).append(System.lineSeparator());
        for (Rabbit rabbit : rabbits) {
            sb.append(rabbit.toString()).append(System.lineSeparator());
        }
        return sb.toString();



    }
}
