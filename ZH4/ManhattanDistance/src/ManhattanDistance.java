import java.util.ArrayList;
import java.util.Scanner;

public class ManhattanDistance {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<String> lines = new ArrayList<>();

    while (s.hasNextLine()) {
      lines.add(s.nextLine());
    }

    s.close();

    int numOfPoints = lines.size();

    ArrayList<String[]> points = new ArrayList<>();

    for (String line : lines) {
      points.add(line.split(" "));
    }

    int minManhattan = getManhattanDistance(points.get(0), points.get(1));

    for (int i = 0; i < numOfPoints; i++) {
      for (int j = i + 1; j < numOfPoints; j++) {
        int mm = getManhattanDistance(points.get(i), points.get(j));

        if (mm < minManhattan) {
          minManhattan = mm;
        }
      }
    }

    System.out.println(minManhattan);

  }

  public static int getManhattanDistance(String[] p1, String[] p2) {
    int result = 0;
    int len = p1.length;

    for (int i = 0; i < len; i++) {
      result += Math.abs(Integer.parseInt(p1[i]) - Integer.parseInt(p2[i]));
    }

    return result;
  }
}
