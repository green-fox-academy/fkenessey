import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise11 {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    int size = 350;
    graphics.setColor(Color.yellow);
    graphics.fillRect(0,0,350,350);
    drawFracSquares(graphics, 4,0, 0, 330);

  }

  private static void drawFracSquares(Graphics graphics, int level, int x, int y, int size) {
    if (level == 0) {
      return;
    } else {

      graphics.setColor(Color.black);
      drawForFracSquares(graphics,x, y, size);

      int x1 = x + size / 3;
      int x2 = x + (size * 2 / 3);
      int y1 = y + size / 3;
      int y2 = y + (size * 2 / 3);

      drawFracSquares(graphics, level - 1, x1, y, size / 3 );
      drawFracSquares(graphics, level - 1, x2, y1, size / 3 );
      drawFracSquares(graphics, level - 1, x1, y2, size / 3 );
      drawFracSquares(graphics, level - 1, x, y1, size / 3 );
    }
  }

  private static void drawForFracSquares(Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.black);
    graphics.drawLine(x, y + (size / 3), x + size, y + (size / 3));
    graphics.drawLine(x, y + (size * 2 / 3), x + size, y + (size * 2 / 3));
    graphics.drawLine(x + (size / 3), y, x + (size / 3), y + size);
    graphics.drawLine(x + (size * 2 / 3), y, x + (size * 2 / 3), y +size);
  }

  //    Don't touch the code below
  static int WIDTH = 350;
  static int HEIGHT = 350;

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
