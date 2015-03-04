import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntropyValue {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    List<String> testCases = new ArrayList<>();

    while (s.hasNextLine()) {
      testCases.add(s.nextLine());
    }

    s.close();

    List<int[]> intArrays = new ArrayList<>();

    for (String testCase : testCases) {
      String[] split = testCase.split(" ");
      int[] arr = new int[split.length];

      for (int i = 0; i < split.length; i++) {
        arr[i] = Integer.parseInt(split[i]);
      }

      intArrays.add(arr);
    }

    for (int[] currentArray : intArrays) {
      System.out.println(getEntropyValue(currentArray));
    }
  }

  private static int getEntropyValue(int[] currentArray) {
    int result = 0;

    for (int i = 0; i < currentArray.length; i++) {
      for (int j = i + 1; j < currentArray.length; j++) {
        if (currentArray[i] > currentArray[j]) {
          result++;
        }
      }
    }

    return result;
  }

}
