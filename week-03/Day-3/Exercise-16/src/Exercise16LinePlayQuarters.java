import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise16LinePlayQuarters {
  public static void mainDraw(Graphics graphics){
    // divide the canvas into 4 parts
    // and repeat this pattern in each quarter:
    // [https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/drawing/line-play/r1.png]
    int step = 10;
    for (int i = 0; i <= WIDTH/2; i+=step) {
      drawLine(graphics, WIDTH/2, 0, WIDTH/2, WIDTH, Color.black);
      drawLine(graphics, 0, WIDTH/2, WIDTH, WIDTH/2, Color.black);
    }
    drawLineForLoop(graphics, 0, 0, WIDTH/2, step);
    drawLineForLoop(graphics, WIDTH/2, 0, WIDTH/2, step);
    drawLineForLoop(graphics, 0, WIDTH/2, WIDTH/2, step);
    drawLineForLoop(graphics, WIDTH/2, WIDTH/2, WIDTH/2, step);
  }

  public static void drawLine(Graphics graphics, int x1, int y1, int x2, int y2, Color color) {
    graphics.setColor(color);
    graphics.drawLine(x1, y1, x2, y2);
  }

  public  static void drawLineForLoop(Graphics graphics, int x, int y, int width, int step) {
    for (int j = 0; j <= width; j += step) {
      drawLine(graphics, x, y + j, x + step + j, y + width, Color.green);
      drawLine(graphics, x + j, y, x + width, y+ j + step, Color.magenta);
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
