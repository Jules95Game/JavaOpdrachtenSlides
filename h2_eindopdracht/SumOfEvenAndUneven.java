import java.util.Scanner;

public class SumOfEvenAndUneven {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    // System.out.print("Geef een geheel positief getal: ");
    int userNumber = userInputPositiveInt(inputScanner);
    // int userNumber = inputScanner.nextInt();
    int evenSum = 0;
    int unevenSum = 0;

    for (int i = 1; i <= userNumber; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        unevenSum += i;
      }
    }

    int sumDifference = unevenSum - evenSum;
    System.out.println("som van oneven getallen tot en met " + userNumber + " is " + unevenSum);
    System.out.println("som van even getallen tot en met " + userNumber + " is " + evenSum);
    System.out.println("verschil tussen twee sommen is " + sumDifference);
  }

  private static int userInputPositiveInt(Scanner inputScanner) {
    int userNumber = 0;
    do {
      System.out.print("Geef een geheel positief getal: ");
      try {
        userNumber = inputScanner.nextInt();
        return userNumber;
      } catch (Exception e) {
        System.out.println("Verkeerde input.");
        System.out.println();
      }
    } while (true);
  }
}
