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

    int[] nulls = new int[M];

    for (int col = 0; col < M; col++) {
      for (int row = 0; row < N; row++) {
        if (mat[row][col] == 0) {
          nulls[col]++;
        }
      }
    }

    int maxNulls = nulls[0];

    for (int i = 1; i < M; i++) {
      if (nulls[i] > maxNulls) {
        maxNulls = nulls[i];
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < M; i++) {
      if (nulls[i] == maxNulls) {
        sb.append(i + 1).append(" ");
      }
    }

    System.out.println(sb.toString().trim());
  }

}
