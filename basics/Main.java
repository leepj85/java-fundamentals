import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static String pluralize(String animal, int num) {
    if (num != 1) {
      animal += 's';
    }
    return animal;
  }

  public static void flipNHeads(int n) {
    int flips = 0;
    int headsInRow = n;
    Random rnd = new Random();
    double num;
    while (n != 0) {
      num = rnd.nextDouble();
      // System.out.println(num);
      if (num >= .5) {
        System.out.println("heads");
        n--;
      } else {
        System.out.println("tails");
        n = headsInRow;
      }
      flips++;
    }
    System.out.println("It took " + flips + " flips to flip " + headsInRow + " heads in a row.");
  }

  public static void clock() {
    LocalDateTime current = LocalDateTime.now();
    LocalDateTime previous = LocalDateTime.now();
    String currentTime;
    String previousTime = previous.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

    while (true) {
      currentTime = current.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      if (!currentTime.equals(previousTime)) {
        System.out.println(currentTime);
        previousTime = currentTime;
      }
      current = LocalDateTime.now();
    }
  }

  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(2);

    clock();
  }
}