import java.util.Scanner;
import java.util.StringJoiner;

public class MatrixOperations {

  static class Matrix {

    private int m_rows;
    private int m_cols;
    private int[][] m_data;

    public Matrix(int rows, int cols) {
      this.m_rows = rows;
      this.m_cols = cols;
      this.m_data = new int[rows][cols];
    }

    public Matrix transpose() {
      Matrix result = new Matrix(m_cols, m_rows);

      for (int col = 0; col < m_cols; col++) {
        for (int row = 0; row < m_rows; row++) {
          result.m_data[col][row] = m_data[row][col];
        }
      }

      return result;
    }

    public Matrix multiply(Matrix rhs) {
      Matrix result = new Matrix(m_rows, rhs.m_cols);

      for (int row = 0; row < m_rows; row++) {
        for (int col = 0; col < rhs.m_cols; col++) {
          for (int i = 0; i < m_cols; i++) {
            result.m_data[row][col] += m_data[row][i] * rhs.m_data[i][col];
          }
        }
      }

      return result;
    }

  }

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {

      while (s.hasNextLine()) {
        int rows = s.nextInt();
        int cols = s.nextInt();
        s.nextLine();

        Matrix mat = new Matrix(rows, cols);

        for (int row = 0; row < rows; row++) {
          for (int col = 0; col < cols; col++) {
            mat.m_data[row][col] = s.nextInt();
          }
        }

        s.nextLine();

        Matrix transposed = mat.transpose();
        Matrix AAT = mat.multiply(transposed);

        StringJoiner sj = new StringJoiner(" ");

        for (int row = 0; row < AAT.m_rows; row++) {
          for (int col = 0; col < AAT.m_cols; col++) {
            sj.add(String.valueOf(AAT.m_data[row][col]));
          }
        }

        System.out.println(sj);
      }
    }
  }

}
