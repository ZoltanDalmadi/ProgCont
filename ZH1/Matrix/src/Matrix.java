import java.util.Scanner;

public class Matrix {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int M = s.nextInt();

    double[][] mat = new double[N][M];

    // fill matrix
    for (int row = 0; row < N; row++) {
      for (int col = 0; col < M; col++) {
        mat[row][col] = s.nextDouble();
      }
    }

    // calculate averages of columns
    double averages[] = new double[M];

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        averages[col] += mat[row][col];
      }
    }

    for (int i = 0; i < M; i++) {
      averages[i] /= (double) N;
    }

    // print columns that contain average value
    StringBuilder sb = new StringBuilder();

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (mat[row][col] == averages[col]) {
          sb.append(col + 1).append(" ");
        }
      }
    }

    sb.deleteCharAt(sb.length() - 1);
    System.out.println(sb.toString());
  }

}
