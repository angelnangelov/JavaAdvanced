package MultidemnsionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readRowsAndColums(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] firstMatrix = readMatrix(scanner,rows,cols," ");

        dimensions = readRowsAndColums(scanner);
         rows = dimensions[0];
         cols = dimensions[1];
        int[][] secondMatrix = readMatrix(scanner,rows,cols," ");



        boolean areEqual = compareMatrices(firstMatrix,secondMatrix);
        if(areEqual) {
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        System.out.println();

    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if(firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {

            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            if(firstArr.length != secondArr.length){
                return false;
            }
            for (int col = 0; col < firstArr.length; col++) {
                int firstElement = firstArr[col];
                int secondElement =secondArr[col];
                if(firstElement!=secondElement){
                    return false;
                }

            }
        }
        return true;

    }

    //zapulvane na matrica
    public static int[][] readMatrix(Scanner scanner,int rows,int cols,String pattern){
        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            int[] arr = readRowsAndColums(scanner);
            matrix[r]=arr;
        }
        return matrix;


    }

    private static int[] readRowsAndColums(Scanner scanner) {
      return   Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
    }
}
