package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class JList1 implements ListSelectionListener {

    JList list;

    String [] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};

    public static void main(String[] args) {
        JList1 jList1 = new JList1();
        jList1.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        list = new JList(listEntries);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(scrollPane);
        frame.getContentPane().add(BorderLayout.CENTER,panel);

        list.setVisibleRowCount(5);

        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(this);

        frame.setVisible(true);
        frame.setSize(350,250);
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        if(!lse.getValueIsAdjusting()) {
               String selection = (String) list.getSelectedValue();
            System.out.println("Selected string is " + selection);
        }
    }
}
