import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JTextField textField1;
    private JPasswordField passwordField1;
    public JPanel login;
    private JButton INGRESARButton;

    public form1() {
        INGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = textField1.getText();
                String pass = new String(passwordField1.getPassword());

                if (user.equals("mateo") && pass.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login exitoso");

                    JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(login);
                    topFrame.dispose();

                    JFrame bioFrame = new JFrame("Mi Biografía");
                    bioFrame.setContentPane(new form2().bio);
                    bioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    bioFrame.pack();
                    bioFrame.setLocationRelativeTo(null);
                    bioFrame.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
            }
        }
    });
}}
