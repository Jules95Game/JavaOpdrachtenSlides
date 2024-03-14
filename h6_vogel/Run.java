import java.util.ArrayList;

public class Run {
  public static void main(String[] args) {
    ArrayList<Bird> birds = new ArrayList<Bird>();

    birds.add(new Eagle("Eagle", "brown"));
    birds.add(new Crow("Crow", "black"));
    birds.add(new Parrot("Parrot", "green"));
    birds.add(new Penguin("Penguin", "black"));

    for (Bird bird : birds) {
      System.out.println(bird.sayName());
      System.out.println(bird.Fly());
    }
  }
}
