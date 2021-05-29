import javax.swing.*;
import java.awt.*;

public class Button {

    public void go() {
//        JFrame frame = new JFrame();
//        JButton button = new JButton("EAST");
//        JButton button1 = new JButton("WEST");
//        JButton button2 = new JButton("NORTH");
//        JButton button3 = new JButton("SOUTH");
//        JButton button4 = new JButton("CENTER");
//
//        frame.getContentPane().add(BorderLayout.EAST, button);
//        frame.getContentPane().add(BorderLayout.WEST, button1);
//        frame.getContentPane().add(BorderLayout.NORTH, button2);
//        frame.getContentPane().add(BorderLayout.SOUTH, button3);
//        frame.getContentPane().add(BorderLayout.CENTER, button4);
//        frame.setSize(200,200);
//        frame.setVisible(true);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        JButton button = new JButton("Shock me");
        JButton button1 = new JButton("bliss");
        JButton button2 = new JButton("huh?");

        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Button button = new Button();
        button.go();
    }
}
