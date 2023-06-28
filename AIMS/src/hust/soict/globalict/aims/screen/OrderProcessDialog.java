package hust.soict.globalict.aims.screen;

import javax.swing.*;

public class OrderProcessDialog extends JDialog {
    public OrderProcessDialog(){
        super(); // Set the title and modal property
        setTitle("");
        setSize(400, 150);
        setLocationRelativeTo(null); // Center the dialog on the screen
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add any other components or customizations to the dialog
        JLabel label = new JLabel("An Order has been processed!");
        label.setAlignmentX(CENTER_ALIGNMENT);
        panel.add(Box.createVerticalGlue());
        panel.add(label);
        panel.add(Box.createVerticalGlue());

        //getContentPane().add(label);
        setContentPane(panel);
    }
}
