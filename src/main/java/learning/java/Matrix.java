package learning.java;

public final class Matrix {
    private final double[][] matrix;

    public Matrix(int raws, int cols) {
        this.matrix = new double[raws][cols];
    }

    public Matrix(int size) {
        this(size, size);
    }

    public double getBy(int i, int j) {
        return matrix[i][j];
    }

    public void setBy(int i, int j, double value) {
        matrix[i][j] = value;
    }

    public int raws() {
        return matrix.length;
    }

    public int cols() {
        return matrix[0].length;
    }

    public boolean isDiagonal() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }


}
