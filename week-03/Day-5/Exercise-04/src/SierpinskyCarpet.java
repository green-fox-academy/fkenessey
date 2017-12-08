import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
  public static void mainDraw(Graphics graphics){

    //drawSquares(graphics, 150, 50, 100);
    drawFracSquares(graphics, 300, 300, 600, 5);


  }

  private static void drawFracSquares(Graphics g, int x, int y, int size, int level) {

    if (level == 0) {
      return;
    } else {
      drawSquares(g, x, y, size);

      int x1 = x - (size / 3);
      int x2 = x + (size / 3);
      int y1 = y - (size / 3);
      int y2 = y + (size / 3);


      drawFracSquares(g, x1, y1, size / 3, level - 1);
      drawFracSquares(g, x1, y, size / 3, level - 1);
      drawFracSquares(g, x1, y2, size / 3, level - 1);
      drawFracSquares(g, x, y1, size / 3, level - 1);
      drawFracSquares(g, x, y2, size / 3, level - 1);
      drawFracSquares(g, x2, y1, size / 3, level - 1);
      drawFracSquares(g, x2, y, size / 3, level - 1);
      drawFracSquares(g, x2, y2, size / 3, level - 1);

    }


  }

  private static void drawSquares(Graphics g, int x, int y, int size) {
    g.setColor(Color.white);
    g.fillRect(x - size / 2, y - size / 2, size, size);
    g.setColor(Color.black);
    g.fillRect(x - size / 6, y - size / 6, size / 3, size / 3);
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
