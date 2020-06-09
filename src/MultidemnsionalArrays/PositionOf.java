package MultidemnsionalArrays;

import java.util.Scanner;

public class PositionOf   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols =scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        boolean notFound = true;
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        int number = scanner.nextInt();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if(matrix[row][col]==number){
                    System.out.println(row+ " "+ col);
                    notFound= false;
                }
            }
        }
        if(!notFound){
            System.out.println("notFound");
        }

    }
}
