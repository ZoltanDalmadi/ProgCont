import java.util.*;

public class ErdosNumber {

  public static void main(String[] args) {

    try (Scanner s = new Scanner(System.in)) {

      while (s.hasNextLine()) {
        Map<Integer, Integer> authorErdosNumbers = new HashMap<>();

        int numOfPubs = s.nextInt();
        s.nextLine();

        LinkedList<Integer[]> publications = new LinkedList<>();

        for (int i = 0; i < numOfPubs; i++) {
          String[] tokens = s.nextLine().split(" ");
          Integer[] publication = new Integer[tokens.length];

          for (int j = 0; j < tokens.length; j++) {
            publication[j] = Integer.parseInt(tokens[j]);
          }

          publications.add(publication);
        }

        // look for erdos
        for (Integer[] publication : publications) {
          if (Arrays.asList(publication).contains(1)) {
            for (int i = 1; i < publication.length; i++) {
              authorErdosNumbers.put(publication[i], 1);
            }
          }
        }

        for (Integer[] publication : publications) {
          if (Arrays.asList(publication).contains(1)) {
            continue;
          }

          for (int i = 0; i < publication.length; i++) {
            if (authorErdosNumbers.keySet().contains(publication[i])) {

              for (int j = 0; j < publication.length; j++) {

                if (j == i) {
                  continue;
                }

                authorErdosNumbers.put(publication[j], publication[i] + 1);
              }
            }
          }

        }

      }

    }

  }


}
