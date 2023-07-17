import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {


    JFrame frame = new JFrame();
    JButton button = new JButton("DONTCLICKTHIS");

    JButton button2 = new JButton("Upgrade");

    JProgressBar bar = new JProgressBar();

    Calculator() {

        button2.setBounds(320, 500, 269, 69);
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame.add(button2);

        button.setBounds(320, 420, 269, 69);
        button.setFocusable(false);
        button.addActionListener(this);

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.setLayout(null);
        frame.setVisible(true);

        bar.setMinimum(0);
        bar.setMaximum(10);
        bar.setSize(328, 32);
        bar.setLocation(0, 0);


        frame.add(bar);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            bar.setValue(bar.getValue() + 1);
            if (bar.getValue()==bar.getMaximum()-1) {
                button2.setBackground(Color.GREEN);
            } else {
                button2.setBackground(Color.RED);
            }
        }
        if ((bar.getValue()==bar.getMaximum())) frame.dispose();
        if (e.getSource() == button2) {
            if (bar.getValue() > 8&&bar.getValue()<10) {
                bar.setMaximum(20);
                bar.setSize(900, 32);
                button2.setBackground(Color.RED);


            }
        }
        if (e.getSource() == button2) {
            if (bar.getValue() > 18 && bar.getValue() == bar.getMaximum() - 1) {
                bar.setMaximum(bar.getMaximum() + 10);
                bar.setSize(900, bar.getHeight() + 32);
                button2.setBackground(Color.RED);

                }
            else {
                bar.setValue(bar.getValue()/2);
            }
        }
    }
}