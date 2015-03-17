import java.util.Scanner;
import java.util.StringJoiner;

public class Matrix {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int N = s.nextInt();
    int M = s.nextInt();

    int[][] mat = new int[N][M];

    for (int row = 0; row < N; row++) {
      for (int col = 0; col < M; col++) {
        mat[row][col] = s.nextInt();
      }
    }

    s.close();

    double averages[] = new double[M];

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        averages[col] += mat[row][col];
      }
    }

    for (int i = 0; i < M; i++) {
      averages[i] /= (double) N;
    }

    StringJoiner sj = new StringJoiner(" ");

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (mat[row][col] == averages[col]) {
          sj.add(String.valueOf(col + 1));
          break;
        }
      }
    }

    System.out.println(sj);
  }

}
