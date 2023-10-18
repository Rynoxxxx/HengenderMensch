import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HengenderMenschGUI {


    private JPanel mainPanel;
    private JTextField strichFeld;
    private JTextField buchstabenEingabe;
    private JLabel titel;
    private JTextField wortEingabe;
    private JButton stricheGenerierenButton;
    private JButton buchstabenCheck;
    private JTextArea textArea1;
    private JTable table1;

    String wort;
    String[] buchstabe, striche;

    public HengenderMenschGUI() {
        buchstabenCheck.setVisible(false);
        stricheGenerierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!wortEingabe.getText().contains(" ")) {
                    wort = wortEingabe.getText();
                    for (int i = 0; i < wort.length(); i++) {
                        strichFeld.setText(strichFeld.getText() + "- ");
                    }
                    wortEingabe.setVisible(false);
                    stricheGenerierenButton.setVisible(false);
                    buchstabenCheck.setVisible(true);

                    strichFeld.setText("");
                    striche = new String[wort.length()];
                    for (int i = 0; i < striche.length; i++) {
                        striche[i] = "-";
                        strichFeld.setText(strichFeld.getText() + striche[i] + " ");
                        buchstabe = new String[wort.length()];

                    }
                }
                else {
                    wortEingabe.setText("");
                }
            }
        });


        buchstabenCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                strichFeld.setText("");
                for (int i = 0; i < wort.length(); i++) {
                    buchstabe[i] = String.valueOf(wort.charAt(i));

                    if (buchstabe[i].toLowerCase().equals(buchstabenEingabe.getText().toLowerCase())) {
                        striche[i] = buchstabe[i];
                    }
                        strichFeld.setText(strichFeld.getText() + striche[i] + " ");


                }
            buchstabenEingabe.setText("");
            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HengenderMenschGUI");
        frame.setContentPane(new HengenderMenschGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
