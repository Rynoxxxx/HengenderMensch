import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class HengenderMenschGUI {


    private JPanel mainPanel;
    private JTextField strichFeld;
    private JTextField buchstabenEingabe;
    private JLabel titel;
    private JTextField wortEingabe;
    private JButton stricheGenerierenButton;

    String wort;
    String [] buchstabe;
    public HengenderMenschGUI() {

        stricheGenerierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wort = wortEingabe.getText();
                for (int i=0; i<wort.length();i++){
                    strichFeld.setText(strichFeld.getText()+"- ");
                }
                wortEingabe.setVisible(false);
                stricheGenerierenButton.setVisible(false);
            }
        });

        buchstabenEingabe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                strichFeld.setText("");
                buchstabe= new String [wort.length()];
                for(int i=0; i<buchstabe.length; i++){

                    buchstabe[i]="-";
                    strichFeld.setText(strichFeld.getText()+buchstabe[i]+" ");
                }




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
