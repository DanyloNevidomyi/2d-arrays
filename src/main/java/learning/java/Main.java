package learning.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // entering length of matrix
        System.out.println("Enter length of your matrix: ");
        int matrix_length = scanner.nextInt();

        double[][] matrix = new double[matrix_length][matrix_length];

        // entering matrix elements
        for (int i = 0; i < matrix_length; i++) {
            System.out.println("Enter elements of " + (i + 1) + " raw (separated by spaces): ");
            for (int j = 0; j < matrix_length; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // show entered matrix
        System.out.println("Entered matrix:");
        for (int i = 0; i < matrix_length; i++) {
            for (int j = 0; j < matrix_length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // check if matrix diagonal
        boolean isDiagonal = true;
        for (int i = 0; i < matrix_length; i++) {
            for (int j = 0; j < matrix_length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    isDiagonal = false;
                    break;
                }
            }
            if (!isDiagonal) {
                break;
            }
        }

        // show result
        if (isDiagonal) {
            System.out.println("Matrix is diagonal!");
        } else {
            System.out.println("Matrix is NOT diagonal :(");
        }
    }
}