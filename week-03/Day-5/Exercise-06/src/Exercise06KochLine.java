import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise06KochLine {
  public static void mainDraw(Graphics graphics){
    drawKochLine(graphics, 50, 150, 250, 200, 2);
  }

  private static void drawKochLine(Graphics g, int x1, int y1, int x2, int y2, int level) {
    if (level == 0) {
      g.drawLine(x1, y1, x2, y2);
    } else {
      int xMid1 = x1 + ((x2 - x1) / 3);
      int yMid1 = y1 + ((y2 - y1) / 3);
      int xMid2 = (int)(0.5 * (x1 + x2) + Math.sqrt(3) * (y2-y1)/6);
      int yMid2 = (int)(0.5 * (y1 + y2) + Math.sqrt(3) * (x1-x2)/6);
      int xMid3 = x1 + ((x2 - x1) * 2 / 3);
      int yMid3 = y1 + ((y2 - y1) * 2 / 3);
      drawKochLine(g, x1, y1, xMid1, yMid1, level - 1);
      drawKochLine(g, xMid1, yMid1, xMid2, yMid2, level - 1);
      drawKochLine(g, xMid2, yMid2, xMid3, yMid3, level - 1);
      drawKochLine(g, xMid3, yMid3, x2, y2, level - 1);
    }
  }

  private static void drawTriangle(Graphics g, int x, int y, int size, int addAngle) {
    double[] angles = {-Math.PI * 1 / 3 + addAngle, Math.PI * 1 / 3 + addAngle, Math.PI + addAngle};
    double[] xps = new double[3];
    double[] yps = new double[3];
    int[] xpoints = new int[3];
    int[] ypoints = new int[3];

    for (int i = 0; i < 3; i++) {
      xps[i] = x + Math.sin(angles[i]) * size;
      yps[i] = y + Math.cos(angles[i]) * size;
      xpoints[i] = (int)xps[i];
      ypoints[i] = (int)yps[i];
    }

    g.drawPolygon(xpoints,ypoints,3);
    //g.setColor(Color.white);
    //g.fillPolygon(xpoints,ypoints,3);
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
