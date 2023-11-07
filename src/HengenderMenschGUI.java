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
    private JTextField anzahlFalsch;
    private JLabel anzahlFehler;

    String wort;
    String[] buchstabe, striche;
    int fehler;
    boolean figurErstellen = false;
    boolean test=false;

    public HengenderMenschGUI() {
        buchstabenCheck.setVisible(false);
        anzahlFalsch.setVisible(false);

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
                    anzahlFalsch.setVisible(true);


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
                if(wort.indexOf(buchstabenEingabe.getText())==-1){
                    figurErstellen=true;
                }

                if(figurErstellen==true) {
                    fehler = fehler + 1;
                    if (fehler == 1) {
                        textArea1.setText("\r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n|     |     ");
                    } else if (fehler == 2) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n" +
                                " \r\n _____      " +
                                " \r\n|     |     ");
                    } else if (fehler == 3) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 4) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 5) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 6) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n o  |       " +
                                " \r\n    |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 7) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n o  |       " +
                                " \r\n |  |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 8) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n o  |       " +
                                " \r\n⌈|  |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 9) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n o  |       " +
                                " \r\n⌈|⌉ |       " +
                                " \r\n    |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                    } else if (fehler == 10) {
                        textArea1.setText("\n" +
                                " \r\n" +
                                " \r\n ____       " +
                                " \r\n |  |       " +
                                " \r\n o  |       " +
                                " \r\n⌈|⌉ |       " +
                                " \r\n \\ |       " +
                                " \r\n ___|_      " +
                                " \r\n|     |     ");
                        //spiel zuende-----------------------------------------------
                    }
                    figurErstellen=false;
                }
                anzahlFalsch.setText("Anzahl Fehler: "+fehler);
                buchstabenEingabe.setText("");
                if(fehler==10){
                    buchstabenEingabe.setText("Verloren!");
                    buchstabenEingabe.setEditable(false);
                    buchstabenCheck.disable();
                }
                if(strichFeld.getText().indexOf("-")==-1){
                    buchstabenEingabe.setText("Gewonnen!");
                    buchstabenEingabe.setEditable(false);
                    buchstabenCheck.disable();
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
