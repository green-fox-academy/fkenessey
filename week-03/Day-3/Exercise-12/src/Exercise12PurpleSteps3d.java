import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise12PurpleSteps3d {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/purple-steps/r3.png]
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter amount:");
    int n = scanner.nextInt();
    System.out.println("Please enter size:");
    int size = scanner.nextInt();
    int loc = 0;
    for (int i = 1; i < n; i++) {
      drawSquare(graphics,loc,loc,size);
      loc = loc + size;
      size = size + size/2;
    }



  }

  private static void drawSquare(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.magenta);
    graphics.fillRect(x, y, size, size);
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
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}

