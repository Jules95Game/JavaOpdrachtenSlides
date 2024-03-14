public class Penguin extends Bird {
  public Penguin(String name, String color) {
    super(name);
    setColor(color);
  }

  @Override
  public String sayName() {
    return "I am a " + color + " " + name + ".";
  }

  @Override
  public String Fly() {
    return "I can not fly.";
  }
}
