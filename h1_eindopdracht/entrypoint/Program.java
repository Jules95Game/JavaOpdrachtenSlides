// This is the entry point in this java project
package entrypoint;

// I want to use the class Message.java
import classes.Message;

public class Program{
    public static void main(String[] args){
        Message test = new Message();
        System.out.println(test.testMessage);
    }
}