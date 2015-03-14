import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifferences {

  public static void main(String[] args) {

    try (Scanner s = new Scanner(System.in)) {

      while (s.hasNextLine()) {
        String[] dates = s.nextLine().split(" ");

        LocalDate dat1 = LocalDate.parse(dates[0]);
        LocalDate dat2 = LocalDate.parse(dates[1]);

        long value = ChronoUnit.DAYS.between(dat1, dat2);

        if (value > 10) {
          value++;
        }

        if (value < -10) {
          value--;
        }

        System.out.println(value);
      }
    }
  }
}
