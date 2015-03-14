import java.util.Scanner;

public class ArmstrongNumbers {

  public static void main(String[] args) {

    try (Scanner s = new Scanner(System.in)) {

      while (s.hasNextLine()) {
        int a = s.nextInt();
        int b = s.nextInt();
        s.nextLine();

        int numOfArmstrongNumbers = 0;

        for (int currentNumber = a; currentNumber <= b; currentNumber++) {
          String str = String.valueOf(currentNumber);
          int n = str.length();

          int sum = 0;

          for (int digit = 0; digit < n; digit++) {
            sum += Math.pow(Integer.parseInt(String.valueOf(str.charAt(digit))), n);
          }

          if (sum == currentNumber) {
            numOfArmstrongNumbers++;
          }
        }

        System.out.println(numOfArmstrongNumbers);
      }

    }

  }

}
