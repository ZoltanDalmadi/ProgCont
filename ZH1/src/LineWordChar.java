import java.util.ArrayList;
import java.util.Scanner;

public class LineWordChar {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String toSearch = s.nextLine();

    ArrayList<String> lines = new ArrayList<>();

    while (s.hasNext()) {
      lines.add(s.nextLine());
    }

    int contains = 0;
    int allWords = 0;
    int allChars = 0;

    for (String line : lines) {
      if (line.contains(toSearch)) {
        contains++;
        String[] words = line.split(" ");
        allWords += words.length;
        allChars += line.length();
      }
    }

    System.out.printf("%d %d %d\n", contains, allWords, allChars);

  }

}