package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.test.sample.SampleMedia;

public class AIMSScreen {
    public static void main(String[] args) {
        Store store = new Store();
        SampleMedia sampleMedia = new SampleMedia(10);
        for (Media media : sampleMedia.mediaList) {
            store.addMedia(media);
        }
        Cart cart = new Cart();
        new StoreScreen(store, cart);
    }
}
