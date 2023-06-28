package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.media.comparator.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.comparator.MediaComparatorByTitleCost;

import java.util.Comparator;

public abstract class Media {
    private static int nbMedias = 0;
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public Media(String title, String category, float cost) throws Exception {
        if (cost <= 0) throw new Exception("ERROR: The cost of a media cannot be smaller than 0!");
        ++nbMedias;
        this.id = nbMedias;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    public int getId() {
        return id;
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
