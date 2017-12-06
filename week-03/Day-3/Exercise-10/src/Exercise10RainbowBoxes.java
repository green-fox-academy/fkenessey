import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise10RainbowBoxes {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.
    Color[] colorOptions = {Color.blue, Color.yellow, Color.red, Color.orange, Color.green};
    int j = 0;
    for (int i = HEIGHT; i > 0 ; i-=25) {
      squareDraw(graphics,i, colorOptions[j]);
      if (j == colorOptions.length-1) {
        j = 0;
      } else {
        j++;
      }
    }
  }

  private static void squareDraw(Graphics graphics, int size, Color color) {
    graphics.setColor(color);
    graphics.fillRect((WIDTH / 2) - (size / 2), (HEIGHT / 2) - (size / 2), size, size);
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
