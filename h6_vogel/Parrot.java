public class Parrot extends Bird {
  public Parrot(String name, String color) {
    super(name);
    setColor(color);
  }

  @Override
  public String sayName() {
    return "Squawk! I am a " + color + " " + name + ". Squawk!";
  }
}
