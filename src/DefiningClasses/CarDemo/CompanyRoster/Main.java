package DefiningClasses.CarDemo.CompanyRoster;

import DefiningClasses.CarDemo.OpinionPoll.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Deparment> deparments = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String deparmentName = tokens[3];

            Deparment deparment = new Deparment(deparmentName);
            deparments.add(deparment);
            Employee employee = null;
            switch (tokens.length){
                case 4:
                    employee = new Employee(name,salary,position,deparment);
                    break;
                case 5:
                    try {
                     int age =   Integer.parseInt(tokens[4]);
                     employee = new Employee(name,salary,position,deparment,age);
                    }catch (NumberFormatException e){

                        employee = new Employee(name,salary,position,deparment,tokens[4]);

                    }
                    break;
                default:
                    employee = new Employee(name,salary,position,deparment,tokens[4],Integer.parseInt(tokens[5]));
                    break;


            }
            for (int j =0;j<deparments.size();j++) {
                if(employee.getDeparment().getName().equals(deparments.get(j).getName())){
                    List<Employee> employees = deparments.get(j).getEmployees();
                    employees.add(employee);
                    deparments.get(j).setEmployees(employees);
                }

            }

        }
    }
}
