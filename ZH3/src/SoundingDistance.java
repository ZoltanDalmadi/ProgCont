import java.util.Scanner;

public class SoundingDistance {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {

      int numOfWords = s.nextInt();

      String[] dic = new String[numOfWords];

      for (int i = 0; i < numOfWords; i++) {
        dic[i] = s.next();
      }

      int maxSoundingDistance = getSoundingDistance(dic[0], dic[1]);

      for (int i = 0; i < numOfWords; i++) {
        for (int j = i + 1; j < numOfWords; j++) {
          int sd = getSoundingDistance(dic[i], dic[j]);

          if (sd > maxSoundingDistance) {
            maxSoundingDistance = sd;
          }
        }
      }

      System.out.println(maxSoundingDistance);
    }

  }

  public static int getSoundingDistance(String s1, String s2) {
    int result = 0;

    int shorter = Math.min(s1.length(), s2.length());
    int longer = Math.max(s1.length(), s2.length());

    for (int i = 0; i < shorter; i++) {
      if (s1.charAt(i) != s2.charAt(i)) {
        boolean b1 = isVowel(s1.charAt(i));
        boolean b2 = isVowel(s2.charAt(i));

        if (b1 && b2) {
          result++;
        } else if ((b1 && !b2) || (!b1 && b2)) {
          result += 10;
        } else {
          result += 5;
        }
      }
    }

    result += longer - shorter;

    return result;
  }

  public static boolean isVowel(char c) {
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }
}
