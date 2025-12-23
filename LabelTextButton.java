//A program that displays a window containing Label,Text,Button.
//Reg no: S08-8427-2024
import javax.swing.*;

public class LabelTextButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Structure");
        JPanel panel = new JPanel();

        JLabel label = new JLabel("Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}