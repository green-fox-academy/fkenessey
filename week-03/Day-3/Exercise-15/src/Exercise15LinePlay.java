import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise15LinePlay {
  public static void mainDraw(Graphics graphics){
    // reproduce this:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
    int step = 10;
    for (int i = 0; i <= WIDTH; i+=step) {
        drawLine(graphics, 0, i, i + step, WIDTH, Color.green);
        drawLine(graphics, i, 0, WIDTH, i + step, Color.magenta);
      }
    }

  private static void drawLine(Graphics graphics, int x1, int y1, int x2, int y2, Color color) {
    graphics.setColor(color);
    graphics.drawLine(x1, y1, x2, y2);
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
