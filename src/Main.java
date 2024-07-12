import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("LOGIN");
        frame.setContentPane(new form1().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        frame.pack();
    }
}