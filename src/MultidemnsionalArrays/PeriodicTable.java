package MultidemnsionalArrays;

import java.util.*;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> periodicTable = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(" ");
            for (String element : elements) {
                periodicTable.addAll(Arrays.asList(element));
            }

        }
        System.out.println(String.join(" ",periodicTable));

    }
}
