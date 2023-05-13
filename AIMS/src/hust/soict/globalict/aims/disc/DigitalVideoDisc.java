package hust.soict.globalict.aims.disc;


public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        ++nbDigitalVideoDiscs;
        this.id = nbDigitalVideoDiscs;
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



    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public String toString(){
        return String.format("DVD#%d - %s - %s - %d:  %.2f$\n",
                id,
                title,
                category,
                length,
                cost);
    }
}

