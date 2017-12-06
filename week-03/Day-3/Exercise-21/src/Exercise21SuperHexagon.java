import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise21SuperHexagon {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/super-hexagon/r6.gif]
    int size = 40;
    int unit = size / 4;
    int numberOfLines = 7;
    int indentx1 = (WIDTH / 2) - (unit * 11);
    int indenty1 = (WIDTH / 2) - (unit * 8);
    for (int i = 0; i < (numberOfLines / 2) + 1; i++) {
      for (int j = 0; j < 4 + i; j++) {
        drawHexagon(graphics,indentx1 + i * (3 * unit),indenty1 + j * size , unit, Color.green);
      }
      indenty1-=(unit * 2);
    }
    int indentx2 = indentx1 + (unit * 12);
    int indenty2 = indenty1 + (unit * 4);
    for (int i = 0; i < (numberOfLines / 2); i++) {
      for (int j = 0; j < 6 - i; j++) {
        drawHexagon(graphics,indentx2 + i * (3 * unit),indenty2 + j * size , unit, Color.green);
      }
      indenty2+=(unit * 2);
    }
  }

  private static void drawHexagon(Graphics graphics, int x, int y, int unit, Color color) {
    graphics.setColor(color);
    int xcpoints[] = {x, x + unit, x + (3 * unit), x + (4 * unit), x + (3 * unit), x + unit};
    int ycpoints[] = {y + (2 * unit), y + (4 * unit), y + (4 * unit), y + (2 * unit), y, y};
    int npoints = 6;

    graphics.drawPolygon(xcpoints, ycpoints, npoints);
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
