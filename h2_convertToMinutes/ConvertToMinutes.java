import java.util.Scanner;

public class ConvertToMinutes {
  public static void main(String[] args) {
    // uur   =        60 =     60 minuten
    // dag   =     24*60 =   1440 minuten
    // week  =   7*24*60 =  10080 minuten
    // maand =  30*24*60 =  43200 minuten
    // jaar  = 365*24*60 = 525600 minuten
    Scanner inputScanner = new Scanner(System.in);
    System.out.println("what do you want to convert to minutes?");
    System.out.println("1. Hours");
    System.out.println("2. Days");
    System.out.println("3. Weeks");
    System.out.println("4. Months");
    System.out.println("5. Years");

    System.out.print("Choose number: ");
    int userChoice = inputScanner.nextInt();
    System.out.print("How many?: ");
    int userInput = inputScanner.nextInt();

    switch (userChoice) {
      case 1:
        int result = userInput * 60;
        System.out.println(userInput + " hour(s) contains " + result + " minutes.");
        break;
      case 2:
        result = userInput * 1440;
        System.out.println(userInput + " day(s) contains " + result + " minutes.");
        break;
      case 3:
        result = userInput * 10080;
        System.out.println(userInput + " week(s) contains " + result + " minutes.");
        break;
      case 4:
        result = userInput * 43200;
        System.out.println(userInput + " month(s) contains " + result + " minutes.");
        break;
      case 5:
        result = userInput * 525600;
        System.out.println(userInput + " year(s) contains " + result + " minutes.");
        break;
      default:
        System.out.println("No valid option.");
    }
  }
}
