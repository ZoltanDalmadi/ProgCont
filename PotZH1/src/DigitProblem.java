import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitProblem {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    List<String[]> cases = new ArrayList<>();

    while (!s.hasNext("0")) {
      int numOfTables = s.nextInt();
      String[] tables = new String[numOfTables];

      for (int i = 0; i < tables.length; i++) {
        tables[i] = s.next();
      }

      cases.add(tables);
    }

    s.close();

    for (String[] tables : cases) {
      int[] digits = new int[10];

      for (String table : tables) {
        for (int i = 0; i < table.length(); i++) {
          digits[Integer.parseInt(String.valueOf(table.charAt(i)))]++;
        }
      }

      System.out.printf("%d %d %d %d %d %d %d %d %d %d\n",
          digits[0], digits[1], digits[2], digits[3], digits[4],
          digits[5], digits[6], digits[7], digits[8], digits[9]);
    }

  }
}
