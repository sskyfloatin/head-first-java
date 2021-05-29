package swing;

import javax.swing.*;
import java.awt.*;

public class Animate {

    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        Animate gui = new Animate();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500, 270);
        frame.setVisible(true);

        for (int i = 0; i < 124; i++, y++, x++) {
            x++;
            drawP.repaint();
            try {
                Thread.sleep(40);
            } catch (Exception ex) {
            }
        }
    }
    class MyDrawP extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.red);
            g.fillRect(x,y,500-x * 2,250-y * 2);
        }
    }
}
