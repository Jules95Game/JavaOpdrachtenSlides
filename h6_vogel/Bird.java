public class Bird {
  public String name;
  public String color;

  public Bird(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public String sayName() {
    return "I am a Bird";
  }

  public String Fly() {
    return "I can fly!";
  }
}
