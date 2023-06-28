package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MediaStore extends JPanel {
    private Cart cart;
    private Media media;
    public MediaStore(Media media, Cart cart){
        this.cart = cart;
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
            JButton playBtn = new JButton("Play");
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
            PlayDialog dialog = new PlayDialog();
            dialog.setVisible(true);
        }
    }
    private class AddToCartBtnListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            cart.addMedia(media);
        }
    }
}
