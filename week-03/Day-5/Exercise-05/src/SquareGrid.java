import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
  public static void mainDraw(Graphics graphics){

    //drawRectangle(graphics, 150,150, 150);
    drawFracRectangle(graphics, 150, 150, 150, 10, 4);


  }

  private static void drawFracRectangle(Graphics g, int x, int y, int size, int thickness, int level) {

    if (level == 0) {
      return;
    } else {

      drawRectangle(g, x, y, size, thickness);

      int x1 = x - size / 2;
      int x2 = x + size / 2;
      int y1 = y - size / 2;
      int y2 = y + size / 2;

      drawFracRectangle(g, x1, y1, size / 2, thickness /2, level - 1);
      drawFracRectangle(g, x1, y2, size / 2, thickness /2,level - 1);
      drawFracRectangle(g, x2, y1, size / 2, thickness /2,level - 1);
      drawFracRectangle(g, x2, y2, size / 2, thickness /2,level - 1);
    }
  }

  private static void drawRectangle(Graphics g, int x, int y, int size, int thickness) {
    Graphics2D g2 = (Graphics2D) g;
    g2.setStroke(new BasicStroke(thickness));
    //g2.draw(new Line2D.Float(30, 20, 80, 90));
    //g.fillRect(x - size / 2, y - size / 2, size, size);
    g2.drawRect(x - size / 2, y - size / 2, size, size);
    //g.setColor(Color.white);
    //g.fillRect(x - size * 3 / 8, y - size * 3 / 8, size * 3 / 4 , size * 3 / 4);
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
