import java.util.Scanner;

public class PrintArray {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Enter the number of items: ");
    int arrayLength = StringToInteger.parseNatural();

    System.out.println("Enter the values of all items (separated by space).");
    System.out.print("If you enter more values then specified, they will be ignored: ");
    int[] numItems = fillArray(arrayLength);
    System.out.println();

    printArray(numItems);
  }


  private static int[] fillArray(int arrayLength) {
    int[] numItems = new int[arrayLength];
    while (true) {
      try {

        for (int i = 0; i < numItems.length; i++) {
          numItems[i] = scanner.nextInt();
        }
        scanner.nextLine();
        return numItems;

      } catch (Exception e) {
        scanner.nextLine();
        System.out.print("Try again: ");
      }
    }
  }


  private static void printArray(int[] numItems) {
    System.out.print("The values are: [");

    for (int i = 0; i < numItems.length; i++) {
      if (i != numItems.length - 1) System.out.print(numItems[i] + ", ");
      else System.out.print(numItems[i]);
    }

    System.out.println("]");
  }
}
