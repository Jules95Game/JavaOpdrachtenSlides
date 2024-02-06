import java.util.Scanner;

public class CeasarCode {
  public static void main(String[] args) {
    System.out.println("Zet tekst om in Ceasar Code.");
    Scanner inputScanner = new Scanner(System.in);
    System.out.print("Voer een leestekenreeks in:\t ");
    String encodedText = ceasarCodePlusThree(inputScanner.nextLine());
    System.out.println("De cijfertekstreeks is:\t\t " + encodedText);
  }

  private static String ceasarCodePlusThree(String plainText) {
    plainText = plainText.toUpperCase();
    char[] plainArray = plainText.toCharArray();

    for (int i = 0; i < plainArray.length; i++) {

      if (plainArray[i] + 3 > 'Z') {
        plainArray[i] = (char) (plainArray[i] - 26 + 3);
      } else {
        plainArray[i] = (char) (plainArray[i] + 3);
      }
    }
    return String.copyValueOf(plainArray);
  }
}
