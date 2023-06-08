package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Media {
    private static int nbDigitalVideoDiscs = 0;
    private String director;
    private int length;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(nbDigitalVideoDiscs + 1, title, category, cost);
        ++nbDigitalVideoDiscs;
        this.director = director;
        this.length = length;
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
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return String.format("DVD#%d - %s - %s - %d:  %.2f$\n",
                getId(),
                getTitle(),
                getCategory(),
                length,
                getCost());
    }
}

