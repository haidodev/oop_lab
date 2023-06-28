package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.exception.PlayerException;
import hust.soict.globalict.aims.interaction.CLI;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;
import hust.soict.globalict.test.sample.SampleMedia;

import javax.naming.LimitExceededException;
import java.util.Collections;
import java.util.List;

public class AIMS {
    private final SampleMedia sampleMedia = new SampleMedia(6);
    private final Cart cart = new Cart();
    private final Store store = new Store();

    public AIMS (List<Media> allProd) throws Exception {
        for (Media media : allProd) {
            try {
                store.addMedia(media);
            } catch (LimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public AIMS() throws Exception {
        for (Media media : sampleMedia.mediaList) {
            try {
                store.addMedia(media);
            } catch (LimitExceededException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void test() throws Exception {
        Cart order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f);

        order.addMedia(dvd1, dvd2, dvd3);

        order.searchMedia(3);
        order.searchMedia(5);
        order.searchMedia("Star Wars");
        order.searchMedia("Inception");

        System.out.println(order);
        order.removeMedia(dvd3);

        System.out.println(order);
    }
    private void viewStore(){
        int number = -1;
        while (number != 0){
            System.out.println(store);
            CLI.storeMenu();
            number = CLI.readInput(4);
            switch (number) {
                case 1 -> viewMediaDetail();
                case 2 -> addMediaToCart();
                case 3 -> playMedia();
                case 4 -> showCart();
            }
        }
    }
    private void viewMediaDetail(){
        String mediaTitle = CLI.readMediaName();
        if (!store.searchMedia(mediaTitle)) return;
        Media media = store.getMedia(mediaTitle);
        int number = -1;
        while (number != 0){
            CLI.mediaDetailsMenu(media instanceof Disc);
            number = media instanceof Disc ? CLI.readInput(2) : CLI.readInput(1);
            switch (number) {
                case 1 -> addMediaToCart(media);
                case 2 -> playMedia(media);
            }
        }
    }
    private void addMediaToCart(Media media){
        cart.addMedia(media);
    }
    private void addMediaToCart(){
        String mediaTitle = CLI.readMediaName();
        if (!store.searchMedia(mediaTitle)) return;
        Media media = store.getMedia(mediaTitle);
        addMediaToCart(media);
    }
    private void playMedia(Media media){
        if (!(media instanceof Disc)){
            System.out.println(media + " is not playable.");
            return;
        }
        if (media instanceof CompactDisc) {
            try {
                ((CompactDisc) media).play();
            } catch (PlayerException e) {
                throw new RuntimeException(e);
            }
        }
        if (media instanceof DigitalVideoDisc) {
            try {
                ((DigitalVideoDisc) media).play();
            } catch (PlayerException e) {
                throw new RuntimeException(e);
            }
        }

    }
    private void playMedia(){
        String mediaTitle = CLI.readMediaName();
        if (!store.searchMedia(mediaTitle)) return;
        Media media = store.getMedia(mediaTitle);
        playMedia(media);
    }

    private void updateStore(){
        System.out.println(cart);
        int number = -1;
        while (number != 0){
            CLI.updateStoreMenu();
            number = CLI.readInput(2);
            switch (number) {
                case 1 -> addMediaToStore();
                case 2 -> removeMediaFromStore();
            }

        }
    }
    private void addMediaToStore(){
        try {
            store.addMedia(sampleMedia.getNext());
        } catch (LimitExceededException e) {
            System.out.println(e.getMessage());
        }
        CLI.addItem();
    }
    private void showCart(){
        int number = -1;
        while (number != 0){
            System.out.println(cart);
            CLI.cartMenu();
            number = CLI.readInput(5);
            switch (number) {
                case 1 -> filterMedia();
                case 2 -> sortMedia();
                case 3 -> removeMediaFromCart();
                case 4 -> playMedia();
                case 5 -> placeOrder();
            }

        }

    }
    private void filterMedia(){
        int number = -1;
        while (number != 0){
            CLI.filterMediaMenu();
            number = CLI.readInput(5);
            switch (number) {
                case 1 -> filterMediaById();
                case 2 -> filterMediaByTitle();
            }

        }
    }
    private void filterMediaById(){
        int id = CLI.readInput();
        if (!cart.searchMedia(id)) return;
        Media media = cart.getMedia(id);
        System.out.println(media);
    }
    private void filterMediaByTitle(){
        String mediaTitle = CLI.readMediaName();
        if (!cart.searchMedia(mediaTitle)) return;
        Media media = cart.getMedia(mediaTitle);
        System.out.println(media);
    }
    private void sortMedia(){
        int number = -1;
            CLI.sortMediaMenu();
            number = CLI.readInput(5);
            switch (number) {
                case 1 -> cart.sortMediaByCostTitle();
                case 2 -> cart.sortMediaByTitleCost();
            }

    }

    private void removeMediaFromStore(){
        String mediaTitle = CLI.readMediaName();
        if (!store.searchMedia(mediaTitle)) return;
        Media media = store.getMedia(mediaTitle);
        cart.removeMedia(media);
    }
    private void removeMediaFromCart(){
        String mediaTitle = CLI.readMediaName();
        if (!cart.searchMedia(mediaTitle)) return;
        Media media = cart.getMedia(mediaTitle);
        cart.removeMedia(media);
    }
    private void placeOrder(){
        CLI.placeOrder();
        cart.removeAllMedia();
    }
    public void runAIMS(){
        int number = -1;
        while (number != 0){
            CLI.showMenu();
            number = CLI.readInput(3);
            switch (number) {
                case 1 -> viewStore();
                case 2 -> updateStore();
                case 3 -> showCart();
            }
        }
    }
    public static void main(String[] args) {
        AIMS aims = null;
        try {
            aims = new AIMS();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        aims.runAIMS();

    }
}
