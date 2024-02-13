public class ReverseString {
  public static void main(String[] args) {
    System.out.println(reverseString("abcdef"));
    System.out.println(reverseString("Julian"));
    System.out.println(reverseString("SHARP"));
    System.out.println(reverseString("Filian"));
  }


  private static String reverseString(String input) {
    String output = "";
    for (int i = 0; i < input.length(); i++) {
      output = input.charAt(i) + output;
    }
    return output;
  }
}
