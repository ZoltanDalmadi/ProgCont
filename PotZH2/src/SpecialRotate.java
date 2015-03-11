import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SpecialRotate {
  public static void main(String[] args) {

    try (Scanner s = new Scanner(System.in)) {
      while (s.hasNextLine()) {
        int n = s.nextInt() - 1;
        int m = s.nextInt();
        s.nextLine();

        String[] split = s.nextLine().split(", ");

        List<Integer> list = new ArrayList<>();

        for (String str : split) {
          list.add(Integer.parseInt(str));
        }

        List<Integer> list2 = new LinkedList<>();

        for (int i = n; i < list.size(); i += m) {
          list2.add(list.get(i));
        }

        Collections.reverse(list2);

        Iterator<Integer> it = list2.iterator();

        for (int i = n; i < list.size(); i += m) {
          list.set(i, it.next());
        }

        String output = list.toString();

        System.out.println(output.substring(1, output.length() - 1));
      }
    }

  }
}
