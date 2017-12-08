import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics){
    drawFracTriangles(graphics, 150, 125, 150, 6);
    //drawTwoTriangles(graphics, 150, 125, 150);

  }

  private static void drawFracTriangles(Graphics g, int x, int y, int size, int level) {

    if (level == 0) {
      return;
    } else {

      drawTwoTriangles(g, x, y, size);

      int x1 = x - (int)(Math.sin(Math.PI / 3) * size / 2);
      int x2 = x + (int)(Math.sin(Math.PI / 3) * size / 2);
      int y1 = y - (int)(Math.cos(Math.PI / 3) * size / 2);
      int y2 = y +  (size / 2);

      drawFracTriangles(g, x1, y1, size / 2 , level - 1);
      drawFracTriangles(g, x2, y1 , size / 2, level - 1);
      drawFracTriangles(g, x, y2, size / 2, level - 1);

    }
  }

  private static void drawTwoTriangles(Graphics g, int x, int y, int size) {

    drawTriangleDown(g, x, y, size);
    drawTriangleUp(g, x, y, size / 2);
  }

  private static void drawTriangleDown(Graphics g, int x, int y, int size) {
    double[] angles = {-Math.PI * 2 / 3, Math.PI * 2 / 3, Math.PI * 2};
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

    //g.drawPolygon(xpoints,ypoints,3);
    g.setColor(Color.black);
    g.fillPolygon(xpoints,ypoints,3);
  }

  private static void drawTriangleUp(Graphics g, int x, int y, int size) {
    double[] angles = {-Math.PI * 1 / 3, Math.PI * 1 / 3, Math.PI};
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

    //g.drawPolygon(xpoints,ypoints,3);
    g.setColor(Color.white);
    g.fillPolygon(xpoints,ypoints,3);
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
