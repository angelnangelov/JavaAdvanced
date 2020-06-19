package DefiningClasses.CarDemo.SpeedRacing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            Car car = new Car(input[0],
                    Double.parseDouble(input[1])
                    , Double.parseDouble(input[2]));
            cars.add(car);

        }
        String line = scanner.nextLine();
        while(!line.equals("End")){
            String[] tokens = line.split(" ");
            String model = tokens[0];
            int distance = Integer.parseInt(tokens[2]);

            for (Car car : cars) {
                if(car.getModel().equals(model)){
                  if( car.canMove(distance)){
                      car.setDistanceTravelled(car.getDistanceTravelled()+distance);
                      double fuelToRemove = car.getFuelCostForKm() * distance;
                      car.setFuelAmount(car.getFuelAmount()-fuelToRemove);
                  }else{
                      System.out.println("Insf Fuel");
                  }

                }
                
            }

            line = scanner.nextLine();
        }
        cars
        .stream().forEach(car -> System.out.println(car.getModel() + " " + car.getFuelAmount()+ " " + car.getDistanceTravelled()));
        System.out.println();
    }
}
