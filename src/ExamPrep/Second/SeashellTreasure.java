package ExamPrep.Second;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SeashellTreasure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[][] beach = new String[n][];
        for (int i = 0; i < beach.length; i++) {
            beach[i] = scan.nextLine().split("\\s+");
        }
        List<String> collectedShells = new LinkedList<>();
        int stolenShells = 0;
        String input = scan.nextLine();
        while (!"Sunset".equals(input)) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            switch (command) {
                case "Collect":
                    if (isValidIndex(row, col, beach)) {
                        String shell = beach[row][col];
                        if (!shell.equals("-")) {
                            collectedShells.add(shell);
                            beach[row][col] = "-";
                        }
                    }
                    break;
                case "Steal":
                    String direction = tokens[3];
                    if (isValidIndex(row, col, beach)) {
                        String shell = beach[row][col];
                        if (!shell.equals("-")) {
                            stolenShells++;
                            beach[row][col] = "-";
                        }
                        stolenShells += stealing(beach, row, col, direction);
                    }
                    break;
            }

            input = scan.nextLine();
        }

        printMatrix(beach);
        System.out.print(String.format("Collected seashells: %d", collectedShells.size()));
        if (!collectedShells.isEmpty()) {
            System.out.print(" -> ");
            System.out.println(String.join(", ", collectedShells));
        } else {
            System.out.println();
        }

        System.out.println(String.format("Stolen seashells: %d", stolenShells));
    }

    private static int stealing(String[][] beach, int row, int col, String direction) {
        int counter = 0;
        switch (direction) {
            case "up":
                for (int i = row; i >= row - 3; i--) {
                    counter = getCounter(beach, i, counter, col);
                }
                break;
            case "down":
                for (int i = row; i <= row + 3; i++) {
                    counter = getCounter(beach, i, counter, col);
                }
                break;
            case "left":
                for (int i = col; i >= col - 3; i--) {
                    counter = getCounter(beach, row, counter, i);
                }
                break;
            case "right":
                for (int i = col; i <= col + 3; i++) {
                    counter = getCounter(beach, row, counter, i);
                }
                break;
        }
        return counter;
    }

    private static int getCounter(String[][] beach, int row, int counter, int i) {
        if (isValidIndex(row, i, beach)) {
            String shell = beach[row][i];
            if (!shell.equals("-")) {
                counter++;
                beach[row][i] = "-";
            }
        }
        return counter;
    }

    private static boolean isValidIndex(int row, int col, String[][] beach) {
        if (row >= 0 && row < beach.length) {
            if (col >= 0 && col < beach[row].length) {
                return true;
            }
        }
        return false;
    }

    private static void printMatrix(String[][] beach) {
        for (String[] row : beach) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}