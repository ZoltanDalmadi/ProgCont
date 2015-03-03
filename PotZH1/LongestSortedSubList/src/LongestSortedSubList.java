import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestSortedSubList {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    List<String[]> stringList = new ArrayList<>();

    while (!s.hasNext("\\[\\]")) {
      String line = s.nextLine();
      stringList.add(line.substring(1, line.length() - 1).split(", "));
    }

    s.close();

    for (String[] st : stringList) {
      int length = 1;
      int maxLength = 1;

      for (int i = 0; i < st.length - 1; i++) {
        if (st[i].compareTo(st[i + 1]) < 0) {
          length++;

          if (maxLength < length) {
            maxLength = length;
          }

        } else {
          length = 1;
        }
      }

      System.out.println(maxLength);
    }

  }

}
