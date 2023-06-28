package hust.soict.globalict.aims.screen;

        import hust.soict.globalict.aims.media.DigitalVideoDisc;
        import hust.soict.globalict.aims.media.Media;
        import hust.soict.globalict.aims.store.Store;

        import javax.naming.LimitExceededException;
        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen{
    private JTextField directorTextField;
    private JTextField lengthTextField;

    private DigitalVideoDisc createdDVD;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        JLabel directorLabel = new JLabel("Director:");
        directorTextField = new JTextField(20);

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
        mainPanel.add(lengthLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        mainPanel.add(lengthTextField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
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
        int length = Integer.parseInt(lengthTextField.getText());
        return new DigitalVideoDisc(title, category, director, length, cost);
    }
}
