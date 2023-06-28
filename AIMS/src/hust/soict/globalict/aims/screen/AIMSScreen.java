package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.test.sample.SampleMedia;

import javax.naming.LimitExceededException;

public class AIMSScreen {
    public static void main(String[] args) {
        Store store = new Store();
        SampleMedia sampleMedia = null;
        try {
            sampleMedia = new SampleMedia(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for (Media media : sampleMedia.mediaList) {
            try {
                store.addMedia(media);
            } catch (LimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }
        Cart cart = new Cart();
        new StoreScreen(store, cart);
    }
}
