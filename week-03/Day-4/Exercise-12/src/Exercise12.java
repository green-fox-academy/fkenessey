import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise12 {
  public static void mainDraw(Graphics graphics){
    // draw a box that has different colored lines on each edge.
    //drawHexagon(graphics,300,300,50);
    recHexagonDraw(graphics,  150,  150,  150,  5);



  }

  private static void recHexagonDraw(Graphics graphics,int x, int y, int size, int level) {

    if (level == 0) {
      return;
    } else {

      graphics.setColor(Color.green);
      drawHexagon(graphics, x, y, size);

      int x1 = x + (int)(Math.cos(0) * size / 2);
      int x2 = x + (int)(Math.cos(Math.PI * 2 / 3) * size / 2);
      int y1 = y + (int)(Math.sin(Math.PI * 2 / -3) * size / 2);
      int y2 = y + (int)(Math.sin(Math.PI * 2 / 3) * size / 2);

      recHexagonDraw(graphics, x1, y, size / 2, level - 1);
      recHexagonDraw(graphics, x2, y1, size / 2, level - 1);
      recHexagonDraw(graphics, x2, y2, size / 2, level - 1);

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
