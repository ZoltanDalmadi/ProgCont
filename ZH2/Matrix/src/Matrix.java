import java.util.Scanner;

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

    int positives[] = new int[M];

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (mat[row][col] > 0) {
          positives[col]++;
        }
      }
    }

    int minPositive = positives[0];

    for (int i = 0; i < M; i++) {
      if (positives[i] < minPositive) {
        minPositive = positives[i];
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
      if (positives[i] == minPositive) {
        sb.append(i + 1).append(" ");
      }
    }

    System.out.println(sb.toString().trim());
  }

}
