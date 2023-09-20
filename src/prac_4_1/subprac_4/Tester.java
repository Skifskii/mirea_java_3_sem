package prac_4_1.subprac_4;

public class Tester {
    public static void main(String[] args) {
        double[][] matrix_array_1 = {
                {1.1, 1.2, 1.3},
                {2.1, 2.2, 2.3},
                {3.1, 3.2, 3.3}
        };

        double[][] matrix_array_2 = {
                {1.2, 2.3, 3.4},
                {4.5, 5.6, 6.7},
                {7.8, 8.9, 9.0}
        };

        Matrix matrix_1 = new Matrix(3, 3, matrix_array_1);
        Matrix matrix_2 = new Matrix(3, 3, matrix_array_2);

        Matrix matrix_3 = matrix_1.summa(matrix_2);
        matrix_3.printMatrix();

        matrix_3.multiplication(-1);
        matrix_3.printMatrix();
    }
}
