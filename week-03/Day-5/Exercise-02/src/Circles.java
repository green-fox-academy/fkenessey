import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics){

    drawFracCricles(graphics, 200, 200, 400, 5);
  }

  private static void drawFracCricles(Graphics g, int x, int y, int size, int level) {

    if (level == 0) {
      return;
    } else {

    drawCircle(g, x, y, size);

    int x1 = x - (int)(Math.sin(Math.PI / 3) * (size / 4));
    int x2 = x + (int)(Math.sin(Math.PI / 3) * (size / 4));
    int y1 = y - size / 4;
    int y2 = y + (int)(Math.cos(Math.PI / 3) * size / 4);

    drawFracCricles(g, x, y1, size / 2, level - 1);
    drawFracCricles(g, x1, y2, size / 2, level - 1);
    drawFracCricles(g, x2, y2, size / 2, level - 1);

    }
  }

  private static void drawCircle(Graphics g, int x, int y, int size) {
    g.drawArc(x - size / 2, y - size / 2, size, size, 0, 360);
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
