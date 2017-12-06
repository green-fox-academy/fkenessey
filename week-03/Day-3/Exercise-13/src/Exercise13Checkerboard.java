import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise13Checkerboard {
  public static void mainDraw(Graphics graphics){
    // fill the canvas with a checkerboard pattern.
    int size = 20;
    for (int i = 0; i < HEIGHT; i+=size) {
      if (i % (2 * size) == 0) {
        for (int j = 0; j < WIDTH; j += 2 * size) {
          drawSquare(graphics, j, i, size);
        }
      } else {
        for (int j = size; j < WIDTH; j += 2 * size) {
          drawSquare(graphics, j, i, size);
        }
      }
    }
  }

  public static void drawSquare (Graphics graphics, int x, int y, int size) {
    graphics.setColor(Color.black);
    graphics.fillRect(x, y, size, size);
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
