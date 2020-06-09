package MultidemnsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class  IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] first = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                first[row][col] = line[col].charAt(0);
            }
        }
        char[][] second = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                second[row][col] = line[col].charAt(0);
            }
        }

        char[][] outMatrix = new char[rows][cols];

        for (int row = 0; row < first.length; row++) {
            char[] firstArr = first[row];
            char[] secondArr = second[row];
            for (int col = 0; col < firstArr.length; col++) {
                char symbol = firstArr[col] == secondArr[col] ? firstArr[col] : '*';
                outMatrix[row][col] = symbol;
            }

        }
        for (int row = 0; row < outMatrix.length; row++) {

            for (int col = 0; col < outMatrix[row].length; col++) {
                System.out.println(outMatrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] readMatrix(Scanner scanner,int rows,int cols,String pattern){
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            int[] arr = readRowsAndColums(scanner,pattern);
            matrix[r]=arr;
        }
        return matrix;


    }
    private static int[] readRowsAndColums(Scanner scanner,String pattern) {
        return   Arrays.stream(scanner.nextLine()
                .split(pattern)).mapToInt(Integer::parseInt)
                .toArray();
    }
}
