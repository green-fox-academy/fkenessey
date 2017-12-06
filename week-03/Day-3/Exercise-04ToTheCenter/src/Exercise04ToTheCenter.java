import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise04ToTheCenter {

  static Graphics g;

  public static void mainDraw(Graphics graphics){
    // create a line drawing function that takes 2 parameters:
    // the x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // draw 3 lines with that function.
    Scanner scanner = new Scanner(System.in);
    String limit = "y";
    while (!limit.contains("n")) {
      System.out.println("X:");
      int x = scanner.nextInt();
      System.out.println("Y:");
      int y = scanner.nextInt();
      System.out.println("Continue?");
      limit = scanner.next();
      drawLine(x, y);
    }
  }

  private static void drawLine( int x, int y) {
    int a = (int)Math.random()*255;
    int b = (int)Math.random()*255;
    int c = (int)Math.random()*255;
    g.setColor(new Color(a,b,c));
    g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
  }

  //    Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      g = graphics;
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}