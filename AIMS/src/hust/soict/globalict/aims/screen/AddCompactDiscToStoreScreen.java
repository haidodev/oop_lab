package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import javax.naming.LimitExceededException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
    private JTextField directorTextField;
    private JTextField artistTextField;
    private JTextField lengthTextField;

    private DigitalVideoDisc createdDVD;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        JLabel directorLabel = new JLabel("Director:");
        directorTextField = new JTextField(20);

        JLabel artistLabel = new JLabel("Artist:");
        artistTextField = new JTextField(20);

        JLabel lengthLabel = new JLabel("Length:");
        lengthTextField = new JTextField(20);

        JButton createButton = new JButton("Create DVD");

        gbc.gridx = 0;
        gbc.gridy = 3;
        mainPanel.add(directorLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        mainPanel.add(directorTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        mainPanel.add(artistLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(artistTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        mainPanel.add(lengthLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        mainPanel.add(lengthTextField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(createButton, gbc);

        getContentPane().add(mainPanel);
        setVisible(true);
        setResizable(false);
        createButton.addActionListener(e -> {
            try {
                store.addMedia(createMedia());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());

            }
        });
    }
    @Override
    protected Media createMedia() throws Exception {
        String title = titleTextField.getText();
        String category = categoryTextField.getText();
        float cost = Float.parseFloat(costTextField.getText());
        String director = directorTextField.getText();
        String artist = "";
        int length = Integer.parseInt(lengthTextField.getText());
        return new CompactDisc(title, category, director,artist, length, cost);
    }
}
