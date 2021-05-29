package swing;

import javax.swing.*;
import java.awt.*;

public class Animation {
    JFrame frame;
    int x = 20;
    int y = 50;

    public static void main(String[] args) throws InterruptedException {
        Animation animation = new Animation();
        animation.go();
    }

    public void go() throws InterruptedException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(300,300);
        frame.setVisible(true);
        for (int i = 0; i < 40; i++) {
            Thread.sleep(10);
            frame.repaint();
            x = x + 5;
            y = y + 5;
        }

    }

    class MyDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.green);
            g.fillOval(x,y,50,50);
        }
    }
}
