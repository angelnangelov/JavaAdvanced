package DefiningClasses.CarDemo;

import java.util.*;

public class Car {
    private String brand;
    private String model;
    private Integer horsePower;
    private List<Part> parts;

    public Car(String brand, String model, Integer horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.parts = new ArrayList<>();
    }
    public void addPart(Part part){
        this.parts.add(part);
    }
    public void carInfo(){
        System.out.println(getBrand() + " " + getModel() + " " + getHorsePower());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public int increaseHP(int value){
        this.horsePower+=value;
        return value;
    }
}
