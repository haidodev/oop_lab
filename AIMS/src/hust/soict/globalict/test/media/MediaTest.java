package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<>();
        Book book = new Book(1234, "The Great Gatsby", "Fiction", 12.99f);
        book.addAuthor("F. Scott Fitzgerald");
        book.addAuthor("Ernest Hemingway");
        mediae.add(book);
        mediae.add(new CompactDisc(1, "Abbey Road", "Rock", "The Beatles", "The Beatles", 47, 14.99f));
        mediae.add(new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f));
        for (Media media : mediae){
            System.out.print(media);
        }
        System.out.println("---");
        mediae.sort(Media.COMPARE_BY_COST_TOTAL);
        for (Media media : mediae){
            System.out.print(media);
        }
        System.out.println("---");
        mediae.sort(Media.COMPARE_BY_TOTAL_COST);
        for (Media media : mediae){
            System.out.print(media);
        }
    }
}
