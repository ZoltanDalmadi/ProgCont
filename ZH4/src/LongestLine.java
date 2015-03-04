import java.util.ArrayList;
import java.util.Scanner;

public class LongestLine {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<String> lines = new ArrayList<>();

    while (s.hasNextLine()) {
      lines.add(s.nextLine());
    }

    s.close();

    int longest = lines.get(0).length();

    for (String line : lines) {
      int l = line.length();

      if (l > longest) {
        longest = l;
      }
    }

    for (int i = 0; i < lines.size(); i++) {
      int l = lines.get(i).length();

      if (l == longest) {
        int words = lines.get(i).split(" ").length;
        System.out.printf("%d: %d %d\n", i + 1, words, l);
      }
    }
  }

}
