import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    public JPanel hobbie;
    private JButton VOLVERButton;
    private JLabel imagen;

    public form3() {
        VOLVERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(hobbie);
                topFrame.dispose();

                JFrame bioFrame = new JFrame("Mi Biografía");
                bioFrame.setContentPane(new form2().bio);
                bioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                bioFrame.pack();
                bioFrame.setLocationRelativeTo(null);
                bioFrame.setVisible(true);

            }
        });
    }
}
