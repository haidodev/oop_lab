package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
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

    public Book(){

    }
}
