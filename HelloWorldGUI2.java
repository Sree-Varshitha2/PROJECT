import javax.swing.*;        // For JFrame, JButton, JLabel
import java.awt.event.*;     // For ActionListener, ActionEvent

public class HelloWorldGUI2 {
    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(900, 800); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLayout(null); 

        // Create a JLabel
        JLabel label = new JLabel("");
        label.setBounds(150, 50, 400, 30); 
        frame.add(label);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setBounds(150, 100, 100, 30); 
        frame.add(button);

        // Add action listener to button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); 
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
