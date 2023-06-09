package hust.soict.globalict.aims.media.comparator;

import hust.soict.globalict.aims.media.Media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media o1, Media o2) {
        int costComparison = Float.compare(o1.getCost(), o2.getCost());
        if (costComparison != 0){
            return costComparison;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
