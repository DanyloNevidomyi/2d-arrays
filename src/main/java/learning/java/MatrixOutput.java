package learning.java;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MatrixOutput {
    private final Matrix matrix;

    public void display() {
        System.out.println("Entered matrix:");
        for (int i = 0; i < matrix.raws(); i++) {
            for (int j = 0; j < matrix.cols(); j++) {
                System.out.print(matrix.getBy(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void displayDiagonalTrait () {
        if (matrix.isDiagonal()) {
            System.out.println("Matrix is diagonal!");
        } else {
            System.out.println("Matrix is NOT diagonal :(");
        }
    }
}
