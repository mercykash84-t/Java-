//*A comprehensive java swing application with components:label,username label,a checkbox,combobox,a grid layout,click me and menu bar with file-New,Open,Exit options*//
//Reg no:S08-8427-2024
import javax.swing.*;
import java.awt.*;

public class SwingComponentsDemo{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Exercise");
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JPanel namePanel = new JPanel();
        namePanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(10);
        JButton submitBtn = new JButton("Submit");
        namePanel.add(nameField);
        namePanel.add(submitBtn);

        JPanel userPanel = new JPanel();
        userPanel.add(new JLabel("Username:"));
        JTextField userField = new JTextField(10);
        JButton loginBtn = new JButton("Login");
        userPanel.add(userField);
        userPanel.add(loginBtn);

        JPanel optionPanel = new JPanel();
        JCheckBox terms = new JCheckBox("Accept Terms");
        JRadioButton male = new JRadioButton("Male");
        JComboBox<String> languages = new JComboBox<>(new String[]{"Java", "Python", "C++"});
        optionPanel.add(terms);
        optionPanel.add(male);
        optionPanel.add(languages);

        JPanel calcPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
                "7","8","9","+",
                "4","5","6","-",
                "1","2","3","*",
                "0",".","=","/"
        };
        for (String text : buttons) {
            calcPanel.add(new JButton(text));
        }

        // Click Me button
        JButton clickMe = new JButton("Click Me");
        clickMe.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "Button Clicked!")
        );
        panel.add(namePanel);
        panel.add(userPanel);
        panel.add(optionPanel);
        panel.add(calcPanel);
        panel.add(clickMe);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}