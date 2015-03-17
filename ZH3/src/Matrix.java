import java.util.Scanner;
import java.util.StringJoiner;

public class Matrix {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
      int N = s.nextInt();
      int M = s.nextInt();

      int[][] mat = new int[N][M];

      for (int row = 0; row < N; row++) {
        for (int col = 0; col < M; col++) {
          mat[row][col] = s.nextInt();
        }
      }

      int positives[] = new int[M];
      int negatives[] = new int[M];

      for (int col = 0; col < M; col++) {
        for (int row = 0; row < N; row++) {
          if (mat[row][col] > 0) {
            positives[col]++;
          } else if (mat[row][col] < 0) {
            negatives[col]++;
          }
        }
      }

      StringJoiner sj = new StringJoiner(" ");

      for (int i = 0; i < M; i++) {
        if (positives[i] > negatives[i]) {
          sj.add(String.valueOf(i + 1));
        }
      }

      System.out.println(sj);
    }
  }

}
