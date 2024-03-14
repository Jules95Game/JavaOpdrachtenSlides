public class Crow extends Bird {
  public Crow(String name, String color) {
    super(name);
    setColor(color);
  }

  @Override
  public String sayName() {
    return "I am a " + color + " " + name + ".";
  }
}
