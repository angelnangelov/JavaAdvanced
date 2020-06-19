package DefiningClasses.CarDemo;

import DefiningClasses.CarDemo.Car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Chevrolete","Something",121);
        Part part = new Part();
        car.addPart(part);



        int maxHorsePower = 500;
        int increasedHP = car.increaseHP(3000);
        if (maxHorsePower < increasedHP) {
            System.out.println("Your car is too Fast,HP back to normal");
            int carHP = car.getHorsePower();
            car.setHorsePower(carHP - increasedHP);
        }

        car.carInfo();
        }
    }

