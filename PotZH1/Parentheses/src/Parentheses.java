import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    List<String> cases = new ArrayList<>();

    while (s.hasNextLine()) {
      cases.add(s.nextLine());
    }

    s.close();

    for (String ex : cases) {
      System.out.println(isBalanced(ex) ? "HELYES" : "HELYTELEN");
    }
  }

  private static boolean isBalanced(String str) {
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < str.length(); i++) {
      char currentChar = str.charAt(i);

      if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
        stack.push(currentChar);
      }

      if (currentChar == ')' || currentChar == ']' || currentChar == '}') {
        if (stack.isEmpty()) {
          return false;
        }

        char popped = stack.pop();
        if (currentChar == ')' && popped != '(' ||
            currentChar == ']' && popped != '[' ||
            currentChar == '}' && popped != '{') {
          return false;
        }
      }
    }

    return stack.isEmpty();
  }
}
