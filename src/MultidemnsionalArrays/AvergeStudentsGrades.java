package MultidemnsionalArrays;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AvergeStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentsWithGrades = new TreeMap<>();
        while(n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            studentsWithGrades.putIfAbsent(name,new ArrayList<>());
            studentsWithGrades.get(name).add(grade);

        }
        for (Map.Entry<String, List<Double>> entry : studentsWithGrades.entrySet()) {
            System.out.println(String.format("%s -> %s (avg: %.2f) ",entry.getKey(),getGradesAsString(entry.getValue()),
                    getAvgGrade(entry.getValue())));
        }
    }

    private static Double getAvgGrade(List<Double> grades) {
        return grades.stream().mapToDouble(g->g).average().orElse(0.00);
    }

    private static String getGradesAsString(List<Double> value) {
        return value.stream().map(grade->String.format("%.2f",grade))
                .collect(Collectors.joining(" "));
    }
}
