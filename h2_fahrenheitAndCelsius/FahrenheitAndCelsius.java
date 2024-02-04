import java.util.Scanner;

public class FahrenheitAndCelsius {
  public static void main(String[] args) {
    System.out.println("What do you want to do?");
    System.out.println("1. Convert Fahrenheit to Celsius.");
    System.out.println("2. Convert Celsius to Fahrenheit.");
    Scanner inputScanner = new Scanner(System.in);

    System.out.print("Choose number: ");
    int userChoice = inputScanner.nextInt();
    System.out.print("Your input: ");
    double userInput = inputScanner.nextDouble();

    switch (userChoice) {
      case 1:
        System.out.println(
            userInput + " Fahrenheit equals " + fahrenheitToCelsius(userInput) + " Celsius.");
        break;
      case 2:
        System.out.println(
            userInput + " Celsius equals " + celsiusToFahrenheitTo(userInput) + " Fahrenheit.");
        break;
      default:
        System.out.println("No valid option.");
    }
  }

  private static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) / 1.8;
  }

  private static double celsiusToFahrenheitTo(double celsius) {
    return 32 + celsius * 1.8;
  }
}
