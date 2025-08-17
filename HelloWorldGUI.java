
import javax.swing.*;   // Import Swing components
import java.awt.event.*; // Import event handling

public class HelloWorldGUI {

    public static void main(String[] args) {
        // Always create GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame (window)
            JFrame frame = new JFrame("Hello World GUI");
            frame.setSize(400, 200); // Set window size
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
            frame.setLayout(null); // Use null layout for simplicity

            // Create a JLabel
            JLabel label = new JLabel("Hello, World!");
            label.setBounds(150, 50, 150, 30); // Position label in frame
            frame.add(label);

            // Create a JButton
            JButton button = new JButton("Click Me");
            button.setBounds(150, 100, 100, 30); // Position button in frame
            frame.add(button);

            // Add action listener to button
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    label.setText("Button Clicked!"); // Change label text on click
                }
            });

            // Make the frame visible
            frame.setVisible(true);
        }); // <- close invokeLater properly
    } // <- close main method
} // <- close class
