package hust.soict.globalict.test.sample;

import hust.soict.globalict.aims.media.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SampleMedia {
    private final List<Media> allMediaList = new ArrayList<>();
    public List<Media> mediaList = new ArrayList<>();
    private int nbOfMedia;


    public SampleMedia(int nbOfMedia){
        CompactDisc[] compactDiscList = {
                new CompactDisc("Abbey Road", "Rock", "The Beatles", "The Beatles", 17, 14.99f),
                new CompactDisc("Thriller", "Pop", "Michael Jackson", "Michael Jackson", 9, 12.99f),
                new CompactDisc("Dark Side of the Moon", "Rock", "Pink Floyd", "Pink Floyd", 10, 16.99f),
                new CompactDisc("Back in Black", "Rock", "AC/DC", "AC/DC", 10, 13.99f),
                new CompactDisc("Nevermind", "Rock", "Nirvana", "Nirvana", 13, 11.99f),
                new CompactDisc("The Eminem Show", "Hip Hop", "Eminem", "Eminem", 20, 15.99f),
                new CompactDisc("Rumours", "Rock", "Fleetwood Mac", "Fleetwood Mac", 11, 14.99f),
                new CompactDisc("Born in the USA", "Rock", "Bruce Springsteen", "Bruce Springsteen", 12, 13.99f),
                new CompactDisc("Hotel California", "Rock", "Eagles", "Eagles", 9, 12.99f),
                new CompactDisc("The Joshua Tree", "Rock", "U2", "U2", 11, 15.99f)
        };
        compactDiscList[0].addTrack(new Track("Come Together", 259));
        compactDiscList[0].addTrack(new Track("Something", 181));
        compactDiscList[0].addTrack(new Track("Maxwell's Silver Hammer", 203));

        compactDiscList[1].addTrack(new Track("Wanna Be Startin' Somethin'", 369));
        compactDiscList[1].addTrack(new Track("Beat It", 258));
        compactDiscList[1].addTrack(new Track("Billie Jean", 293));

        compactDiscList[2].addTrack(new Track("Speak to Me", 67));
        compactDiscList[2].addTrack(new Track("Breathe", 163));
        compactDiscList[2].addTrack(new Track("On the Run", 227));

// Add more tracks for CompactDisc object 3...
        compactDiscList[3].addTrack(new Track("Hells Bells", 312));
        compactDiscList[3].addTrack(new Track("Shoot to Thrill", 314));
        compactDiscList[3].addTrack(new Track("Back in Black", 255));
// Add more tracks for CompactDisc object 4...
        compactDiscList[4].addTrack(new Track("Smells Like Teen Spirit", 302));
        compactDiscList[4].addTrack(new Track("In Bloom", 254));
        compactDiscList[4].addTrack(new Track("Come as You Are", 219));
// Add more tracks for CompactDisc object 5...
        compactDiscList[5].addTrack(new Track("Without Me", 284));
        compactDiscList[5].addTrack(new Track("Cleanin' Out My Closet", 288));
        compactDiscList[5].addTrack(new Track("Sing for the Moment", 440));
// Add more tracks for CompactDisc object 6...
        compactDiscList[6].addTrack(new Track("Second Hand News", 156));
        compactDiscList[6].addTrack(new Track("Dreams", 254));
        compactDiscList[6].addTrack(new Track("Never Going Back Again", 138));
// Add more tracks for CompactDisc object 7...
        compactDiscList[7].addTrack(new Track("Born in the U.S.A.", 289));
        compactDiscList[7].addTrack(new Track("Cover Me", 228));
        compactDiscList[7].addTrack(new Track("Dancing in the Dark", 238));
// Add more tracks for CompactDisc object 8...
        compactDiscList[8].addTrack(new Track("Hotel California", 390));
        compactDiscList[8].addTrack(new Track("New Kid in Town", 325));
        compactDiscList[8].addTrack(new Track("Life in the Fast Lane", 292));
// Add more tracks for CompactDisc object 9...
        compactDiscList[9].addTrack(new Track("Where the Streets Have No Name", 356));
        compactDiscList[9].addTrack(new Track("I Still Haven't Found What I'm Looking For", 275));
        compactDiscList[9].addTrack(new Track("With or Without You", 296));

        DigitalVideoDisc[] dvdList = {
                new DigitalVideoDisc("The Shawshank Redemption", "Drama", "Frank Darabont", 142, 9.99f),
                new DigitalVideoDisc("The Godfather", "Crime", "Francis Ford Coppola", 175, 11.99f),
                new DigitalVideoDisc("Pulp Fiction", "Crime", "Quentin Tarantino", 154, 10.99f),
                new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 12.99f),
                new DigitalVideoDisc("Fight Club", "Drama", "David Fincher", 139, 9.99f),
                new DigitalVideoDisc("Inception", "Action", "Christopher Nolan", 148, 13.99f),
                new DigitalVideoDisc("The Matrix", "Action", "The Wachowskis", 136, 10.99f),
                new DigitalVideoDisc("Goodfellas", "Crime", "Martin Scorsese", 146, 11.99f),
                new DigitalVideoDisc("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", "Peter Jackson", 178, 12.99f),
                new DigitalVideoDisc("Forrest Gump", "Drama", "Robert Zemeckis", 142, 9.99f)
        };
        Book book1 = new Book("The Great Gatsby", "Fiction", 12.99f);
        book1.addAuthor("F. Scott Fitzgerald");
        book1.addAuthor("Ernest Hemingway");

        Book book2 = new Book("To Kill a Mockingbird", "Fiction", 10.99f);
        book2.addAuthor("Harper Lee");

        Book book3 = new Book("1984", "Fiction", 9.99f);
        book3.addAuthor("George Orwell");

        Book book4 = new Book("Pride and Prejudice", "Fiction", 11.99f);
        book4.addAuthor("Jane Austen");

        Book book5 = new Book("The Hobbit", "Fantasy", 14.99f);
        book5.addAuthor("J.R.R. Tolkien");

        Book book6 = new Book("Harry Potter and the Sorcerer's Stone", "Fantasy", 13.99f);
        book6.addAuthor("J.K. Rowling");

        Book book7 = new Book("The Catcher in the Rye", "Fiction", 10.99f);
        book7.addAuthor("J.D. Salinger");

        Book book8 = new Book("The Lord of the Rings", "Fantasy", 19.99f);
        book8.addAuthor("J.R.R. Tolkien");

        Book book9 = new Book("The Chronicles of Narnia", "Fantasy", 16.99f);
        book9.addAuthor("C.S. Lewis");

        Book book10 = new Book("Gone with the Wind", "Historical Fiction", 15.99f);
        book10.addAuthor("Margaret Mitchell");
        Book[] bookList = {book1, book2, book3, book4, book5, book6, book7, book8, book9, book10};
        for (int i = 0; i < 10; ++i){
            allMediaList.add(compactDiscList[i]);
            allMediaList.add(dvdList[i]);
            allMediaList.add(bookList[i]);
        }
        for (int i = 0; i < Math.min(nbOfMedia, 30); ++i){
            mediaList.add(allMediaList.get(i));
        }
        this.nbOfMedia = nbOfMedia;

    }
    public SampleMedia(){
        this(0);
    }
    public Media getNext(){
        if (nbOfMedia >= 30) return null;
        mediaList.add(allMediaList.get(nbOfMedia));
        return allMediaList.get(nbOfMedia++);
    }
}
