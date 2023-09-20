package prac_4_1.subprac_4;

public class Matrix {
    private double[][] matrix;
    private int raws;
    private int cols;

    public Matrix() {

    }

    public Matrix(int raws, int cols, double[][] matrix) {
        this.raws = raws;
        this.cols = cols;
        this.matrix = matrix;
    }

    public Matrix summa(Matrix matrix_b) {
        double [][] summa_matrix = new double[this.raws][this.cols];
        for (int raw=0; raw<this.raws; raw++) {
            for (int col=0; col<this.cols; col++) {
                summa_matrix[raw][col] = this.matrix[raw][col] + matrix_b.matrix[raw][col];
            }
        }
        return new Matrix(raws, cols, summa_matrix);
    }

    public void multiplication(double x) {
        for (int raw=0; raw<this.raws; raw++) {
            for (int col = 0; col < this.cols; col++) {
                this.matrix[raw][col] = this.matrix[raw][col] * x;
            }
        }
    }

    public void printMatrix() {
        System.out.println("Матрица " + this.raws + "x" + this.cols);
        for (int raw=0; raw<this.raws; raw++) {
            for (int col = 0; col < this.cols; col++) {
                System.out.print(this.matrix[raw][col] + " ");
            }
            System.out.print("\n");
        }
    }
}
