import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise20Triangles {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/triangles/r5.png]
    int numberOfLines = 21;
    int size = 10;
    int indent = (size / 2) * numberOfLines;
    for (int i = 0; i <numberOfLines; i++) {
      for (int j = 0; j < i + 1; j++) {
        drawTriangle(graphics, indent + j * size, i * size, size, Color.green);
      }
      indent-=(size / 2);
    }
  }

  private static void drawTriangle(Graphics graphics, int x, int y, int size, Color color) {
    drawLine(graphics, x, y + size, x + size, y + size, color);
    drawLine(graphics, x + size, y + size, x + (size / 2), y, color);
    drawLine(graphics, x + (size / 2), y, x, y + size, color);

  }

  public static void drawLine(Graphics graphics, int x1, int y1, int x2, int y2, Color color) {
    graphics.setColor(color);
    graphics.drawLine(x1, y1, x2, y2);
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
