import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class telalogin implements ActionListener {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label_login;
    private JLabel label_senha;
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    

    public telalogin() {

        frame = new JFrame();
        txtLogin = new JTextField();
        txtSenha = new JPasswordField();
        
        label_login = new JLabel("Login");
        label_senha = new JLabel("Senha");

        button = new JButton();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label_login);
        panel.add(txtLogin);
        panel.add(label_senha);
        panel.add(txtSenha);
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Tela Login");
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);

    }
 
     public static void main(String[] args) {
         new telalogin();       
     }

     @Override
     public void actionPerformed(ActionEvent e) {
       
     }
 }