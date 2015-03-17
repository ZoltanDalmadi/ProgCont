import java.util.Scanner;

public class LeeDistance {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {

      int Q = s.nextInt();
      int N = s.nextInt();

      String[] dic = new String[N];

      for (int i = 0; i < N; i++) {
        dic[i] = s.next();
      }

      int minLee = getLeeDistance(dic[0], dic[1], Q);

      for (int i = 0; i < N; i++) {
        for (int j = i + 1; j < N; j++) {
          int ml = getLeeDistance(dic[i], dic[j], Q);

          if (ml < minLee) {
            minLee = ml;
          }
        }
      }

      System.out.println(minLee);
    }

  }

  public static int getLeeDistance(String s1, String s2, int q) {
    int result = 0;

    for (int i = 0; i < s1.length(); i++) {
      int xi = Integer.parseInt(String.valueOf(s1.charAt(i)));
      int yi = Integer.parseInt(String.valueOf(s2.charAt(i)));
      int xy = Math.abs(xi - yi);
      result += Math.min(xy, q - xy);
    }

    return result;
  }

}
