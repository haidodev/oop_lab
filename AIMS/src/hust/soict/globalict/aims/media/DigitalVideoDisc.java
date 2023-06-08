package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc {
    private static int nbDigitalVideoDiscs = 0;
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, director, length, cost);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);

    }

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0f);
    }



    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);

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
}

