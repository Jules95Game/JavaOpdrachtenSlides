import java.util.Scanner;

public class MethodTest {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Geef de basis: ");
    int base = inputScanner.nextInt();
    System.out.print("Geef de exponent: ");
    int exp = inputScanner.nextInt();
    System.out.println(base + " to de macht " + exp + " is: " + exponent(base, exp));
  }


  private static double exponent(int base, int exp) {
    return Math.pow(base, exp);
  }
}
