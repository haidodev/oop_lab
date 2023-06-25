package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import hust.soict.globalict.swing.PlayDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MediaStore extends JPanel {
    private Media media;
    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel(media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost =  new JLabel(media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);

        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton addToCartBtn = new JButton("Add to cart");
        addToCartBtn.addActionListener(new AddToCartBtnListener());
        container.add(addToCartBtn);
        if (media instanceof Playable){
            JButton playBtn = new JButton("PLay");
//            PlayBtnListener playBtnListener = ;
            playBtn.addActionListener(new PlayBtnListener());
            container.add(playBtn);
        }
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    private class PlayBtnListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String btn = e.getActionCommand();
            System.out.println(btn);
//            JDialog dialog = new JDialog();
            PlayDialog dialog = new PlayDialog();
            dialog.setVisible(true);
        }
    }
    private class AddToCartBtnListener implements ActionListener {
        private static void appendLineToFile(String lineToAdd) throws IOException {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/Cart.txt", true));
            writer.write(lineToAdd);
            writer.newLine();
            writer.close();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                appendLineToFile(media.getTitle());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
