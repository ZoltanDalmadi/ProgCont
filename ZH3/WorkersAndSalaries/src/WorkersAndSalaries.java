import java.util.ArrayList;
import java.util.Scanner;

public class WorkersAndSalaries {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<String> lines = new ArrayList<>();

    while (s.hasNextLine()) {
      lines.add(s.nextLine());
    }

    s.close();

    int sumSalaries = 0;
    int sumBonuses = 0;

    for (String line : lines) {
      String[] split = line.split(",");

      int salary = Integer.parseInt(split[2]);
      int bonus = 0;

      if (!split[3].isEmpty()) {
        bonus = (int)(salary * Double.parseDouble(split[3]) / 100.0);
      }

      sumSalaries += salary * 12;
      sumBonuses += bonus * 12;
    }

    System.out.printf("%d + %d = %d\n", sumSalaries, sumBonuses,
                      sumSalaries + sumBonuses);
  }

}
