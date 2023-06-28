package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

import javax.naming.LimitExceededException;

public class StoreTest {
    public static void main(String[] args) throws Exception {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f);
        try {
            store.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5, dvd6);
        } catch (LimitExceededException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(store);
        store.removeMedia(dvd4);
        System.out.println(store);
    }
}
