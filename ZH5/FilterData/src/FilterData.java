import java.util.ArrayList;
import java.util.Scanner;

public class FilterData {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String pattern = s.nextLine();

    ArrayList<String> lines = new ArrayList<>();

    while (s.hasNextLine()) {
      lines.add(s.nextLine());
    }

    s.close();

    int sumSalaries = 0;

    for (String line : lines) {
      String[] split = line.split(",");

      if (split[4].contains(pattern)) {
        int salary = Integer.parseInt(split[2]);
        int bonus = 0;

        if (!split[3].isEmpty()) {
          bonus = (int)(salary * Double.parseDouble(split[3]) / 100.0);
        }

        sumSalaries += salary + bonus;
      }
    }

    System.out.println(sumSalaries);
  }

}
