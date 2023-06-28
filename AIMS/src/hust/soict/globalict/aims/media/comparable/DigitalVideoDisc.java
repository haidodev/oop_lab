package hust.soict.globalict.aims.media.comparable;

import hust.soict.globalict.aims.media.Disc;
import hust.soict.globalict.aims.media.Playable;

public class DigitalVideoDisc extends Disc implements Playable, Comparable<DigitalVideoDisc> {
    private static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) throws Exception {
        super(title, category, director, length, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost) throws Exception {
        this(title, category, null, 0, cost);

    }

    public DigitalVideoDisc(String title) throws Exception {
        this(title, null, null, 0, 0f);
    }



    public DigitalVideoDisc(String title, String category, String director, float cost) throws Exception {
        this(title, category, director, 0, cost);

    }
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());

    }
    @Override
    public String toString(){
        return String.format("DVD#%d - %s - %s - %d:  %.2f$\n",
                getId(),
                getTitle(),
                getCategory(),
                getLength(),
                getCost());
    }

    @Override
    public int compareTo(DigitalVideoDisc o) {
        int titleComparison = this.getTitle().compareTo(o.getTitle());
        if (titleComparison != 0){
            return titleComparison;
        }
        int lengthComparison = Integer.compare(this.getLength(), o.getLength());
        if (lengthComparison != 0){
            return -lengthComparison;
        }
        return Float.compare(this.getCost(), o.getCost());
    }
}

