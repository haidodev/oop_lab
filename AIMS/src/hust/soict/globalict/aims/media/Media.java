package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.comparator.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TOTAL_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TOTAL = new MediaComparatorByCostTitle();
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
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
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Media media)){
            return false;
        }
        return title.equals(media.getTitle());
    }
}
