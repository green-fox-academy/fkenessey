import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Exercise08Tree {
  public static void mainDraw(Graphics graphics){
    drawTree(graphics, 100, 300, 100, 250, 1);

  }

  private static void drawTree(Graphics g, int x1, int y1, int x2, int y2, int level) {
    if (level == 0) {
      g.drawLine(x1, y1, x2, y2);
    } else {
      int x3Left = x1 - (((int)(Math.sqrt(3))) / 2);
      int x3Right = x1 + (((int)(Math.sqrt(3))) / 2);
      int y3 = (1 / 2) + y1;

      drawTree(g, x2, y2, x3Left, y3, level - 1);
      drawTree(g, x2, y2, x3Right, y3, level - 1);
      drawTree(g, x1, y1, x2, y2, level - 1);
    }
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
