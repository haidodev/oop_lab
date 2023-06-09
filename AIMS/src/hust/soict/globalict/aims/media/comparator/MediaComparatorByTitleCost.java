package hust.soict.globalict.aims.media.comparator;

import hust.soict.globalict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        int titleComparison = o1.getTitle().compareTo(o2.getTitle());
        if (titleComparison != 0){
            return titleComparison;
        }
        return Float.compare(o1.getCost(), o2.getCost());
    }
}
