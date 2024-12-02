package learning.java;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter length of your matrix: ");
            int matrixLength = scanner.nextInt();

            Matrix matrix = new Matrix(matrixLength);
            MatrixInput input = new MatrixInput(matrix, scanner);
            input.read();

            MatrixOutput output = new MatrixOutput(matrix);

            output.display();

            output.displayDiagonalTrait();
        }
    }
}
