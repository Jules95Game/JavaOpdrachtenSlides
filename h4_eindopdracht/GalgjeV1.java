import java.util.ArrayList;
import java.util.Scanner;

public class GalgjeV1 {
  private static Scanner inputScanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Please enter a word: ");
    String solution = inputScanner.nextLine();
    ArrayList<Character> foundChars = new ArrayList<Character>();
    for (int i = 0; i < solution.length(); i++) {
      foundChars.add('_');
    }
    System.out.println();

    int turn = 1;
    while (turn <= 10) {
      System.out.println("Current turn: " + turn);
      for (char found : foundChars) {
        System.out.print(found);
      }
      System.out.println();
      System.out.println();

      String rawGuess = "";
      System.out.print("Try to guess a letter: ");
      do {
        rawGuess = inputScanner.nextLine();
        if (rawGuess.length() <= 1) {
          break;
        } else {
          System.out.print("\nPlease only enter one letter: ");
        }
      } while (true);
      char guess = rawGuess.charAt(0);
      System.out.println();

      ArrayList<Integer> indices = new ArrayList<Integer>();
      int index = solution.indexOf(guess);
      indices.add(index);
      index = solution.indexOf(guess, index + 1);
      while (index >= 0) {
        indices.add(index);
        index = solution.indexOf(guess, index + 1);
      }

      if (indices.get(0) != -1) {
        System.out.println("Good guess!");
        for (int change : indices) {
          foundChars.set(change, guess);
        }
      } else {
        System.out.println("Bad guess!");
      }

      if (foundChars.indexOf('_') == -1) {
        System.out.println("You won! The word was " + solution);
        break;
      }
      if (turn == 10) {
        System.out.println("You lost. The word was " + solution);
      }

      turn++;
    }
  }
}
