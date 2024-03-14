public class Eagle extends Bird {
  public Eagle(String name, String color) {
    super(name);
    setColor(color);
  }

  @Override
  public String sayName() {
    return "I am a " + color + " " + name + ".";
  }
}
