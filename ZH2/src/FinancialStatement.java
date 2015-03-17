import java.util.Locale;
import java.util.Scanner;

public class FinancialStatement {

  public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {

      int cities = s.nextInt();
      s.nextLine();

      String[] lines = new String[cities];

      for (int i = 0; i < cities; i++) {
        lines[i] = s.nextLine();
      }

      double sum = 0;
      double avg = 0;
      int numOfValues = 0;
      int na = 0;

      for (int i = 0; i < cities; i++) {
        String junk = lines[i].split(":")[1].trim();

        if (isNumeric(junk)) {
          sum += Double.parseDouble(junk);
          numOfValues++;
        } else {
          na++;
        }
      }

      if (numOfValues != 0) {
        avg = sum / numOfValues;
      }

      System.out.println(String.format(Locale.US, "Sum: %.2f", sum));

      if (avg == 0) {
        System.out.println("Avg: N/A");
      } else {
        System.out.println(String.format(Locale.US, "Avg: %.2f", avg));
      }

      System.out.println("N/A: " + String.valueOf(na));
    }

  }

  public static boolean isNumeric(String str) {
    try {
      double d = Double.parseDouble(str);
    } catch (NumberFormatException e) {
      return false;
    }

    return true;
  }

}
