import java.util.Scanner;

public class SnelheidRekenen {
  public static void main(String[] args) {
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Invoerafstand in meters: ");
    double meters = inputScanner.nextDouble();
    System.out.print("Invoeruur: ");
    int hours = inputScanner.nextInt();
    System.out.print("Invoerminuten: ");
    int minutes = inputScanner.nextInt();
    System.out.print("Invoer seconden: ");
    int seconds = inputScanner.nextInt();
    double totalSeconds = seconds + minutes * 60 + hours * 3600;

    double metersPerSec = meters / totalSeconds;
    System.out.println("Uw snelheid in meter/seconden is " + metersPerSec);

    double kilometersPerHour = metersPerSec * 3.6;
    System.out.println("Uw snelheid in km/u is " + kilometersPerHour);

    double milesPerHour = (meters / 1609) / (totalSeconds / 3600);
    System.out.println("Uw snelheid in mijl/u is " + milesPerHour);

    milesPerHour = kilometersPerHour / 1.609;
    System.out.println("Uw snelheid in mijl/u is " + milesPerHour);
  }
}
