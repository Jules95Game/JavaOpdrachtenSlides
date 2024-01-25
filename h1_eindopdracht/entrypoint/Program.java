// This is the entry point in this java project
package entrypoint;

// I want to use the class Message.java
import classes.Message;

public class Program {
  public static void main(String[] args) {
    Message testObject1 = new Message();
    System.out.println(testObject1.testMessage1);

    // testMessage2 is a static variable and can be used without a Message object
    System.out.println(Message.testMessage2);

    testObject1.testMessage1 = "Test 3";
    System.out.println(testObject1.testMessage1);
  }
}
