import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends Frame implements ActionListener {

    Fortunes fortunes = new Fortunes();
    ImageIcon otherlogo = new ImageIcon("res/logo.png");

    public JTextField textField;
    public String input, output;
    public JButton button;

    public GUI() {
        render();
    }

    @Override
    public void render() {
        // VARIABLES
        JFrame FRAME;
        JPanel PANEL;
        JLabel title;
        JLabel text;
        JLabel img;

        // JAVA WINDOW
        FRAME = new JFrame("Fortune-Teller");
        FRAME.setSize(600,600);
        FRAME.setLocationRelativeTo(null);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setResizable(false);

        // JAVA PANEL
        PANEL = new JPanel();
        PANEL.setBackground(Color.lightGray);


        // JAVA LABELS
        title = new JLabel("<html><center>FORTUNE<br>TELLER</html>");
        title.setFont(new Font("Helvetica Neue", Font.BOLD,85));
        text = new JLabel("Ask a Yes or No Question:");
        text.setFont(new Font("Helvetica Neue", Font.BOLD, 38));


        // INPUT
        button = new JButton("ASK");
        button.setPreferredSize(new Dimension(75,35));
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(400,30));
        textField.setFont(new Font("Helvetica Neue", Font.PLAIN, 20));
        textField.addActionListener(this);


        // IMG
        ImageIcon logo = new ImageIcon("res/8-ball.png");
        img = new JLabel(logo);


        // IMPLEMENTS
        PANEL.add(title);
        PANEL.add(img);
        PANEL.add(text);
        PANEL.add(textField);
        PANEL.add(button);
        FRAME.add(PANEL, BorderLayout.CENTER);
        FRAME.setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            // ALGORITHM 2 --> RETURNS CERTAIN TEXT INTO GUI BASED ON RESPONSE GIVEN
            input = textField.getText();
            if (input.equals("")) {
                JOptionPane.showMessageDialog(null, "Hello, is anyone there...",
                        "Fortune Teller", JOptionPane.INFORMATION_MESSAGE, otherlogo);
            } else {
                output = fortunes.getOutput();
                JOptionPane.showMessageDialog(null, "Answer: " + output,
                        "Fortune Teller", JOptionPane.INFORMATION_MESSAGE, otherlogo);
            }
        }
    }
}
