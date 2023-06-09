package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<>();

    public void addAuthor(String authorName){
        if (authors.contains(authorName)){
            System.out.println("The author " + authorName + " is already listed.");
            return;
        }
        authors.add(authorName);
    }
    public void removeAuthor(String authorName){
        if (!authors.contains(authorName)){
            System.out.println("Not found author " + authorName);
            return;
        }
        authors.remove(authorName);
    }

    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);

    }
    public String toString(){
        return String.format("Book#%d - %s - %s - %s:  %.2f$\n",
                getId(),
                getTitle(),
                getCategory(),
                String.join(", ", authors),
                getCost());
    }
}
