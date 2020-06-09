package MultidemnsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllElementsOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = readRowsAndColums(scanner, " ");
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = readMatrix(scanner,rows,cols,", ");
        int sum =0;
        for (int[] arr : matrix) {
            for (int numb : arr) {
                sum+=numb;
            }
        }

        System.out.println(sum);

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
