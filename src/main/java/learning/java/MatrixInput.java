package learning.java;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MatrixInput {
    private final Matrix matrix;
    private final Scanner scanner;

    public void read() {
        for (int i = 0; i < matrix.raws(); i++) {
            System.out.println("Enter elements of " + (i + 1) + " row (separated by spaces): ");
            for (int j = 0; j < matrix.cols(); j++) {
                matrix.setBy(i, j, scanner.nextDouble());
            }
        }
    }
}
