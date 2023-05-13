package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class AIMS {
    public static void main(String[] args) {
        Cart order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Avengers", "Action", "Joss Whedon", 143, 19.99f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Inception", "Sci-Fi", "Christopher Nolan", 148, 14.99f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f);

        order.addDigitalVideoDisc(dvd1, dvd2, dvd3);

        order.searchDVD(3);
        order.searchDVD(5);
        order.searchDVD("Star Wars");
        order.searchDVD("Inception");

        System.out.println(order);
        order.removeDigitalVideoDisc(dvd3);

        System.out.println(order);
    }
}
