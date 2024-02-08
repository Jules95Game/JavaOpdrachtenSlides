package lucas;

import java.util.Scanner;
import lucas.parser.StringToInteger;

public class LucasNumbers {
  private static StringToInteger input;


  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Please enter a natural number: ");
    int userInput = input.parseNaturalInt(inputScanner.nextLine());
    int[] lucasArray = giveLucasNumbersUpTo(userInput);
    System.out.println();

    if (lucasArray[userInput - 1] != 0) {
      System.out.printf("The first %d Lucas-numbers:\n", userInput);

      for (int num : lucasArray) {
        System.out.print(num + ", ");
      }

      System.out.println();
    } else {
      System.out.println("The resulting Lucas-number is larger then an integer value can hold.");
      System.out.println("The numbers that were calculated are:");

      int count = 0;
      for (int num : lucasArray) {
        if (num < 1) break;
        System.out.print(num + ", ");
        count++;
      }

      System.out.println();
      System.out.println();
      System.out.printf("The highest calculated number is Lucas-number %d", count);
      System.out.println();
    }
  }


  private static int[] giveLucasNumbersUpTo(int number) {
    int[] lucasNumbers = new int[number];
    lucasNumbers[0] = 2;
    if (number == 1) return lucasNumbers;
    lucasNumbers[1] = 1;
    if (number == 2) return lucasNumbers;
    lucasNumbers[2] = lucasNumbers[0];

    for (int i = 1; i < number; i++) {

      if (lucasNumbers[i] != 1 && lucasNumbers[i] < lucasNumbers[i - 1]) {
        lucasNumbers[i] = 0;
        if (i + 1 < number) lucasNumbers[i + 1] = 0;

        return lucasNumbers;
      }

      if (i + 2 < number) lucasNumbers[i + 2] += lucasNumbers[i];
      if (i + 1 < number) lucasNumbers[i + 1] += lucasNumbers[i];
    }
    return lucasNumbers;
  }
}
