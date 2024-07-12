import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 {
    public JPanel bio;
    private JButton SIGUIENTEButton;
    private JTextPane meLlamoBrandonMateoTextPane;

    public form2() {
        SIGUIENTEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(bio);
                topFrame.dispose();

                JFrame frame = new JFrame("Hobbies");
                frame.setContentPane(new form3().hobbie);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
