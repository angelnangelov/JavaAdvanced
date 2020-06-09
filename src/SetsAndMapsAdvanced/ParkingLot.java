package SetsAndMapsAdvanced;

import java.util.HashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashSet<String> registrationNumbers = new HashSet<>();


        while(!input.equals("END")){
            String command = input.substring(0,input.indexOf(","));
            String registration = input.substring(input.indexOf(",")+2);

            if(command.equals("IN")){
                registrationNumbers.add(registration);
            }else
                registrationNumbers.remove(registration);
            input = scanner.nextLine();
        }
        if(registrationNumbers.isEmpty()){
            System.out.println("Parking is empty");
        }else {
            for (String registrationNumber : registrationNumbers) {
                System.out.println(registrationNumber);
            }
        }
    }
}
