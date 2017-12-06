import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Exercise19StarryNight {
  public static void mainDraw(Graphics graphics){
    // draw the night sky:
    // - The background should be black
    // - The stars can be small squares
    // - The stars should have random positions on the canvas
    // - The stars should have random color (some shade of grey)
    drawSquare(graphics, 0, 0, 350, Color.black);
    Color[] starsColor = {Color.gray, Color.lightGray, Color.darkGray};
    int numberOfStars = 100;
    for (int i = 0; i < numberOfStars; i++) {
      drawSquare(graphics, (int)(Math.random()*330), (int)(Math.random()*330), 2, starsColor[(int)(Math.random()*2)]);
    }



  }

  private static void drawSquare(Graphics graphics, int x, int y, int size, Color color) {
    graphics.setColor(color);
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
