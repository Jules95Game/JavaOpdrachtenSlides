// This is the entry point in this java project
package entrypoint;

// I want to use the class Message.java
import classes.Message;

public class Program {
  public static void main(String[] args) {
    Message testObject1 = new Message();
    Message testObject2 = new Message();
    System.out.println(testObject1.testMessage1);
    System.out.println(testObject2.testMessage1);
    System.out.println();

    // testMessage2 is a static variable and can be used without a Message object
    System.out.println(Message.testMessage2);
    System.out.println();

    // testMessage1 is tied to testObject1 and has no effect on other Message objects
    testObject1.testMessage1 = "Test 3";
    System.out.println(testObject1.testMessage1);
    System.out.println(testObject2.testMessage1);
    System.out.println();

    // testMessage2 is shared among all Message objects
    Message.testMessage2 = "Test 4";
    System.out.println(testObject1.testMessage2);
    System.out.println(testObject2.testMessage2);
    System.out.println(Message.testMessage2);
  }
}
