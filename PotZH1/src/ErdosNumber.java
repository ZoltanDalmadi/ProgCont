import java.util.*;

public class ErdosNumber {

  public static void main(String[] args) {

    try (Scanner s = new Scanner(System.in)) {

      while (s.hasNextLine()) {
//        Map<Integer, Integer> authorErdosNumbers = new HashMap<>();

        int numOfPubs = s.nextInt();
        s.nextLine();

        LinkedList<int[]> publications = new LinkedList<>();

        for (int i = 0; i < numOfPubs; i++) {
          String[] tokens = s.nextLine().split(" ");
          int[] publication = new int[tokens.length];

          for (int j = 0; j < tokens.length; j++) {
            publication[j] = Integer.parseInt(tokens[j]);
          }

          publications.add(publication);
        }

      }

    }

  }


}
