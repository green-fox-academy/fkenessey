import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise07FillWithRectangles {
  public static void mainDraw(Graphics graphics){
    // draw four different size and color rectangles.
    graphics.setColor(Color.yellow);
    graphics.fillRect(10,10,10,10);
    graphics.setColor(Color.green);
    graphics.fillRect(15,15,20,20);
    graphics.setColor(Color.blue);
    graphics.fillRect(35,35,40,40);
    graphics.setColor(Color.red);
    graphics.fillRect(75,75,80,80);

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
