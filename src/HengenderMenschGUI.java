import javax.swing.*;

public class HengenderMenschGUI {


    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("HengenderMenschGUI");
        frame.setContentPane(new HengenderMenschGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
