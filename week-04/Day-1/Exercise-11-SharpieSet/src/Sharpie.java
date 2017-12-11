//import java.util.Scanner;

public class Sharpie {
  String color;
  float width;
  float inkAmount;

  public Sharpie() {
    this.inkAmount = 100;
  }

  public Sharpie(String color, float width, float inkAmount) {
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
  }

  /*public Sharpie addSharpie() {
    Scanner scanner = new Scanner(System.in);
    Sharpie newSharpie = new Sharpie();
    System.out.println("color:");
    newSharpie.color = scanner.nextLine();
    System.out.println("width:");
    newSharpie.width = scanner.nextFloat();
    System.out.println("inkAmount:");
    newSharpie.inkAmount = scanner.nextFloat();
    return newSharpie;
  }*/

  public void use() {
    this.inkAmount-=10;
  }

  @Override
  public String toString() {
    return "[" + color + ", " + width + ", " + inkAmount + "]";
  }

  /*public static void main(String[] args) {
    Sharpie pencil1 = new Sharpie();
    System.out.println(pencil1);
    pencil1.color = "blue";
    pencil1.width = 10;
    System.out.println(pencil1);
    pencil1.use();
    System.out.println(pencil1);
  }*/
}
