import java.util.Scanner;

public class Hamming {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int numItems = s.nextInt();

    String[] dic = new String[numItems];

    for (int i = 0; i < numItems; i++) {
      dic[i] = s.next();
    }

    s.close();

    int minHamming = getHammingDistance(dic[0], dic[1]);

    for (int i = 0; i < numItems; i++) {
      for (int j = i + 1; j < numItems; j++) {
        int h = getHammingDistance(dic[i], dic[j]);

        if (h < minHamming)
          minHamming = h;
      }
    }

    System.out.println(minHamming);
  }

  public static int getHammingDistance(String s1, String s2) {
    int result = 0;

    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) != s2.charAt(i))
        result++;
    }

    return result;
  }
}