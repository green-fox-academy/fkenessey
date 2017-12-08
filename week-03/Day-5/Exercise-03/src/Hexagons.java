import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
  public static void mainDraw(Graphics graphics){

    drawFracHexagon(graphics, 300, 300, 200, 5);

  }

  private static void drawFracHexagon(Graphics g, int x, int y, int size, int level) {

    if (level == 0) {
      return;
    } else {
      drawHexagon(g, x, y, size);

      int x1 = x - (size * 2 / 3);
      int x2 = x + (size *2 / 3);
      int x3 = x - (int)(Math.cos(Math.PI / 3) * size * 2 / 3);
      int x4 = x + (int)(Math.cos(Math.PI / 3) * size * 2 / 3);
      int y1 = y - (int)(Math.sin(Math.PI / 3) * size * 2 / 3);
      int y2 = y + (int)(Math.sin(Math.PI / 3) * size * 2 / 3);

      drawFracHexagon(g,x1, y, size / 3, level - 1);
      drawFracHexagon(g,x2, y, size / 3, level - 1);
      drawFracHexagon(g,x3, y1, size / 3, level - 1);
      drawFracHexagon(g,x3, y2, size / 3, level - 1);
      drawFracHexagon(g,x4, y1, size / 3, level - 1);
      drawFracHexagon(g,x4, y2, size / 3, level - 1);
    }
  }

  private static void drawHexagon(Graphics graphics, int x, int y, int size) {
    double[] angles = { Math.PI / -3, Math.PI * -2 / 3, -Math.PI,  Math.PI * 2 / 3, Math.PI /3, 0};
    double[] xpoints = new double[6];
    double[] ypoints = new double[6];
    int[] xps = new int[6];
    int[] yps = new int[6];

    for (int i = 0; i < 6; i++) {
      xpoints[i] = x + size * Math.cos(angles[i]);
      ypoints[i] = y + size * Math.sin(angles[i]);
      xps[i] = (int) xpoints[i];
      yps[i] = (int) ypoints[i];
    }
    graphics.drawPolygon(xps, yps, 6);

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
