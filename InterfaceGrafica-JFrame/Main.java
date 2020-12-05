import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;

    private int cont = 0;

    public Main() {
        
        frame = new JFrame();

        button = new JButton("Click me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: 0");


        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args)
    {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        cont++;
        label.setText("Number of clicks: " + cont);
    }

}