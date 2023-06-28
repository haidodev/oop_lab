package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public abstract class AddItemToStoreScreen extends JDialog {
    protected JTextField titleTextField;
    protected JTextField categoryTextField;
    protected JTextField costTextField;
    protected GridBagConstraints gbc = new GridBagConstraints();

    protected JPanel mainPanel = new JPanel();
    AddItemToStoreScreen(Store store){
        setSize(400, 250);
        setLocationRelativeTo(null);
        mainPanel.setLayout(new GridBagLayout());
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel titleLabel = new JLabel("Title:");
        titleTextField = new JTextField(20);

        JLabel categoryLabel = new JLabel("Category:");
        categoryTextField = new JTextField(20);

        JLabel costLabel = new JLabel("Cost:");
        costTextField = new JTextField(20);

        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(titleLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        mainPanel.add(titleTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(categoryLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        mainPanel.add(categoryTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(costLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        mainPanel.add(costTextField, gbc);
    }
    protected abstract Media createMedia() throws Exception;
}