package com.company.StacksAndQueues;

import javax.xml.namespace.QName;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1:03/
        String[] inputRobots = scanner.nextLine().split(";");
        Map<String, Integer> robots = splitRobottsDataIntoLinkedMap(inputRobots);
        int[] processTimes = new int[robots.size()];
        String inputTime = scanner.nextLine();
        if(inputTime.length()==7){
            inputTime ="0" + inputTime;
        }
        LocalTime time = LocalTime.parse(scanner.nextLine());

        ArrayDeque<String> producs = new ArrayDeque<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {
            producs.add(line);
            line = scanner.nextLine();
        }
        while (!producs.isEmpty()) {
            time = time.plusSeconds(1);

            String current = producs.poll();
            decreeseProcessTime(processTimes);

                if(!assingJob(robots, processTimes,current,time)){
                producs.offer(current);
            }

        }
    }

    private static void decreeseProcessTime(int[] processTimes) {
        for (int i = 0; i < processTimes.length; i++) {
            if(processTimes[i]>0){
                --processTimes[i];
            }
        }
    }

    private static boolean assingJob(Map<String, Integer> robots, int[] processTimes, String current, LocalTime totalSeconds) {
        for (int i = 0; i < processTimes.length; i++) {
            if (processTimes[i] == 0) {
                String robotName = "";
                int count = 0;
                for (Map.Entry<String, Integer> entry : robots.entrySet()) {
                    if (count == i) {
                        processTimes[i] = entry.getValue();
                        logJobAssigned(entry.getKey(),current, totalSeconds);

                        return true;
                    }
                    count++;

                }

            }
        }
        return false;
    }

    private static void logJobAssigned(String name, String product,  LocalTime totalSeconds) {

        String format = totalSeconds.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(String.format("%s - %s [%s]",name,product,format));
    }

    private static Map<String, Integer> splitRobottsDataIntoLinkedMap(String[] inputRobots) {
        Map<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < inputRobots.length; i++) {
            String line = inputRobots[i];
            int index = line.indexOf("-");

            String name = line.substring(0, index);
            int time = Integer.parseInt(line.substring(index + 1));

            robots.put(name, time);

        }
        return robots;
    }


}
